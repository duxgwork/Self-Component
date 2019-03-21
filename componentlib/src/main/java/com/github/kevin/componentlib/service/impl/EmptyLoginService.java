package com.github.kevin.componentlib.service.impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.github.kevin.componentlib.service.ILoginService;

public class EmptyLoginService implements ILoginService {

    @Override
    public void launch(Context context, Bundle bundle) {

    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int resId, Bundle bundle) {
        return null;
    }

}
