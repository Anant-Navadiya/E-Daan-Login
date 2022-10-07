package com.example.e_daan_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.e_dana_login.R;

public class forgot_password extends AppCompatActivity {
    TextView email1;
    Button reset;
    String email;
    TextView cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        email1 = (EditText) findViewById(R.id.email);
        reset = (Button) findViewById(R.id.resetbutton);
        cancel = (TextView) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(forgot_password.this,login.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { verify(); }
        });
    }
    public void verify() {
        email1 = (EditText) findViewById(R.id.email);

        email = email1.getText().toString().trim();

        if (email.isEmpty()) {
            email1.setError("Invalid");
        } else {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();

        }
    }
}