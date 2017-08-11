package com.demo.joe.launchmodel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StandardActivity extends BaseActivity {

    private Button task;
    private Button instance;
    private Button top;
    private Button standard;
    private Button NEW_TASK;
    private Button snt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        instance = (Button) findViewById(R.id.instance);
        top = (Button) findViewById(R.id.top);
        task = (Button) findViewById(R.id.task);
        standard = (Button) findViewById(R.id.standard);
        NEW_TASK = (Button) findViewById(R.id.FLAG_ACTIVITY_NEW_TASK);
        snt = (Button) findViewById(R.id.snt);
        Log.i("zj", "-------StandardActivity-------");

        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, TaskActivity.class);
                startActivity(intent);
            }
        });
        instance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, InstanceActivity.class);
                startActivity(intent);
            }
        });
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, TopActivity.class);
                startActivity(intent);
            }
        });
        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
        NEW_TASK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, TagNewTask.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        snt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, TagNewTask.class);
                startActivity(intent);
            }
        });
    }
}
