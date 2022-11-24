package com.example.heservices.contact;

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
import androidx.lifecycle.ViewModelProvider;

import com.example.heservices.R;

public class ContactFragment extends Fragment {

    private ContactViewModel mViewModel;

    TextView text1;
    TextView text3;
    ImageView mail;
    Button tel2;
    Button tel1;
    Button tel3;
    Button email;
    ImageView phoneImage;
    ImageView locationImage;
    Button location;
    View view;

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        text1 = view.findViewById(R.id.text1);
        text3 = view.findViewById(R.id.text3);
        mail = view.findViewById(R.id.mail);
        tel2 = view.findViewById(R.id.tel2);
        tel1 = view.findViewById(R.id.tel1);
        tel3 = view.findViewById(R.id.tel3);
        phoneImage = view.findViewById(R.id.phoneImage);
        locationImage = view.findViewById(R.id.locationImage);
        location = view.findViewById(R.id.location);
        email = view.findViewById(R.id.email);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle saveInstanceState) {
        super.onActivityCreated(saveInstanceState);
        mViewModel = new ViewModelProvider(this).get(ContactViewModel.class);

        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+4531000000"));
                startActivity(intent);
            }
        });

        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+4571000000"));
                startActivity(intent);
            }
        });

        tel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+4546000000"));
                startActivity(intent);
            }
        });


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                startActivity(intent);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapIntentUri = Uri.parse("https://goo.gl/maps/Jopdqh61mMzmZk4z9");
                Intent intent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

    }
}

