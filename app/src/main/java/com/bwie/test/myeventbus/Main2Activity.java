package com.bwie.test.myeventbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.ThreadMode;

public class Main2Activity extends AppCompatActivity {


    private Button bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bu = (Button) findViewById(R.id.bu);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
EventBus.getDefault().post(new FirstEvent("哈哈哈"));
                finish();
        }
        });

        }

        }
