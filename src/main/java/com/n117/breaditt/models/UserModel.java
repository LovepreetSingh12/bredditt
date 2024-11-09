package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModel {

    @Id
    public String UserId;
    public String UserName;
    public String Name;
    public String About;
    public int Age;
    public String Email;
    public String PhoneNumber;

    //constructors
    public UserModel() {

    }
    public UserModel(String name, String about, int age, String email, String phoneNumber) {
        Name = name;
        About = about;
        Age = age;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    //Getter-Setters
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAbout() {
        return About;
    }
    public void setAbout(String about) {
        About = about;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
