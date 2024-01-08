package com.example.myapplication.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.Datepicker;
import com.example.myapplication.R;

import java.text.DateFormat;
import java.util.Calendar;


public class additem extends Fragment implements DatePickerDialog.OnDateSetListener {
 Spinner spinner;
 Button date;
 TextView text;
 String[]items={"Food","Bread","Drink","Eggs","Butter","spices","others"};
    public additem() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_additem, container, false);
        spinner=view.findViewById(R.id.spinner);
        date=view.findViewById(R.id.dateselecter);
        text=view.findViewById(R.id.datepick);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datepi=new Datepicker();
                datepi.show(getActivity().getSupportFragmentManager(),"date_picker" );
            }
        });

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
         spinner .setAdapter(adapter);
        return view;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,day);
        String currentdate= DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(c.getTime());
        text.setText(currentdate);
    }
}