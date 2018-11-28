package com.example.dharma.blood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static TextView mail;
    private static TextView password;
    private static Button login;
    private static TextView register;
    private static TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = (TextView) findViewById(R.id.login_mail);
        password = (TextView) findViewById(R.id.login_pass);
        login = (Button) findViewById(R.id.login_btn);
        register = (TextView) findViewById(R.id.register);
        forgot = (TextView) findViewById(R.id.forgot);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });


        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Forgot.class));
            }
        });



    }
}
