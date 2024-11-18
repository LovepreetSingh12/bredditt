package com.n117.breaditt.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n117.breaditt.models.SubRedditModel;

public interface SubRedditRepository extends MongoRepository<SubRedditModel, String>{

}
