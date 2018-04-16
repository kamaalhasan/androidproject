package com.example.kamaalhasan.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText unameEdt,pwdEdt;
    Button logBtn,resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unameEdt = (EditText) findViewById(R.id.unameEdt);
        pwdEdt = (EditText) findViewById(R.id.pwdEdt);
        logBtn = (Button) findViewById(R.id.logBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        logBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.logBtn){
            String uname = unameEdt.getText().toString();
            String pwd = pwdEdt.getText().toString();

            if (uname.equals("kamaal") && pwd.equalsIgnoreCase("kamal129")){

                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }

        }

        if (v.getId()==R.id.resetBtn){

            unameEdt.setText(" ");
            pwdEdt.setText(" ");
        }

    }
}
