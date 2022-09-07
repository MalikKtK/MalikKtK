package com.example.tweeter.models;

public class Tweat {
    private String tweet;

    public Tweat(String tweet) {
        this.tweet = tweet;
    }

    public String getTweet() {
        return tweet;
    }

    @Override
    public String toString() {
        return "Tweat{" +
                "tweet='" + tweet + '\'' +
                '}';
    }
}
