package com.example.tweeter.repositores;

import com.example.tweeter.models.Tweat;

import java.util.Arrays;
import java.util.List;

public class TestRepository {
    //TODO Implement "real" repository
    public List<Tweat> getAllTweats(){
        return Arrays.asList(
                new Tweat("Hello Everyone ! This is a test"),
                new Tweat("Hello Everyone ! This is also a test"),
                new Tweat("Server rendered content is making a comeback"),
                new Tweat("Spring MVC = 💣")
        );
    }
}
