package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cheflogin extends AppCompatActivity {
    private Button SignUp;
    private Button loginchef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheflogin);

        SignUp = (Button) findViewById(R.id.button6);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(cheflogin.this, chefsignup.class);
                startActivity(activityChangeIntent);
            }
        });
        loginchef=(Button) findViewById(R.id.button3);
        loginchef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(cheflogin.this, FrontManager.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}