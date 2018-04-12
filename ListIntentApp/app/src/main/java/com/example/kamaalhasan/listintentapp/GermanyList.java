package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GermanyList extends AppCompatActivity {

    String []gcity = {"FRANKFURT","TRIER","WURZBURG","HESSE","RUHR","BERLIN","HAMBURG"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany_list);
        ArrayAdapter al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,gcity);
        ListView listView = (ListView)findViewById(R.id.glvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GermanyList.this,"City : " + gcity[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
