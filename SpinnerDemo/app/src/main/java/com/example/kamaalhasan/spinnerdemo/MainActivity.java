package com.example.kamaalhasan.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String [] country = {"India","USA","China","Hong Kong","Australia"};
    ArrayAdapter<String> arrayAdapter;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter al = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,country);
        spinner.setAdapter(al);
    }
}
