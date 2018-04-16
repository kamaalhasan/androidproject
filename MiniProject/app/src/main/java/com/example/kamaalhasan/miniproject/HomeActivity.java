package com.example.kamaalhasan.miniproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ImageView imageView;
    Button uplBtn,calBtn,curBtn,goBtn,extBtn;
    EditText urlEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        uplBtn = (Button) findViewById(R.id.uplBtn);
        imageView = (ImageView) findViewById(R.id.imageView);
        calBtn = (Button) findViewById(R.id.calBtn);
        curBtn = (Button) findViewById(R.id.curBtn);
        urlEdt = (EditText)findViewById(R.id.urlEdt);
        goBtn = (Button) findViewById(R.id.goBtn);
        extBtn = (Button) findViewById(R.id.extBtn);
        extBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://" + urlEdt.getText().toString()));
                startActivity(intent);

            }
        });




        uplBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(imageintent,101);
            }

        });

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CalculatorActivity.class);
                startActivity(intent);

            }
        });

        curBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CurrencyActivity.class);
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101){
            if (resultCode==RESULT_OK){

                Bundle extrabundle = data.getExtras();
                Bitmap bitmap = (Bitmap) extrabundle.get("data");
                imageView.setImageBitmap(bitmap);
            }
        }
        if (resultCode == RESULT_CANCELED){
            Toast.makeText(getApplicationContext(),"OPRETION CANCELLED",Toast.LENGTH_SHORT).show();
        }

    }

}
