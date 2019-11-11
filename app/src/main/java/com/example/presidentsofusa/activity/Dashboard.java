package com.example.presidentsofusa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.presidentsofusa.R;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    Button btnFirst, btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);

        btnFirst.setOnClickListener(this);
        btnSecond.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnFirst){
            Intent presidents = new Intent(this, MainActivity.class);
            startActivity(presidents);
        }
        else{
            Intent form = new Intent(this, SpinnerForm.class);
            startActivity(form);
        }

    }
}
