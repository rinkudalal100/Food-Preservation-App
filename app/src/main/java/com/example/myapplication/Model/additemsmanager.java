package com.example.myapplication.Model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.R;

import java.util.ArrayList;

public class additemsmanager{
    int image_of_item;
    String name_of_items,count,Days;

    public additemsmanager(int image_of_item, String name_of_items, String count, String days) {
        this.image_of_item = image_of_item;
        this.name_of_items = name_of_items;
        this.count = count;
        Days = days;
    }

    public int getimage_of_item() {
        return image_of_item;
    }

    public void setimage_of_item(int image_of_item) {
        this.image_of_item = image_of_item;
    }

    public String getName_of_items() {
        return name_of_items;
    }

    public void setName_of_items(String name_of_items) {
        this.name_of_items = name_of_items;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

}
