package com.example.heservices.data.DAO;

import com.example.heservices.data.Review;

import java.util.ArrayList;

public class ReviewDAO {
    private static ReviewDAO instance;
    private final UserDAO userDAO;
    private ArrayList<Review> reviewArrayList = new ArrayList<>();

    public ReviewDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
