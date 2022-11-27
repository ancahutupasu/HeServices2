package com.example.heservices.ui.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.heservices.R;


public class ServicesFragment extends Fragment {

    /*private ServicesViewModel mViewModel;

    TextView services;
    Button viewmore1;
    Button viewmore2;
    Button viewmore3;
    ImageView expressImg;
    ImageView curriorImg;
    ImageView movingImg;
    View view;

    public static ServicesFragment newInstance() {
        return new ServicesFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_services, container, false);

        services = view.findViewById(R.id.services);
        viewmore1 = view.findViewById(R.id.viewmore1);
        viewmore2 = view.findViewById(R.id.viewmore2);
        viewmore3 = view.findViewById(R.id.viewmore3);
        expressImg = view.findViewById(R.id.expressImg);
        curriorImg = view.findViewById(R.id.curriorImg);
        movingImg = view.findViewById(R.id.movingImg);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle saveInstanceState) {
        super.onActivityCreated(saveInstanceState);
        mViewModel = new ViewModelProvider(this).get(ServicesViewModel.class);

        viewmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loadFragment(new viewmore1());
            }
        });

        viewmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new viewmore2());
            }
        });

        viewmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new viewmore3());
            }
        });
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.linearLayout, fragment);
        fragmentTransaction.commit();
    }*/
    }

