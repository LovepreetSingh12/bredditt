package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

    @Id
    private String userId;
    private String userName;
    private String name;
    private String about;
    private int age;
    private String email;
    private String phoneNumber;

    //constructors
    public UserModel() {

    }
    public UserModel(String userId, String userName, String name, String about, int age, String email, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.about = about;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getter-Setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
}
