package com.example.messageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        Button btnSnd=findViewById(R.id.btnSend);
        EditText To=findViewById(R.id.To);
        EditText name=findViewById(R.id.Name);
        Intent intent=getIntent();

        //String value=getIntent().getStringExtra("Email");
        String value=intent.getStringExtra("Email");
        To.setText(value);
        String Name=getIntent().getStringExtra("Name");
        name.setText(Name);
        btnSnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}