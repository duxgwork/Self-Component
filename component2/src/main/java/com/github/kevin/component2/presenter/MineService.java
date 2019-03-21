package com.github.kevin.component2.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.github.kevin.component2.ui.MineActivity;
import com.github.kevin.componentlib.service.IMineService;

public class MineService implements IMineService {

    @Override
    public void launch(Context context, Bundle bundle) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
