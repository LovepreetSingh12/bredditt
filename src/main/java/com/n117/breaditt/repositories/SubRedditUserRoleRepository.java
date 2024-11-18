package com.n117.breaditt.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n117.breaditt.models.SubRedditUserRoleModel;

public interface SubRedditUserRoleRepository extends MongoRepository<SubRedditUserRoleModel, String> {
    Optional<SubRedditUserRoleModel> findBySubredditIdAndUserId(String subredditId, String userId);
    List<SubRedditUserRoleModel> findAllBySubredditId(String subredditId);
    List<SubRedditUserRoleModel> findAllByUserId(String userId);   
}