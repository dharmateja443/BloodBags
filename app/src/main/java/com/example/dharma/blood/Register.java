package com.example.dharma.blood;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private static int result = 1;

    private static ImageView uploadimage;
    public static Button next;
    private static TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        back = (TextView) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        uploadimage = (ImageView) findViewById(R.id.uploadimage);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, Register2.class));
            }
        });

        uploadimage.setOnClickListener(this);
    }

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.uploadimage:

                     Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                     startActivityForResult(gallery, result);

                     break;

                }

            }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == result && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            uploadimage.setImageURI(selectedImage);
        }
    }

}
