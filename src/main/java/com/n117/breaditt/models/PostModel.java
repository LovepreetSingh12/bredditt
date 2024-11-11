package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class PostModel {

    @Id
    private String postId;
    private String userId;
    private String postTitle;
    private String contentUrl;
    private String postText;
    private String subredditId;
    private int upvotes;
    private int downvotes;
    private Boolean isNSFW;

    // Constructor
    public PostModel(String postId, String userId, String postTitle, String contentUrl, String postText, String subredditId, int upvotes, int downvotes, Boolean isNSFW) {
        this.postId = postId;
        this.userId = userId;
        this.postTitle = postTitle;
        this.contentUrl = contentUrl;
        this.postText = postText;
        this.subredditId = subredditId;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.isNSFW = isNSFW;
    }

    // Getters-Setters
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public Boolean getNSFW() {
        return isNSFW;
    }

    public void setNSFW(Boolean NSFW) {
        isNSFW = NSFW;
    }
}
