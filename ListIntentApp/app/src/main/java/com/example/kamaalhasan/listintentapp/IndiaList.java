package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IndiaList extends AppCompatActivity {

    String[]incity = {"MUMBAI","CHENNAI","PUNE","SURAT","DELHI","BANGALORE","KOLKATA","LUCKNOW","PATNA","CHANDIGARH"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_list);

        ArrayAdapter<String> al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,incity);
        ListView listView = (ListView)findViewById(R.id.ilvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(IndiaList.this,"City : " + incity[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
