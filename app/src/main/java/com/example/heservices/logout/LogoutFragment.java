package com.example.heservices.logout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;

public class LogoutFragment extends Fragment {

    private LogoutViewModel mViewModel;

    TextView ToLogout;
    Button logOutBut;


    private  static LogoutFragment newInstance() { return new LogoutFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_logout, container, false);

        ToLogout = view.findViewById(R.id.ToLogout);
        logOutBut = view.findViewById(R.id.logOutBut);

        return view;
    }
}
