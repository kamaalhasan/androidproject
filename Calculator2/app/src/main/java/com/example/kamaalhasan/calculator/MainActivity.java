package com.example.kamaalhasan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,multi,div,equal,back,clear;
    TextView number,result;
    final char ad = '+';
    final char eq = 0;
    final char su = '-';
    final char mu = '*';
    final char di = '/';
    double value1 = Double.NaN;
    double value2;
    char ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.clear);
        back = (Button) findViewById(R.id.back);
        sub = (Button) findViewById(R.id.sub);
        multi = (Button) findViewById(R.id.multi);
        equal = (Button) findViewById(R.id.equal);
        div = (Button) findViewById(R.id.div);
        add = (Button) findViewById(R.id.add);

        result = (TextView) findViewById(R.id.result);
        number = (TextView) findViewById(R.id.number);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText().toString() +"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                choice();
                ch = ad;
                result.setText(String.valueOf(value1)+"+");
                number.setText(null);
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                choice();
                ch= su;
                result.setText(String.valueOf(value1) + "-");
                number.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                choice();
                ch = mu;
                result.setText(String.valueOf(value1) + "*");
                number.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                choice();
                ch = eq;

                number.setText(number.getText().toString() + String.valueOf(value2) );
                result.setText(String.valueOf(value1));
                number.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                choice();

                ch = di;
                result.setText(String.valueOf(value1) + "/");
                number.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("");
                result.setText("");
                Toast.makeText(getApplicationContext(),"clear",Toast.LENGTH_LONG).show();
            }
        });


        }
         private void choice() {
             if (!Double.isNaN(value1)) {
                 value2 = Double.parseDouble(number.getText().toString());
                 switch (ch) {

                     case mu:
                         value1 = value1 * value2;
                         break;
                     case di:
                         value1 = value1 / value2;
                         break;
                     case ad:
                         value1 = value1 + value2;
                         break;
                     case su:
                         value1 = value1 - value2;
                         break;
                     case eq:
                         break;
                 }

             } else {

                 value1 = Double.parseDouble(number.getText().toString());
             }


         }
}
