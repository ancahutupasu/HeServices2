package com.example.heservices.signiN;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public class SignInFragment extends Fragment implements View.OnClickListener {

    private SignInViewModel mViewModel;

    EditText emailLogIn;
    EditText password;
    TextView forgotPassword;
    Button loginButton;
    TextView register_user;
    Button registerButton;
    ImageView googleLogin;
    View view;
    private GoogleSignInClient googleSignInClient;
    private final static int RC_SIGN_IN = 123;
    private SignInViewModel signInViewModel;

    public static SignInFragment newInstance() { return new SignInFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin, container, false);

        emailLogIn = view.findViewById(R.id.emailLogIn);
        password = view.findViewById(R.id.password);
        forgotPassword = view.findViewById(R.id.forgotPassword);
        loginButton = view.findViewById(R.id.loginButton);
        register_user = view.findViewById(R.id.register_user);
        registerButton = view.findViewById(R.id.registerButton);
        googleLogin = view.findViewById(R.id.googleLogin);

        createRequestGoogle();

        return view;
    }

    // @Override
    // public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    //    super.onActivityCreated(savedInstanceState);
    //  signInViewModel = new ViewModelProvider(this).get(SignInViewModel.class);

    //   if(loginButton != null)
    //    {
    //        loginButton.setOnClickListener(new View.OnClickListener() {
    //           @Override
    //           public void onClick(View view) {
    //              try{
    //                   signInViewModel.singIn((Activity) view.getContext(),emailLogIn.getText().toString(), password.getText().toString());
    //               }
    //               catch (NullPointerException e)
    //              {
    //                   Toast.makeText(getActivity(), "Fields cannot be empty...", Toast.LENGTH_SHORT).show();
    //               }
    //           }
    //       });
    //   }

    //   if(registerButton != null)
    //   {
    //       registerButton.setOnClickListener(new View.OnClickListener() {
    //          @Override
    //           public void onClick(View view)  {
    //               signInViewModel.setSignInPressed(false);
    //            }
    //       });
    //   }

    //   forgotPassword.setOnClickListener(new View.OnClickListener() {
    //       @Override
    //        public void onClick(View view) {
    //           signInViewModel.forgotPassword(view);
    //       }
    //   });

    //   googleLogin.setOnClickListener(new View.OnClickListener() {
    //       @Override
    //      public void onClick(View v) {
    //           signIn();
    //       }
    //   });
//   }

    // @Override
    //  public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    //     super.onActivityResult(requestCode, resultCode, data);

    //    if(requestCode == RC_SIGN_IN)
    //   {
    //       Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
    //       try {
    //          GoogleSignInAccount account = task.getResult(ApiException.class);
    //          firebaseAuthWithGoogle(account);
    //      }
    //       catch (ApiException e)
    //       {
    //           Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
    //      }
    //   }
    //}


    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {
        signInViewModel.firebaseAuthWithGoogle(false,account,getActivity());
    }

    private void createRequestGoogle() {
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

    @Override
    public void onClick(View v) {

    }
}
