package com.example.heservices.delivery;

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

public class DeliveryFragment extends Fragment {

    private DeliveryViewModel mViewModel;

    TextView deliver;
    TextView textView5;
    TextView textView7;
    TextView textView8;
    ImageView image;
    View view;

    public static DeliveryFragment newInstance() { return new DeliveryFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_delivery, container, false);

        deliver = view.findViewById(R.id.deliver);
        textView5 = view.findViewById(R.id.textView5);
        textView7 = view.findViewById(R.id.textView7);
        textView8 = view.findViewById(R.id.textView8);
        image = view.findViewById(R.id.image);

        return view;

    }
}
