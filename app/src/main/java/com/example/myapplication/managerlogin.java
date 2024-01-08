package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

import java.io.BufferedReader;

public class managerlogin extends AppCompatActivity {
  private Button signupmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managerlogin);
        signupmanager= (Button) findViewById(R.id.button5);
        signupmanager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(managerlogin.this, managersignup.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}