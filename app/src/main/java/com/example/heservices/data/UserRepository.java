package com.example.heservices.data;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;


import com.example.heservices.data.DAO.UserDAO;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseUser;

public class UserRepository {
        private static UserRepository instance;
        private static UserDAO userDAO;

        private UserRepository(Application app) {

            userDAO = UserDAO.getInstance(app);
        }


        public static UserRepository getInstance(Application app) {
            if (instance == null) {
                instance = new UserRepository(app);
            }
            return instance;
        }

        public LiveData<Boolean> getSignInPressed() {
            return userDAO.getSignInPressed();
        }

        public void setSignInPressed(Boolean isSignInPressed) {
            userDAO.setSignInPressed(isSignInPressed);
        }

        public LiveData<String> getAuthenticationMessage() {
            return userDAO.getAuthenticationMessage();
        }


        public LiveData<FirebaseUser> getCurrentUser() {
            return userDAO.getCurrentUser();
        }

        public LiveData<Boolean> getSignOut() {
            return userDAO.getSignOut();
        }

        public void signOut() {
            userDAO.signOut();
        }

        public void registerAccount(Activity activity, String email, String password) {
            userDAO.registerAccount(activity, email, password);
        }

        public void loginAccount(Activity activity, String email, String password) {
            userDAO.loginAccount(activity, email, password);
        }

        public void forgotPassword(View view) {
            userDAO.forgotPassword(view);
        }

        public LiveData<User> getUser() {
            return userDAO.getUser();
        }


        public void setUser(String uid) {
            userDAO.setUser(uid);
        }

        public User getUserModal(String uid) {
            return userDAO.getUserModal(uid);
        }


        public void firebaseAuthWithGoogle(boolean isRegister, GoogleSignInAccount account, FragmentActivity activity) {
            userDAO.firebaseAuthWithGoogle(isRegister, account, activity);
        }

    public void singIn(Activity activity, String email, String password) {
    }
}

