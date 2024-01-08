package com.example.myapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentHomemanagerBinding;

import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.Model.additemsmanager;
import com.example.myapplication.R;
import com.example.myapplication.fragments.Adapter.additemmanager;

import java.util.ArrayList;

public class homemanager extends Fragment {
    Button ima;
    RecyclerView item;
    ArrayList<additemsmanager>list;
     public homemanager()
     {

     }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_homemanager, container, false);
        ima=view.findViewById(R.id.button8);
      ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Fragment fragment4=new additem();
               FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
               transaction.replace(R.id.container,fragment4);
                transaction.commit();

            }
        });
        item=view.findViewById(R.id.additemRV);
        list=new ArrayList<>();
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.ic_launcher_background,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));
        list.add(new additemsmanager(R.drawable.cheflogin,"tee","3","4"));

        additemmanager adapter=new additemmanager(list,getContext());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL,false);
        item.setLayoutManager(linearLayoutManager);
        item.setNestedScrollingEnabled(true);
        item.setAdapter(adapter);
        return view;


    }
}