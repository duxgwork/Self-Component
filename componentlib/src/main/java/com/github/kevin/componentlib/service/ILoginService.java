package com.github.kevin.componentlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface ILoginService {

    void launch(Context context, Bundle bundle);

    Fragment newUserInfoFragment(FragmentManager fragmentManager, int resId, Bundle bundle);

}
