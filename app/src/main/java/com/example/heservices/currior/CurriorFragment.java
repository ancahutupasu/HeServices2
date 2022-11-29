package com.example.heservices.currior;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;

public class CurriorFragment extends Fragment {

    private CurriorViewModel mViewModel;

    TextView currior;
    TextView textView6;
    TextView textView9;
    TextView textView4;
    ImageView imageView11;
    View view;

    public static CurriorFragment newInstance() { return new CurriorFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_currior, container, false);

        currior = view.findViewById(R.id.currior);
        textView6 = view.findViewById(R.id.textView6);
        textView9 = view.findViewById(R.id.textView9);
        textView4 = view.findViewById(R.id.textView4);
        imageView11 = view.findViewById(R.id.imageView11);

        return view;
    }
}
