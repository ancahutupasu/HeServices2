package com.example.heservices.signup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;
import com.example.heservices.contact.ContactFragment;

public class SignupFragment extends Fragment {

    private SignupFragment mViewModel;

    TextView register_user1;
    EditText userName;
    EditText emailSignUp;
    EditText passwordSignUp;
    EditText fullName;
    EditText phoneNo;
    TextView role;
    RadioButton member;
    RadioButton admin;
    ImageView googleLog;
    Button register;
    Button loginBut;
    View view;

    public static SignupFragment newInstance() {
        return new SignupFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        register_user1 = view.findViewById(R.id.register_user1);
        userName = view.findViewById(R.id.userName);
        emailSignUp = view.findViewById(R.id.emailSignUp);
        passwordSignUp = view.findViewById(R.id.passwordSignUp);
        fullName = view.findViewById(R.id.fullName);
        phoneNo = view.findViewById(R.id.phoneNo);
        role = view.findViewById(R.id.role);
        member = view.findViewById(R.id.member);
        admin = view.findViewById(R.id.admin);
        googleLog = view.findViewById(R.id.googleLog);
        register = view.findViewById(R.id.register);
        loginBut = view.findViewById(R.id.loginBut);

        return view;

    }


}
