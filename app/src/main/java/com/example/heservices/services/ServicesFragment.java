package com.example.heservices.services;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.heservices.R;
import com.example.heservices.contact.ContactViewModel;
import com.example.heservices.express.ExpressFragment;

public class ServicesFragment extends Fragment {
    Button viewmore1;
    private ServicesViewModel mViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_services, container, false);

        viewmore1 = view.findViewById(R.id.viewmore1);
        return view;


    }
    @Override
    public void onActivityCreated(@Nullable Bundle saveInstanceState) {
        super.onActivityCreated(saveInstanceState);
        mViewModel = new ViewModelProvider(this).get(ServicesViewModel.class);

        viewmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Intent intent=new Intent(this,ExpressFragment.class);
               // startActivity(intent);
            }
        });

    }
}
