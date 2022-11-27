package com.example.heservices.express;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;
import com.example.heservices.contact.ContactFragment;

public class ExpressFragment extends Fragment {

    private ExpressFragment mViewModel;

    TextView fast;
    TextView fastHome;
    TextView fastWarehouse;
    TextView fastPick;
    TextView fastDk;
    ImageView expressImg2;
    View view;

    public static ExpressFragment newInstance() {
        return new ExpressFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_express, container, false);

        fast = view.findViewById(R.id.fast);
        fastHome = view.findViewById(R.id.fastHome);
        fastWarehouse = view.findViewById(R.id.fastWarehouse);
        fastPick = view.findViewById(R.id.fastPick);
        fastDk = view.findViewById(R.id.fastDk);
        expressImg2 = view.findViewById(R.id.expressImg2);

        return view;
    }


}
