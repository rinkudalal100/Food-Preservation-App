package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button manager,chef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityMainBinding binding;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager= (Button) findViewById(R.id.button);
        chef= (Button) findViewById(R.id.button2);
        manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(MainActivity.this, managerlogin.class);
                startActivity(activityChangeIntent);
            }
        });
        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityChangeIntent = new Intent(MainActivity.this, cheflogin.class);
                startActivity(activityChangeIntent);
            }
        });


    }
}