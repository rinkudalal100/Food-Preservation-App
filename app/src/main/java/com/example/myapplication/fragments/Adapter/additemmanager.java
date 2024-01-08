package com.example.myapplication.fragments.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.additemsmanager;
import com.example.myapplication.R;

import java.util.ArrayList;

public class additemmanager extends RecyclerView.Adapter<additemmanager.viewHolder>{


    public additemmanager(ArrayList<additemsmanager> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<additemsmanager> list;
    Context context;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.additemexpiry_design,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int i) {
           additemsmanager model=list.get(i);
           holder.item_image.setImageResource(model.getimage_of_item());
        holder.name_of_item.setText(model.getName_of_items());
        holder.count.setText(model.getCount());
        holder.days.setText(model.getDays());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView item_image;
        TextView name_of_item,count,days;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            item_image=itemView.findViewById(R.id.itemimage);
            name_of_item=itemView.findViewById(R.id.nameofitem);
            days=itemView.findViewById(R.id.days);
            count=itemView.findViewById(R.id.count);
        }
    };
}
