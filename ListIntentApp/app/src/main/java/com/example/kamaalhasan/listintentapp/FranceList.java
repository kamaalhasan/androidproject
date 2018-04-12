package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FranceList extends AppCompatActivity {

    String []fcity = {"PARIS","ROUEN","ANNECY","DUNKIRK","CHAMBERY","ANGERS","CALAIS","TROYES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france_list);

        ArrayAdapter<String> al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,fcity);
        ListView listView = (ListView)findViewById(R.id.flvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FranceList.this,"City : " + fcity[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
