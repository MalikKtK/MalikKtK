package com.example.cookieshop.repositories;

import com.example.cookieshop.models.Cookie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CookieRepository {
    //TODO Implement real repository
    /*This is a test-repository*/

    public List<Cookie> getAllCookies(){
        return new ArrayList<Cookie>(
            Arrays.asList(
                    new Cookie(1,"Chocolate", 30),
                    new Cookie(2,"Oatmeal", 15),
                    new Cookie(3,"Tofu", 20),
                    new Cookie(4,"Macaroon", 50)
            )
        );
    }

    public Cookie getCookieById(int id){
        Cookie cookieToReturn = null;
        switch(id){
            case 1 :
                cookieToReturn = new Cookie(1,"Chocolate", 30);
                break;
            case 2 :
                cookieToReturn = new Cookie(2,"Oatmeal", 15);
                break;
            case 3 :
                cookieToReturn = new Cookie(3,"Tofu", 20);
                break;
            case 4 :
                cookieToReturn = new Cookie(4,"Macaroon", 50);
                break;
        }
        return cookieToReturn;
    }
}
