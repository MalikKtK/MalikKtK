package com.movieworkshop.repositories;

import com.movieworkshop.repositories.DatabaseConnectionManager;

public class Main{
    public static void main(String[] args) {
        DatabaseConnectionManager.getConn();
    }
}
