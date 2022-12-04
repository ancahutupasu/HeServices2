package com.example.heservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    AppBarConfiguration appBarConfiguration;
    DrawerLayout drawerLayout;
    NavigationView navigationDrawer;
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupNavigation();
    }
    private void initViews(){
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationDrawer=findViewById(R.id.navigation_drawer);
        bottomNavigationView= findViewById(R.id.bottom_navigation_view);
        toolbar=findViewById(R.id.toolbar);
    }
    private void setupNavigation(){
        navController= Navigation.findNavController(this,R.id.nav_host_fragment);
        setSupportActionBar(toolbar);
        appBarConfiguration=new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.call,
                R.id.nav_about,
                R.id.nav_contact,
                R.id.nav_delivery,
                R.id.nav_review,
                R.id.nav_moving,
                R.id.nav_signin,
                R.id.nav_logout,
                R.id.nav_signup,
                R.id.nav_express,
                R.id.nav_currior
        )
                .setOpenableLayout(drawerLayout)
                .build();
        NavigationUI.setupActionBarWithNavController(this,navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        NavigationUI.setupWithNavController(navigationDrawer,navController);
        setBottomNavigationVisibility();
    }



    private void setBottomNavigationVisibility(){
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            final int id=destination.getId();
            if(id==R.id.nav_home || id==R.id.call){
                bottomNavigationView.setVisibility(View.VISIBLE);
            }else{
                bottomNavigationView.setVisibility((View.GONE));
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item);
    }
}