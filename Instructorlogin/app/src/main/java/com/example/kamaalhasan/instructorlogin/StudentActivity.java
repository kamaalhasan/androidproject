package com.example.kamaalhasan.instructorlogin;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.CallScreeningService;
import android.view.View;
import android.widget.Button;

public class StudentActivity extends AppCompatActivity {

    Button callBtm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        callBtm = (Button) findViewById(R.id.callBtn);
        callBtm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel : 123456789"));
                startActivity(callintent);
            }
        });
    }
}
