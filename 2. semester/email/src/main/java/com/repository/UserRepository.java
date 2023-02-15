package com.repository;

import com.model.User;

public class UserRepository {
    public User getSingleUser(){
        //Later we should implement this as a feature that fetches from the database
        User testUser = new User("Nicklas", 31);
        //We are returning a single user object as a test
        return testUser;
    }
}