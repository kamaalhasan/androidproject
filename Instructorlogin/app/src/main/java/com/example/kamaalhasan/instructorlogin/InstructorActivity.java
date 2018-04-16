package com.example.kamaalhasan.instructorlogin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class InstructorActivity extends AppCompatActivity {

    Button imgBtn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor);

        imageView = (ImageView) findViewById(R.id.imageView);
        imgBtn =(Button) findViewById(R.id.imgBtn);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent captureintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(captureintent,101);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==101){
            if (resultCode == RESULT_OK){
                Bundle extraBundle = data.getExtras();
                Bitmap bitmap = (Bitmap)extraBundle.get("data");
                imageView.setImageBitmap(bitmap);
            }else if (requestCode == RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"opretion cancelled",Toast.LENGTH_LONG).show();
            }
        }
    }

}
