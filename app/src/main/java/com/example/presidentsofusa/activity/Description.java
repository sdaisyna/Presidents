package com.example.presidentsofusa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.presidentsofusa.R;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class Description extends AppCompatActivity {

    CircleImageView img;
    TextView name, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        img = findViewById(R.id.proflieImage);
        name = findViewById(R.id.fullName);
        desc = findViewById(R.id.description);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            img.setImageResource(bundle.getInt("image"));
            name.setText(bundle.getString("name"));
            desc.setText(bundle.getString("desc"));
        }
    }
}
