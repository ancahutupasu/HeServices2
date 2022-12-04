package com.example.heservices.data.DAO;

import static android.content.ContentValues.TAG;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.heservices.data.Review;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.Source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReviewDAO {
    private static ReviewDAO instance;
    private final UserDAO userDAO;
    private ArrayList<Review> reviewArrayList = new ArrayList<>();

    public ReviewDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    private FirebaseFirestore firebaseDatabase;

    private MutableLiveData<ArrayList<Review>> reviewsLiveData = new MutableLiveData<>(new ArrayList<>());
    private MutableLiveData<Review> review = new MutableLiveData<>();


    public ReviewDAO(Application app) {
        firebaseDatabase = FirebaseFirestore.getInstance();
        userDAO = UserDAO.getInstance(app);
    }

    public static ReviewDAO getInstance(Application application) {
        if (instance == null) {
            instance = new ReviewDAO(application);
        }
        return instance;
    }

    public MutableLiveData<ArrayList<Review>> getReviewsLiveData() {
        return reviewsLiveData;
    }

    public MutableLiveData<Review> getReviewLiveData() {
        return review;
    }

    public void setReviewLiveData(Review review) {
        this.review.setValue(review);
    }

}
