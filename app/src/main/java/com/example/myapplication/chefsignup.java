package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chefsignup extends AppCompatActivity {

    private Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chefsignup);

        loginbutton = (Button) findViewById(R.id.loginbuttonchef);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(chefsignup.this, cheflogin.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}