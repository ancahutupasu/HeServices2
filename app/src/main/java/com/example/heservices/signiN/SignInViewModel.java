package com.example.heservices.signiN;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;

import com.example.heservices.data.UserRepository;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class SignInViewModel extends ViewModel {

    private final UserRepository userRepository;

    public SignInViewModel(Application app){
        //super(app);
        userRepository = UserRepository.getInstance(app);
    }

    public void setSignInPressed(Boolean isSignInPressed) {
        userRepository.setSignInPressed(isSignInPressed);
    }


    public void firebaseAuthWithGoogle(boolean isRegister,GoogleSignInAccount account, FragmentActivity activity) {
        userRepository.firebaseAuthWithGoogle(isRegister,account,activity);
    }

    public void singIn(Activity activity, String email, String password) {
        userRepository.singIn(activity, email, password);
    }

    public void forgotPassword(View view){
        userRepository.forgotPassword(view);
    }
}
