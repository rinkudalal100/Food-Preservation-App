package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.myapplication.databinding.ActivityFrontmanagerBinding;
import com.example.myapplication.fragments.Profilemanager;
import com.example.myapplication.fragments.cartmanager;
import com.example.myapplication.fragments.expiredmanager;
import com.example.myapplication.fragments.homemanager;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class FrontManager extends AppCompatActivity {
    ActivityFrontmanagerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFrontmanagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,new homemanager());
        transaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                switch(i)
                {
                    case 0:
                        transaction.replace(R.id.container,new homemanager());

                        break;
                    case 1:
                        transaction.replace(R.id.container,new cartmanager());
                        break;
                    case 2:
                        transaction.replace(R.id.container,new expiredmanager());
                        break;
                    case 3:
                        transaction.replace(R.id.container,new Profilemanager());
                        break;


                }
                transaction.commit();
            }
        });

    }


}