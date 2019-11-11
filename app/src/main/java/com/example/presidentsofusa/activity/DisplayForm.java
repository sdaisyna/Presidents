package com.example.presidentsofusa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.presidentsofusa.R;

import org.w3c.dom.Text;

public class DisplayForm extends AppCompatActivity {


    TextView name, email, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        name = findViewById(R.id.txtName);
        email =findViewById(R.id.txtEmail);
        gender = findViewById(R.id.txtGender);

        Bundle bundle = getIntent().getExtras();
        name.setText(bundle.getString("name"));
        email.setText(bundle.getString("email"));
        gender.setText(bundle.getString("gender"));
    }
}
