package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "comments")
public class CommentModel {

    @Id
    private String commentId;
    private String postId;
    private String userId;
    private int upvotes;
    private int downvotes;
    private String contentUrl;
    private String commentText;
    private List<CommentModel> subComments;

    // Constructor
    public CommentModel(String commentId, String postId, String userId, int upvotes, int downvotes, String contentUrl, String commentText, List<CommentModel> subComments) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.contentUrl = contentUrl;
        this.commentText = commentText;
        this.subComments = subComments;
    }

    // Getters-Setters
    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public List<CommentModel> getSubComments() {
        return subComments;
    }

    public void setSubComments(List<CommentModel> subComments) {
        this.subComments = subComments;
    }
}