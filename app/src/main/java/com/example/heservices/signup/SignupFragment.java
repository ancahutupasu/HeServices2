package com.example.heservices.signup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.heservices.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class SignupFragment extends Fragment {

    private SignupViewModel mViewModel;

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
    private GoogleSignInClient googleSignInClient;
    private final static int RC_SIGN_IN = 123;
    private SignupViewModel signupViewModel;


    public static SignupFragment newInstance() {
        return new SignupFragment();
    }

    @Nullable
    @Override
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

        createRequestGoogle();

        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        signupViewModel = new ViewModelProvider(this).get(SignupViewModel.class);

        if (register != null) {
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getView() != null) {
                        try{
                            signupViewModel.registerAccount((Activity) getView().getContext(), emailSignUp.getText().toString(), passwordSignUp.getText().toString());
                        }
                        catch (NullPointerException e)
                        {
                            Toast.makeText(getActivity(), "Fields cannot be empty..", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
            });
        }
        if (loginBut != null) {
            loginBut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    signupViewModel.setSignInPressed(true);
                }
            });
        }


        googleLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_SIGN_IN)
        {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(true,account);
            }
            catch (ApiException e)
            {
                Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(boolean isRegister,GoogleSignInAccount account) {
        signupViewModel.firebaseAuthWithGoogle(isRegister,account,getActivity());
    }



    private void createRequestGoogle()
    {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).
                requestIdToken("CHANGE-ME").
                requestEmail().
                build();

        googleSignInClient = GoogleSignIn.getClient(getContext(),gso);
    }

    private void signIn()
    {
        Intent signInIntent = googleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }


}
