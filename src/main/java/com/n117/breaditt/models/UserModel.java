package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class UserModel {

    @Id
    private String userId;
    private String userName;
    private String name;
    private String about;
    private Integer age; // TODO : Integer or int?
    private String email;
    private String phoneNumber; // TODO : String or int? (to include international codes like +34)?
    private String profilePictureUrl;
    private List<String> createdPosts;
    private List<String> savedPosts;
    private List<String> createdComments;
    private List<String> savedComments;
    private List<String> socialMediaLinks;
    private List<String> subredditsJoined;
    private List<String> blockedUsers;

    // Constructor
    public UserModel(String userId, String userName, String name, String about, Integer age, String email, String phoneNumber, String profilePictureUrl, List<String> savedPosts, List<String> createdPosts, List<String> createdComments, List<String> savedComments, List<String> socialMediaLinks, List<String> subredditsJoined, List<String> blockedUsers) {
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.about = about;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePictureUrl = profilePictureUrl;
        this.savedPosts = savedPosts;
        this.createdPosts = createdPosts;
        this.createdComments = createdComments;
        this.savedComments = savedComments;
        this.socialMediaLinks = socialMediaLinks;
        this.subredditsJoined = subredditsJoined;
        this.blockedUsers = blockedUsers;
    }

    // Getters-Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public List<String> getCreatedPosts() {
        return createdPosts;
    }

    public void setCreatedPosts(List<String> createdPosts) {
        this.createdPosts = createdPosts;
    }

    public List<String> getSavedPosts() {
        return savedPosts;
    }

    public void setSavedPosts(List<String> savedPosts) {
        this.savedPosts = savedPosts;
    }

    public List<String> getCreatedComments() {
        return createdComments;
    }

    public void setCreatedComments(List<String> createdComments) {
        this.createdComments = createdComments;
    }

    public List<String> getSavedComments() {
        return savedComments;
    }

    public void setSavedComments(List<String> savedComments) {
        this.savedComments = savedComments;
    }

    public List<String> getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(List<String> socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public List<String> getSubredditsJoined() {
        return subredditsJoined;
    }

    public void setSubredditsJoined(List<String> subredditsJoined) {
        this.subredditsJoined = subredditsJoined;
    }

    public List<String> getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(List<String> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }
}
