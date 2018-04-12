package com.example.kamaalhasan.listintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HongkongList extends AppCompatActivity {

    String []hcity = {"KOWLOON","TIN SHUI WAI","VICTORIA","SHA TIN","YUEN LONG"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hongkong_list);

        ArrayAdapter<String> al = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,hcity);
        ListView listView = (ListView)findViewById(R.id.hlvv);
        listView.setAdapter(al);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(HongkongList.this,"City : " + hcity[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
