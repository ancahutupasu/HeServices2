package com.example.heservices.moving;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;

public class MovingFragment extends Fragment {

    private MovingViewModel mViewModel;

    TextView moving;
    TextView Dk;
    TextView EU;
    TextView hToh;
    TextView textView3;
    ImageView imageView2;
    View view;

    public static MovingFragment newInstance() { return new MovingFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moving, container, false);

        moving = view.findViewById(R.id.moving);
        Dk = view.findViewById(R.id.Dk);
        EU = view.findViewById(R.id.EU);
        hToh = view.findViewById(R.id.hToh);
        textView3 = view.findViewById(R.id.textView3);
        imageView2 = view.findViewById(R.id.imageView2);

        return view;
    }
}
