package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AustraliaList extends AppCompatActivity {

    String [] acity ={"DARWIN","TASMANIA","QUEENSLAND","MACKAY","CAIRNS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_list);

        ArrayAdapter<String> al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,acity);
        ListView listView = (ListView)findViewById(R.id.alvv);
        listView.setAdapter(al);

        ListView listView1 = (ListView) findViewById(R.id.alvv);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AustraliaList.this,"City : " + acity[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}
