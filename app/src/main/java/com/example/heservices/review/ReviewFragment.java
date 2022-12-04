package com.example.heservices.review;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;
import com.example.heservices.express.ExpressFragment;

public class ReviewFragment extends Fragment {

    private ReviewFragment mViewModel;

    ImageView imageView11;
    EditText name;
    RatingBar ratingReviewBar;
    Button add;
    View view;

    public static ReviewFragment newInstance() { return new ReviewFragment();}


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);

        imageView11 = view.findViewById(R.id.imageView11);
        name = view.findViewById(R.id.name);
        ratingReviewBar = view.findViewById(R.id.ratingReviewBar);
        add = view.findViewById(R.id.add);

        return view;
    }
}
