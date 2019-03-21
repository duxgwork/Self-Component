package com.github.kevin.component1.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.kevin.component1.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void showFragmet(View view) {
        UserInfoFragment fragment = new UserInfoFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, fragment).commit();
    }
}
