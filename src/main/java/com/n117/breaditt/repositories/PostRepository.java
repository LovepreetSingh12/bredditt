package com.n117.breaditt.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n117.breaditt.models.PostModel;

public interface PostRepository extends MongoRepository<PostModel, String> {

}
