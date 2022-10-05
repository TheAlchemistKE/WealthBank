package com.michaelkabera.wealthbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {

    private TextView surnameTv, otherNamesTv, idTv, accountNumberTv, branchTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        HashMap<String, String> receivedData = (HashMap<String, String>) getIntent().getExtras().get("data");

        surnameTv = findViewById(R.id.surname_value);
        otherNamesTv = findViewById(R.id.othernames_value);
        idTv = findViewById(R.id.id_value);
        accountNumberTv = findViewById(R.id.acc_number_value);
        branchTv = findViewById(R.id.branch_value);

        surnameTv.setText(receivedData.get("surname"));
        otherNamesTv.setText(receivedData.get("other_names"));
        idTv.setText(receivedData.get("national_id"));
        accountNumberTv.setText(receivedData.get("account_number"));
        branchTv.setText(receivedData.get("branch"));


    }
}