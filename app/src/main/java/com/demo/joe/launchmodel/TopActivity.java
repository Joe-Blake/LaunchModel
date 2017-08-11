package com.demo.joe.launchmodel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TopActivity extends BaseActivity {

    private Button task;
    private Button instance;
    private Button top;
    private Button standard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        instance = (Button) findViewById(R.id.instance);
        top = (Button) findViewById(R.id.top);
        task = (Button) findViewById(R.id.task);
        standard = (Button) findViewById(R.id.standard);
        Log.i("zj", "-------TopActivity-------");

        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, TaskActivity.class);
                startActivity(intent);
            }
        });
        instance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, InstanceActivity.class);
                startActivity(intent);
            }
        });
        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopActivity.this, TopActivity.class);
                startActivity(intent);
            }
        });
    }
}
