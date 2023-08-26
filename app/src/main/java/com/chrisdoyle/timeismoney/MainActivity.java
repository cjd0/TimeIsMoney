package com.chrisdoyle.timeismoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGoToSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoToSettings = (Button)findViewById(R.id.btnGoToSettings);

        btnGoToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSettings();
            }
        });
    }

    public void OpenSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}