package com.n117.breaditt.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n117.breaditt.models.CommentModel;

public interface CommentRepository extends MongoRepository<CommentModel, String> {

}
