package com.n117.breaditt.services;

import com.n117.breaditt.models.SubRedditModel;
import com.n117.breaditt.models.SubRedditUserRoleModel;
import com.n117.breaditt.repositories.SubRedditRepository;
import com.n117.breaditt.repositories.SubRedditUserRoleRepository;
import com.n117.breaditt.utils.Roles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;
import java.time.Instant;
import java.util.Optional;

@Service
public class SubRedditService {

    @Autowired
    private SubRedditRepository subRedditRepository;

    @Autowired
    private SubRedditUserRoleRepository subRedditUserRoleRepository;

    private static final Logger logger = LoggerFactory.getLogger(SubRedditService.class);

    public SubRedditModel createSubReddit(SubRedditModel subReddit, String userId) {
        try {
            subReddit.setCreatedDate(Instant.now());
            subReddit.setCreatedBy(userId);
            SubRedditModel savedSubReddit = subRedditRepository.save(subReddit);
            SubRedditUserRoleModel ownerRole = new SubRedditUserRoleModel(savedSubReddit.getId(), userId, Roles.OWNER);
            subRedditUserRoleRepository.save(ownerRole);
            return savedSubReddit;
        } catch (Exception e) {
            logger.error("Exception at creating subreddit", e);
            return null;
        }
    }

    public void joinSubReddit(String subRedditId, String userId) {
        try {
            if (subRedditUserRoleRepository.findBySubRedditIdAndUserId(subRedditId, userId).isEmpty()) {
                SubRedditUserRoleModel memberRole = new SubRedditUserRoleModel(subRedditId, userId, Roles.MEMBER);
                subRedditUserRoleRepository.save(memberRole);
            }
        } catch (Exception e) {
            logger.error("Exception at joining subreddit", e);
        }
        
    }

    public void assignModerator(String subRedditId, String userId, String actingUserId) {
        try {
            Optional<SubRedditUserRoleModel> actingUserRole = subRedditUserRoleRepository.findBySubRedditIdAndUserId(subRedditId, actingUserId);
            if (actingUserRole.isPresent() && (actingUserRole.get().getRole().equals(Roles.OWNER) || actingUserRole.get().getRole().equals(Roles.MODERATOR))) {
                SubRedditUserRoleModel moderatorRole = new SubRedditUserRoleModel(subRedditId, userId, Roles.MODERATOR);
                subRedditUserRoleRepository.save(moderatorRole);
            } else {
                throw new AccessDeniedException("Insufficient permissions to assign moderator role.");
            }
        } catch (AccessDeniedException e) {
            e.printStackTrace();
            logger.error("Error at assinging Moderator", e);
        }
    }
}
