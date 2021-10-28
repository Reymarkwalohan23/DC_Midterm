package com.example.midtermdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView phonenumber = (TextView) findViewById(R.id.phonenumber);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton signinbtn = (MaterialButton) findViewById(R.id.signinbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                if(username.getText().toString().equals("admin") && phonenumber.getText().toString().equals("password")){
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESFUL", Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}