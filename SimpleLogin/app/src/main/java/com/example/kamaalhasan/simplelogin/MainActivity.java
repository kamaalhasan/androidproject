package com.example.kamaalhasan.simplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText unameEdt,pwdEdt;
    Button rstBtn,sbmBtn;
   int counter = 3;
    TextView attm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unameEdt =(EditText) findViewById(R.id.unameEdt);
        pwdEdt =(EditText) findViewById(R.id.pwdEdt);
        rstBtn = (Button) findViewById(R.id.rstBtn);
        sbmBtn = (Button) findViewById(R.id.sbmBtn);
        attm = (TextView)findViewById(R.id.attm);

        sbmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = unameEdt.getText().toString();
                String pwd = pwdEdt.getText().toString();

                if (uname.equals("kamaal") && pwd.equalsIgnoreCase("kamal129")){

                    Toast.makeText(MainActivity.this,"submitted",Toast.LENGTH_LONG).show();
                    counter=3;
                    attm.setVisibility(TextView.INVISIBLE);
                }else {
                    attm.setVisibility(TextView.VISIBLE);
                    attm.setText("Attempts Remaining :" + (--counter));

                    if (counter==0){
                        sbmBtn.setEnabled(false);

                    }
                }
            }
        });
        rstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unameEdt.setText("");
                pwdEdt.setText("");
            }
        });

    }

}

