package com.example.kamaalhasan.medicinereminder;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import static android.provider.CallLog.Calls.DATE;

public class Main3Activity extends AppCompatActivity {

    EditText mn;
    EditText dcp;
    EditText editText;
    EditText sd;
    EditText stm;
    Calendar c;
    int day, month, year;
    Calendar currentTime;
    int hour, minute;
    String format;
//    Button btnAdd= (Button) findViewById(R.id.btnAdd);
    DatabaseHelper mDatabaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mn = (EditText) findViewById(R.id.mn);
        dcp = (EditText) findViewById(R.id.dcp);
        mDatabaseHelper = new DatabaseHelper(this);
        Button button = (Button) findViewById(R.id.btnAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();
            }
        });



        sd = (EditText) findViewById(R.id.sd);

        c = Calendar.getInstance();
        day = c.get(Calendar.DAY_OF_MONTH);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);

        month = month + 1;

        sd.setText(day + "/" + month + "/" + year);
        sd.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(Main3Activity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        sd.setText(dayOfMonth + "/" + month + "/" + year);


                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        stm = (EditText) findViewById(R.id.stm);

        currentTime = Calendar.getInstance();

        hour = currentTime.get(Calendar.HOUR_OF_DAY);
        minute = currentTime.get(Calendar.MINUTE);

        selectedTimeFormat(hour);
        stm.setText(hour + ":" + minute + " " + format);

        stm.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(Main3Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        selectedTimeFormat(hourOfDay);
                        stm.setText(hourOfDay + ":" + minute + " " + format);

                    }
                }, hour, minute, true);
                timePickerDialog.show();
            }
        });

    }

    public void selectedTimeFormat(int hour) {

        if (hour == 0) {

            hour += 12;
            format = "AM";
        } else if (hour == 12) {

            format = "PM";

        } else if (hour > 12) {
            hour -= 12;
            format = "PM";

        } else {
            format = "AM";

        }

    }

    public void AddData(){
        String med = mn.getText().toString();
        String dat = sd.getText().toString();
        String tam = stm.getText().toString();
        String des = dcp.getText().toString();


        boolean InsertData = mDatabaseHelper.addData(med,dat,tam,des);
        if (InsertData == true) {
            Toast.makeText(Main3Activity.this, "data added", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(Main3Activity.this, "You must put something in the text field!", Toast.LENGTH_LONG).show();
        }


         }


}




