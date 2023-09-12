package com.chrisdoyle.timeismoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //ui variables
    private Button btnLog, btnSettings, btnStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign ui
        btnLog = (Button)findViewById(R.id.btnMainLogRecord);
        btnSettings = (Button)findViewById(R.id.btnMainSettings);
        btnStats = (Button)findViewById(R.id.btnMainStats);

        //set ui actions
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenLog();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSettings();
            }
        });

        btnStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenStats();
            }
        });
    }

    //ui methods
    public void OpenLog() {
        Intent intent = new Intent(this, MainLogMenu.class);
        startActivity(intent);
    }

    public void OpenSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void OpenStats() {
        Intent intent = new Intent(this, Stats.class);
        startActivity(intent);
    }
}