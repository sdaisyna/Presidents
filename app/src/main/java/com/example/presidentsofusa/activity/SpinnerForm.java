package com.example.presidentsofusa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.presidentsofusa.R;

public class SpinnerForm extends AppCompatActivity {


    EditText name, email;
    Spinner gender;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        name = findViewById(R.id.edtName);
        email = findViewById(R.id.edtEmail);
        gender = findViewById(R.id.spin);
        btn = findViewById(R.id.btnDone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.getText().toString().matches("")){
                    name.setError("Enter your full name !");
                    return;
                }
                if(email.getText().toString().matches("")){
                    email.setError("Enter your Email address !");
                    return;
                }

                Intent intent = new Intent(SpinnerForm.this, DisplayForm.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("gender", gender.getSelectedItem().toString());

                startActivity(intent);
            }
        });

    }
}
