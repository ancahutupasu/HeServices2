package com.example.heservices.displayReview;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.heservices.data.ReviewRepository;

public class DisplayReviewViewModel extends ViewModel {

    private ReviewRepository reviewRepository;

    public DisplayReviewViewModel(Application app)
    {
        //super(app);
        reviewRepository = ReviewRepository.getInstance(app);
    }

}
