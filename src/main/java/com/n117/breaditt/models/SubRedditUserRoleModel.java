package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.n117.breaditt.utils.Roles;

@Document(collection = "subreddit_user_roles")
public class SubRedditUserRoleModel {
    
    @Id
    private String id;
    private String subRedditId;
    private String userId;
    private Roles role;
    
    public SubRedditUserRoleModel(String subRedditId, String userId, Roles role) {
        this.subRedditId = subRedditId;
        this.userId = userId;
        this.role = role;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSubRedditId() {
        return subRedditId;
    }
    public void setSubRedditId(String subRedditId) {
        this.subRedditId = subRedditId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Roles getRole() {
        return role;
    }
    public void setRole(Roles role) {
        this.role = role;
    }
}