package com.github.kevin.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.kevin.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLogin(View view) {
        ServiceFactory.getInstance().getLoginService().launch(this, null);
    }

    public void showMine(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ID",666);
        ServiceFactory.getInstance().getMineService().launch(this, bundle);
    }

    public void showUI(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("MSG","登录页面的部分Fragment页面");
        ServiceFactory.getInstance().getLoginService().newUserInfoFragment(getSupportFragmentManager(),R.id.container, bundle);
    }

}
