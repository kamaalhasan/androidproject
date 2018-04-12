package com.example.kamaalhasan.listintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String []country = {"AUSTRALIA","CHINA","CANADA","FRANCE","GERMANY","HONG KONG","INDIA","INDONESIA","ITALY","JAPAN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> al = new ArrayAdapter<String>(getApplication(),android.R.layout.simple_list_item_1,country);

        final ListView listView = (ListView) findViewById(R.id.lvv);
        listView.setAdapter(al);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (id == 0){
                Intent intent = new Intent(MainActivity.this,AustraliaList.class);
                startActivityForResult(intent,0);
            }
                if (id == 1){
                    Intent intent = new Intent(MainActivity.this,ChinaList.class);
                    startActivityForResult(intent,1);
                }
                if (id == 2){
                    Intent intent = new Intent(MainActivity.this,CanadaList.class);
                    startActivityForResult(intent,2);
                }
                if (id == 3){
                    Intent intent = new Intent(MainActivity.this,FranceList.class);
                    startActivityForResult(intent,3);
                }
                if (id == 4){
                    Intent intent = new Intent(MainActivity.this,GermanyList.class);
                    startActivityForResult(intent,4);
                }
                if (id == 5){
                    Intent intent = new Intent(MainActivity.this,HongkongList.class);
                    startActivityForResult(intent,5);
                }
                if (id == 6){
                    Intent intent = new Intent(MainActivity.this,IndiaList.class);
                    startActivityForResult(intent,6);
                }
                if (id == 7){
                    Intent intent = new Intent(MainActivity.this,IndonesiaList.class);
                    startActivityForResult(intent,7);
                }
                if (id == 8){
                    Intent intent = new Intent(MainActivity.this,ItalyList.class);
                    startActivityForResult(intent,8);
                }
                if (id == 9){
                    Intent intent = new Intent(MainActivity.this,JapanList.class);
                    startActivityForResult(intent,9);
                }


            }
        });
    }
}
