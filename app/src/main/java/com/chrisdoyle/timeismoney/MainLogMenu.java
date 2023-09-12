package com.chrisdoyle.timeismoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLogMenu extends AppCompatActivity {

    //ui variables
    private Button btnManual, btnRecorded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_log_menu);

        //assign ui
        btnManual = (Button)findViewById(R.id.btnMainLogMenuManual);
        btnRecorded = (Button)findViewById(R.id.btnMainLogMenuRecorded);

        //set ui actions
        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenManual();
            }
        });

        btnRecorded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenRecorded();
            }
        });
    }

    //ui methods
    public void OpenManual() {
        Intent intent = new Intent(this, MainManualLog.class);
        startActivity(intent);
    }

    public void OpenRecorded() {
        Intent intent = new Intent(this, MainRecordedLog.class);
        startActivity(intent);
    }
}