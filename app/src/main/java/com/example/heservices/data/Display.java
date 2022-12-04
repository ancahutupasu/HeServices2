package com.example.heservices.data;

import java.util.ArrayList;

public class Display {
    private String name;
    private ArrayList<Review> reviews;

    public Display(String name, ArrayList<Review> reviews){
        this.name = name;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

}
