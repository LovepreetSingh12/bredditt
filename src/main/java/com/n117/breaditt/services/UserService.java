package com.n117.breaditt.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n117.breaditt.models.UserModel;
import com.n117.breaditt.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    // Fetching all Users
    public List<UserModel> getAllUsers() {
        List<UserModel> res = new ArrayList<>();
        try {
            res = userRepository.findAll();
            logger.info("No. of Users found : " + res.size());
            return res;
        } catch (Exception e) {
            logger.error("Error Fetching all users from Mongodb: ", e);
        }
        return res;
    }

    // Save a new user
    public UserModel createUser(UserModel user) {
        try {
            UserModel savedUser = userRepository.save(user); // TODO : savedUser = user?
            logger.info("User saved: " + savedUser.getUserId());
            return savedUser;
        } catch (Exception e) {
            logger.error("Error saving user to MongoDB: ", e);
            return null;
        }
    }
}
