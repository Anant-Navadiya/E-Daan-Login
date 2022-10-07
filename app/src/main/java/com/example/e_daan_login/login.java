package com.example.e_daan_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.e_dana_login.R;

public class login extends AppCompatActivity {
    EditText user1, pass1;
    Button login;
    String username, password;
    TextView forget , createnew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user1 = (EditText) findViewById(R.id.username);
        pass1 = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginbutton);
        forget = (TextView) findViewById(R.id.forgetpass);
        createnew =(TextView) findViewById(R.id.create);


        forget.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,forgot_password.class));
            }


        });


        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                user1 = (EditText) findViewById(R.id.username);
                pass1 = (EditText) findViewById(R.id.password);

                username = user1.getText().toString();
                password =  pass1.getText().toString();

                if(username.isEmpty())
                {
                    user1.setError("Invalid");
                }
                if(password.isEmpty())
                {
                    pass1.setError("Invalid");
                }
                else
                {
                    startActivity(new Intent(login.this,create_new_account.class));
                }
            }
        });
         createnew.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(login.this,create_new_account.class));
             }
         });
    }




    private void login() {
        user1 = (EditText) findViewById(R.id.username);
        pass1 = (EditText) findViewById(R.id.password);

        username = user1.getText().toString();
        password =  pass1.getText().toString();


    }

}