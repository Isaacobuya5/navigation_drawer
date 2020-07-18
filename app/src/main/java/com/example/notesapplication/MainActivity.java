package com.example.notesapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView mNavigationView;
    ActionBarDrawerToggle mToggle;
    Toolbar mToolbar;
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mToolbar =  (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mNavigationView = (NavigationView) findViewById(R.id.navmenu);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(getApplicationContext(), "Home Panel is Open", Toast.LENGTH_LONG).show();
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_call:
                        Toast.makeText(getApplicationContext(), "Call Panel is Open", Toast.LENGTH_LONG).show();
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_settings:
                        Toast.makeText(getApplicationContext(), "Settings Panel is Open", Toast.LENGTH_LONG).show();
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
    }
}