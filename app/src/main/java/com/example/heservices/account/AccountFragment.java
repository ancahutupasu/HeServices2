package com.example.heservices.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.heservices.R;

public class AccountFragment extends Fragment implements View.OnClickListener {

    private AccountViewModel mViewModel;

    EditText emailLogIn;
    EditText password;
    TextView forgotPassword;
    Button loginButton;
    TextView register_user;
    Button registerButton;
    ImageView googleLogin;
    View view;

    public static AccountFragment newInstance() { return new AccountFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        emailLogIn = view.findViewById(R.id.emailLogIn);
        password = view.findViewById(R.id.password);
        forgotPassword = view.findViewById(R.id.forgotPassword);
        loginButton = view.findViewById(R.id.loginButton);
        register_user = view.findViewById(R.id.register_user);
        registerButton = view.findViewById(R.id.registerButton);
        googleLogin = view.findViewById(R.id.googleLogin);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
