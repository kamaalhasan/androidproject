package com.example.kamaalhasan.medicinereminder;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    FloatingActionButton floatingActionButton;

    private ListView listView;
    DatabaseHelper mDatabaseHelper;

    ArrayList<String> listItem;
    ArrayAdapter adapter;




       @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main2);

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicked", "Yes");

                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);

            }
       });
         mDatabaseHelper = new DatabaseHelper(this);
          ArrayList<String> theList = new ArrayList<>();
          ListView listView = (ListView) findViewById(R.id.lvv);
           Cursor data = mDatabaseHelper.getListContents();

           if (data.getCount()==0){
               Toast.makeText(Main2Activity.this,"NO DATA SHOW",Toast.LENGTH_LONG).show();
               }else {
               while (data.moveToNext()) {
                   theList.add(data.getString(1));
                   theList.add(data.getString(2));
                   theList.add(data.getString(3));
                   theList.add(data.getString(4));
                   ListAdapter listAdapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
                   listView.setAdapter(listAdapter);
               }
           }



      }




  }


