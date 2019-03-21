package com.github.kevin.component2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.kevin.component2.R;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        Bundle extras = getIntent().getExtras();
        if (null != extras) {
            int id = extras.getInt("ID", -1);
            Toast.makeText(this, "消息内容：" + id, Toast.LENGTH_SHORT).show();
        }
    }

}
