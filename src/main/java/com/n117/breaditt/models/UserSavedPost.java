package com.n117.breaditt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "usersavedposts")
public class UserSavedPost {

    @Id
    private String id;
    private String userId;
    private List<SavedObjectPairModel> savedPostId;
}
