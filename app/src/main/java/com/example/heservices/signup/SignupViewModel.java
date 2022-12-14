package com.example.heservices.signup;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;

import com.example.heservices.data.UserRepository;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;


public class SignupViewModel extends ViewModel {

    private UserRepository userRepository;

    public SignupViewModel(Application app)
    {
        //super(app);
        userRepository = UserRepository.getInstance(app);
    }

    public void registerAccount(Activity activity, String email, String password)
    {
        userRepository.registerAccount(activity,email,password);
    }

    public void setSignInPressed(Boolean isSignInPressed) {
        userRepository.setSignInPressed(isSignInPressed);
    }

    public void forgotPassword(View view){
        userRepository.forgotPassword(view);
    }

    public void firebaseAuthWithGoogle(boolean isRegister, GoogleSignInAccount account, FragmentActivity activity) {
        userRepository.firebaseAuthWithGoogle(isRegister,account,activity);
    }

}
