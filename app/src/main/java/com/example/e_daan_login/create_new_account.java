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

public class create_new_account extends AppCompatActivity {
    EditText name1, enrollno1, mobile1, email1, pass1;
    Button register;
    String username, email, password, enrollno, phone;
    TextView haveanaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
        name1 = (EditText) findViewById(R.id.username);
        mobile1 = (EditText) findViewById(R.id.phone);
        email1 = (EditText) findViewById(R.id.email);
        pass1 = (EditText) findViewById(R.id.password);
        register = (Button) findViewById(R.id.register);
        haveanaccount = (TextView) findViewById(R.id.account);
        haveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(create_new_account.this,login.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { verify(); }
        });
    }

    public void verify()
    {
        name1 = (EditText) findViewById(R.id.username);
        mobile1 = (EditText) findViewById(R.id.phone);
        email1 = (EditText) findViewById(R.id.email);
        pass1 = (EditText) findViewById(R.id.password);

        username = name1.getText().toString();
        enrollno = enrollno1.getText().toString();
        phone = mobile1.getText().toString();
        email = email1.getText().toString();
        password = pass1.getText().toString();

        if(username.isEmpty())
        {
            name1.setError("Invalid");
        }

        if(phone.isEmpty())
        {
            mobile1.setError("Invalid");
        }
        if (email.isEmpty())
        {
            email1.setError("Invalid");
        }
        if(password.isEmpty())
        {
            pass1.setError("Invalid");
        }
        else
        {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        }


    }
}

