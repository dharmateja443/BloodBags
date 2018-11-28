package com.example.dharma.blood;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mainpage extends AppCompatActivity{

    private static ImageView profile;
    private static ImageView hospital;
    private static ImageView search;
    private static ImageView location;
    private static ImageView settings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        profile = (ImageView) findViewById(R.id.profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mainpage.this, profile.class));
            }
        });

        hospital = (ImageView) findViewById(R.id.hospital);

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mainpage.this, hospital.class));
            }
        });

        location = (ImageView) findViewById(R.id.location);

       location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mainpage.this, MapsActivity.class));
            }
        });

        search = (ImageView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mainpage.this, Mainpage.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        settings = (ImageView) findViewById(R.id.settings);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mainpage.this, settings.class));
            }
        });

    }
}
