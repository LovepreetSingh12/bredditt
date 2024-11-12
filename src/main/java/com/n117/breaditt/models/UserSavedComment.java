package com.n117.breaditt.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usersavedcomment")
public class UserSavedComment {

    @Id
    private String id;
    private String userId;
    private List<SavedObjectPairModel> savedCommentId;
}
