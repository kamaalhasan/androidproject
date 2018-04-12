package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CanadaList extends AppCompatActivity {

    String []ccity ={"CALGARY","MONTREAL","EDMONTON","SASKATOON","KINGSTON","SAINT JOHN","KITCHENER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada_list);

        ArrayAdapter<String> al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,ccity);
        ListView listView = (ListView)findViewById(R.id.clvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CanadaList.this,"City : " + ccity[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}
