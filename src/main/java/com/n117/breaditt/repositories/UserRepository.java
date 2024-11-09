package com.n117.breaditt.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n117.breaditt.models.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {
    
}
