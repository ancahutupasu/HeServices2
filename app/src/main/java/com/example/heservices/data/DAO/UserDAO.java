package com.example.heservices.data.DAO;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.heservices.data.User;
import com.example.heservices.data.UserLiveData;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class UserDAO {
    private final UserLiveData currentUser;
    private final Application app;
    private static UserDAO instance;

    private MutableLiveData<String> authenticationMessage = new MutableLiveData<>("");
    private MutableLiveData<Boolean> progressBar = new MutableLiveData<>(false);

    //enter sign in
    private MutableLiveData<Boolean> signInPressed = new MutableLiveData<>(false);

    //sign out
    private MutableLiveData<Boolean> signOut = new MutableLiveData<>(false);
    private MutableLiveData<User> user = new MutableLiveData<>(null);

    //Authentication
    private FirebaseAuth firebaseAuth;

    //Firebase Database
    private FirebaseFirestore firebaseDatabase;

    User returnedUser;
    User userModal = new User();

    private UserDAO(Application app) {
        this.app = app;
        currentUser = new UserLiveData();

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseFirestore.getInstance();

    }












}
