package com.example.kamaalhasan.implementmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText unameEdt,pwdEdt;
    Button sbmBtn, rstBtn;
    TextView attmEdt;
    int counter = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unameEdt = (EditText) findViewById(R.id.unameEdt);
        pwdEdt = (EditText) findViewById(R.id.pwdEdt);
        sbmBtn = (Button) findViewById(R.id.sbmBtn);
        rstBtn = (Button) findViewById(R.id.rstBtn);
        attmEdt = (TextView)findViewById(R.id.attmEdt);
        sbmBtn.setOnClickListener(this);
        rstBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.sbmBtn) {
            String uname = unameEdt.getText().toString();
            String pwd = pwdEdt.getText().toString();

            if (uname.equals("kamaal") && pwd.equalsIgnoreCase("kamal12")){
                Toast.makeText(MainActivity.this,"SUBMITTED",Toast.LENGTH_LONG).show();
                counter = 3;
                attmEdt.setVisibility(TextView.INVISIBLE);
            }else {
                attmEdt.setVisibility(TextView.VISIBLE);
                attmEdt.setText("Attempt Remaining :" + (--counter));
                if (counter==0){
                    sbmBtn.setEnabled(false);
                    Toast.makeText(MainActivity.this,"your account is blocked for a day.",Toast.LENGTH_LONG).show();
                }

            }

        }else if (v.getId()== R.id.rstBtn){
            unameEdt.setText("");
            pwdEdt.setText("");
        }

    }
}
