package com.example.elbhwashy.reportcard;

import android.app.Activity;
import android.content.DialogInterface;
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


        /* find arabic subject */
        TextView arabic = (TextView) findViewById(R.id.arabic);

        /* set on click listener */
        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent arabicIntent = new Intent(MainActivity.this, ArabicActivity.class);



                startActivity(arabicIntent);
            }
        });



        /* find chemistry subject */
        TextView chemistry = (TextView) findViewById(R.id.chemistry);

        /* set on click listener */
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* create new intent to open chemistry view */
                Intent chemistryIntent = new Intent(MainActivity.this, ChemistryActivity.class);


                /* start intent */
                startActivity(chemistryIntent);
            }
        });
        /* find english subject */
        TextView english = (TextView) findViewById(R.id.english);

        /* set on click listener */
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* create new intent to open english view */
                Intent englishIntent = new Intent(MainActivity.this, EnglishActivity.class);


                /* start intent */
                startActivity(englishIntent);
            }
        });
        /* find frensh subject */
        TextView frensh = (TextView) findViewById(R.id.frensh);

        /* set on click listener */
        frensh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* create new intent to open frensh view */
                Intent frenshIntent = new Intent(MainActivity.this, FrenshActivity.class);


                /* start intent */
                startActivity(frenshIntent);
            }
        });
        /* find math subject */
        TextView math = (TextView) findViewById(R.id.math);

        /* set on click listener */
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* create new intent to open math view */
                Intent mathIntent = new Intent(MainActivity.this, MathActivity.class);


                /* start intent */
                startActivity(mathIntent);
            }
        });
        /* find physics subject */
        TextView physics = (TextView) findViewById(R.id.physics);

        /* set on click listener */
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* create new intent to open physics view */
                Intent physicsIntent = new Intent(MainActivity.this, PhysicsActivity.class);


                /* start intent */
                startActivity(physicsIntent);
            }
        });

        /* find sum subject */
        TextView sum = (TextView) findViewById(R.id.sum);

        /* set on click listener */
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* create new intent to open sum view */
                Intent sumIntent = new Intent(MainActivity.this, SumActivity.class);


                /* start intent */
                startActivity(sumIntent);
            }
        });
    }
}
