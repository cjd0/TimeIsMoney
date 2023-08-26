package com.chrisdoyle.timeismoney;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    private EditText etInputSalary, etInputHoursWorked;
    private TextView tvDisplayHourly;
    private Button btnCalculateHourly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //assign UI
        etInputSalary = (EditText)findViewById(R.id.etSettingsSetAnnualSalary);
        etInputHoursWorked = (EditText)findViewById(R.id.etSettingsSetWeeklyHours);
        tvDisplayHourly = (TextView)findViewById(R.id.tvSettingsAnnualSalaryDisplay);
        btnCalculateHourly = (Button)findViewById(R.id.btnSettingsCalculateHourly);

        //set button actions
        btnCalculateHourly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculateHourly();
            }
        });
    }


    //methods
    public void CalculateHourly() {

        if (etInputSalary.getText().toString().length() != 0 && etInputHoursWorked.getText().toString().length() != 0) {
            double hourly = (Double.parseDouble(etInputSalary.getText().toString()) / 52) / Double.parseDouble(etInputHoursWorked.getText().toString());
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            tvDisplayHourly.setText("Hourly wage: " + currencyFormat.format(hourly));
        }
        else {
            tvDisplayHourly.setText("Please input Annual Salary and Weekly Hours.");
        }
    }

}