package com.example.heservices.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;
import com.example.heservices.currior.CurriorFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    TextView welcome;
    ImageView imageView8;
    TextView textView10;
    ImageView imageView12;
    View view;

    public static HomeFragment newInstance() { return new HomeFragment();}


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        welcome = view.findViewById(R.id.welcome);
        imageView8 = view.findViewById(R.id.imageView8);
        textView10 = view.findViewById(R.id.textView10);
        imageView12 = view.findViewById(R.id.imageView12);

        return view;

    }
}
