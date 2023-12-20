package com.example.mp_04_signupformusingconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_address, et_dob, et_contactno;
    RadioGroup rg_gender;
    RadioButton rb_male, rb_female;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_Name);
        et_address = findViewById(R.id.et_Address);
        et_contactno = findViewById(R.id.et_ContactNo);
        et_dob = findViewById(R.id.et_DOB);
        rg_gender = findViewById(R.id.rg_Gender);
        rb_male = findViewById(R.id.rb_Male);
        rb_female = findViewById(R.id.rb_Female);
        btn_register = findViewById(R.id.btn_Register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, registrationdetails.class);
                intent.putExtra("NAME", et_name.getText().toString());
                intent.putExtra("ADDRESS", et_address.getText().toString());
                intent.putExtra("CONTACTNO", et_contactno.getText().toString());
                intent.putExtra("DOB", et_dob.getText().toString());

                int selectGenderId = rg_gender.getCheckedRadioButtonId();
                if(selectGenderId == R.id.rb_Male){
                    String gender = "Male";
                    intent.putExtra("GENDER", gender);
                }else if(selectGenderId == R.id.rb_Female){
                    String gender = "Female";
                    intent.putExtra("GENDER", gender);
                };

                startActivity(intent);
            }
        });

    }
}