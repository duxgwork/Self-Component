package com.github.kevin.component1.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.github.kevin.component1.ui.LoginActivity;
import com.github.kevin.component1.ui.UserInfoFragment;
import com.github.kevin.componentlib.service.ILoginService;

public class LoginService implements ILoginService {

    @Override
    public void launch(Context context, Bundle bundle) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int resId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(resId, fragment).commit();
        return fragment;
    }

}
