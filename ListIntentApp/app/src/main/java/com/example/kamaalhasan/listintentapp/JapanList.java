package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class JapanList extends AppCompatActivity {

    String []jcity = {"Nagoya","Seto","Handa","Toyota","Tsushima","Komaki","Chita","Tahara","Yatomi","miyoshi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan_list);

        ArrayAdapter<String> al =new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,jcity);
        ListView listView = (ListView) findViewById(R.id.jlvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(JapanList.this,"City : " + jcity[position],Toast.LENGTH_LONG).show();
            }
        });


    }
}
