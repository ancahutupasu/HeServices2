package com.example.heservices.data;

import android.app.Application;

import com.example.heservices.data.DAO.ReviewDAO;
import com.example.heservices.data.DAO.UserDAO;

public class ReviewRepository {
    private ReviewDAO reviewDAO;
    private UserDAO userDAO;
    private static ReviewRepository instance;

    public static ReviewRepository getInstance(Application app)
    {
     if(instance == null)
         {
            instance = new ReviewRepository(app);
        }
       return instance;
     }

    public ReviewRepository(Application application)
     {
       reviewDAO = ReviewDAO.getInstance(application);
       userDAO = UserDAO.getInstance(application);
   }

}
