package com.example.android.punjabguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the  Chandigarh activity.
        TextView chandigarh = (TextView) findViewById(R.id.chandigarh);

        // Set a click listener on that View
        chandigarh.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Chandigarh View is clicked on.
            @Override
            public void onClick(View view) {
                Intent city1Intent = new Intent(MainActivity.this, ChandigarhActivity.class);
                startActivity(city1Intent);
            }
        });

        // Find the View that shows the  Amritsar category.
        TextView amritsar = (TextView) findViewById(R.id.amritsar);

        // Set a click listener on that View
        amritsar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Amritsar View is clicked on.
            @Override
            public void onClick(View view) {
                Intent city2Intent = new Intent(MainActivity.this, AmritsarActivity.class);
                startActivity(city2Intent);
            }
        });

        // Find the View that shows the  Patiala category.
        TextView patiala = (TextView) findViewById(R.id.patiala);

        // Set a click listener on that View
        patiala.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Patiala View is clicked on.
            @Override
            public void onClick(View view) {
                Intent city3Intent = new Intent(MainActivity.this, PatialaActivity.class);
                startActivity(city3Intent);
            }
        });

        // Find the View that shows the  Jalandhar category.
        TextView jalandhar = (TextView) findViewById(R.id.jalandhar);

        // Set a click listener on that View
        jalandhar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Jalandhar View is clicked on.
            @Override
            public void onClick(View view) {
                Intent city4Intent = new Intent(MainActivity.this, JalandharActivity.class);
                startActivity(city4Intent);
            }
        });

    }
}
