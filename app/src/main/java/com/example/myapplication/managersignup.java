package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class managersignup extends AppCompatActivity {

    private Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managersignup);
        loginbutton = (Button) findViewById(R.id.loginbuttonmanagersignup);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(managersignup.this, managerlogin.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}