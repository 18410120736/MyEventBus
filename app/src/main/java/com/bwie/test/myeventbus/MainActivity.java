package com.bwie.test.myeventbus;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    private Button bu;
    private TextView te;
    private TextView te1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注册EventBus，注册订阅
        EventBus.getDefault().register(this);
        te1 = (TextView) findViewById(R.id.te2);
        bu = (Button) findViewById(R.id.bu);
        te = (TextView) findViewById(R.id.te);
        bu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);


            }
        });

    }
}
