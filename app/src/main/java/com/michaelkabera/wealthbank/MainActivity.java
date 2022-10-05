package com.michaelkabera.wealthbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText surnameEt, otherNamesEt, idEt, accNumberEt, branchEt;
    private MaterialButton submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surnameEt = findViewById(R.id.surname);
        otherNamesEt = findViewById(R.id.other_names);
        idEt = findViewById(R.id.national_id);
        accNumberEt = findViewById(R.id.acc_number);
        branchEt = findViewById(R.id.branch);

        submitBtn = findViewById(R.id.submit_btn);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("BUTTON EVENT", "Button Clicked");
                String surname, otherNames, nationalId, accountNumber, branch;

                surname = String.valueOf(surnameEt.getText());
                otherNames = String.valueOf(otherNamesEt.getText());
                nationalId = String.valueOf(idEt.getText());
                accountNumber = String.valueOf(accNumberEt.getText());
                branch = String.valueOf(branchEt.getText());

                HashMap<String, String> data = new HashMap<String, String>();
                data.put("surname", surname);
                data.put("other_names", otherNames);
                data.put("national_id", nationalId);
                data.put("account_number", accountNumber);
                data.put("branch", branch);

                Log.d("Data", String.valueOf(data));

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data", data);

                startActivity(intent);


            }
        });



    }
}