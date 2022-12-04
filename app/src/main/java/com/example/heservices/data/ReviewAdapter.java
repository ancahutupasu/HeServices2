package com.example.heservices.data;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heservices.R;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private ArrayList<Review> reviewArrayList;
    private Context context;
    private UserRepository userRepository;
    private ReviewRepository reviewRepository;


    public ReviewAdapter(ArrayList<Review> instaModalArrayList, Context context, Application app) {
        this.reviewArrayList = instaModalArrayList;
        this.context = context;
        this.userRepository = UserRepository.getInstance(app);
        this.reviewRepository = ReviewRepository.getInstance(app);
    }

    @NonNull
    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review, parent, false);

        return new ReviewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ViewHolder holder, int position) {

        Review modal = reviewArrayList.get(position);
        User user = userRepository.getUserModal(modal.getUserUID());

        holder.authorTV.setText(user.getUserName());
        holder.desctv.setText(modal.getDescription());

    }

    @Override
    public int getItemCount() {
        return reviewArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView authorTV;
        private TextView desctv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            authorTV = itemView.findViewById(R.id.username);
            desctv = itemView.findViewById(R.id.review);
        }
    }
}

