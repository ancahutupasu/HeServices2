package com.example.heservices.data;

import java.util.ArrayList;

public class Review {
        public String userUID;
        public String description;
        public float rate;
        private int uniqID;

        public Review(String userUID, String description, float rate, int uniqID) {

            this.userUID = userUID;
            this.description = description;
            this.rate = rate;
        }

        public Review() {
            this.userUID = null;
            this.description = null;
            this.rate = -1;
        }

        public String getUserUID() {return userUID;}

        public void setUserUID(String userUID) {this.userUID = userUID;}

        public String getDescription() {return description;}

        public int getUniqID() {return uniqID;}

        public void setUniqID(int uniqID) {this.uniqID = uniqID;}

        public void setDescriptions(String description) {this.description = description;}

        public float getRate() {return rate;}

        public void setRate(float rate) {this.rate = rate;}

    }


