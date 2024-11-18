package com.n117.breaditt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.n117.breaditt.models.SubRedditModel;
import com.n117.breaditt.services.SubRedditService;

@RestController
@RequestMapping("/api/breaditt")
public class SubRedditController {


    @Autowired
    private SubRedditService subRedditService;

    public SubRedditController(SubRedditService subRedditService) {
        this.subRedditService = subRedditService;
    }

    //this should be changed after authorization.
    // @UserId should be in Principal after authorization.
    @PostMapping
    public ResponseEntity<?> createSubReddit(@RequestBody SubRedditModel subreddit, @RequestParam String userId) {
        try {
            SubRedditModel response = subRedditService.createSubReddit(subreddit, userId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating SubReddit: " + e.getMessage());
        }
    }

    @PostMapping("/{id}/join")
    public ResponseEntity<?> joinSubReddit(@PathVariable String id, @RequestParam String userId) {
        try {
            subRedditService.joinSubReddit(id, userId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error joining SubReddit: " + e.getMessage());
        }
    }

    @PostMapping("/{id}/moderators")
    public ResponseEntity<?> assignModerator(@PathVariable String id, @RequestBody String userId, @RequestParam String actingUserId) {
        try {
            subRedditService.assignModerator(id, userId, actingUserId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Assigning Moderator: " + e.getMessage());
        }
        
    }
}
