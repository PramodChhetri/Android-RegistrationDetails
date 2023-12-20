package com.example.mp_04_signupformusingconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class registrationdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationdetails);

        String s_name = getIntent().getStringExtra("NAME");
        String s_address = getIntent().getStringExtra("ADDRESS");
        String s_dob = getIntent().getStringExtra("DOB");
        String s_contact = getIntent().getStringExtra("CONTACTNO");
        String s_gender = getIntent().getStringExtra("GENDER");

        TextView txt1 = findViewById(R.id.tv_SName);
        TextView txt2 = findViewById(R.id.tv_SAddress);
        TextView txt3 = findViewById(R.id.tv_SDOB);
        TextView txt4 = findViewById(R.id.tv_SContactNo);
        TextView txt5 = findViewById(R.id.tv_SGender);

        txt1.setText(s_name);
        txt2.setText(s_address);
        txt3.setText(s_dob);
        txt4.setText(s_contact);
        txt5.setText(s_gender);

    }
}