package com.example.kamaalhasan.instructorlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText unameEdt,pwdEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        unameEdt = (EditText) findViewById(R.id.unameEdt);
        pwdEdt = (EditText) findViewById(R.id.pwdEdt);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = unameEdt.getText().toString();
                String pwd = pwdEdt.getText().toString();
                if (uname.equalsIgnoreCase("kamaal") && pwd.equals("kamal129")){
                    Toast.makeText(getApplicationContext(),"successfull",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,InstructorActivity.class);
                    startActivity(intent);
                } else if (uname.equals("student") && pwd.equals("student129")){

                    Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
