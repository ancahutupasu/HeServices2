package com.example.heservices.displayReview;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heservices.R;
import com.example.heservices.data.ReviewAdapter;

public class DisplayReviewFragment extends Fragment {

    private DisplayReviewViewModel mViewModel;
    RecyclerView revFeed;

    public static DisplayReviewFragment newInstance() {
        return new DisplayReviewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_review, container, false);
        revFeed = view.findViewById(R.id.idReviewFeeds);
        revFeed.hasFixedSize();

        return view;
    }

    //  @Override
    //public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    //  super.onActivityCreated(savedInstanceState);
            //  mViewModel = new ViewModelProvider(this).get(DisplayReviewViewModel.class);

    //   mViewModel.getReviewLiveData().observe(getViewLifecycleOwner(), name -> {
    //       if(!review.getReviews().isEmpty()){
    //          try{
    //            ReviewAdapter adapter = new ReviewAdapter(review.getReviews(), getContext(), getActivity().getApplication());

            //            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);

            //       revFeed.setLayoutManager(linearLayoutManager);

    //      revFeed.setAdapter(adapter);
                }

//  catch(Exception e)
//   {
//       e.printStackTrace();
//       Log.e(TAG, "Error getting reviews data: " + e.getMessage());
//    }
// }
// });
// }

//}
