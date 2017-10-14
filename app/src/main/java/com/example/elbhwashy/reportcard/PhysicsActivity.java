package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.elbhwashy.reportcard.R.id.arabic;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class PhysicsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> physics = new ArrayList<Report>();

        physics.add(new Report("Mohamed Godaa", 80 , "B"));
        physics.add(new Report("Ahmed Mohamed", 88 , "A"));
        physics.add(new Report("AbdAllah Wael", 79 , "B"));

        physics.add(new Report("ahmed Mahmoud", 73 , "C"));
        physics.add(new Report("Sobhy mohamed", 78 , "B"));
        physics.add(new Report("AbdAllah mohamed", 60 , "D"));

        physics.add(new Report("Yasser Saber", 74 , "C"));
        physics.add(new Report("Elsayed mohamed", 80 , "B"));
        physics.add(new Report("AbdElrahman mohamed", 87 , "A"));

        physics.add(new Report("Hassam Gamal", 82 , "B"));
        physics.add(new Report("Gamal Sabry", 96 , "A"));
        physics.add(new Report("Mona Ahmed", 62 , "D"));
        physics.add(new Report("Noha Essam", 64 , "D"));

        physics.add(new Report("Mohamed Ahmed", 85 , "A"));
        physics.add(new Report("Yassmen Godaa", 92 , "A"));
        physics.add(new Report("Saber Eltayeb", 75 , "B"));
        physics.add(new Report("Adel Emam", 79 , "B"));
        physics.add(new Report("Vin Diesel", 84 , "B"));
        physics.add(new Report("Leo Messi", 73 , "C"));
        physics.add(new Report("Abo Treka", 87 , "A"));
        physics.add(new Report("Mohamed Walied", 77 , "B"));
        physics.add(new Report("Ahmed Saad", 83 , "B"));
        physics.add(new Report("Hesham Elsyed", 80 , "B"));
        physics.add(new Report("Melegy Mohamed", 76 , "B"));
        physics.add(new Report("Yara Hossam", 69 , "C"));
        physics.add(new Report("Emad Meteb", 64 , "D"));
        physics.add(new Report("Hossam Elbadry", 80 , "B"));
        physics.add(new Report("Ahmed Hegazzy", 88 , "A"));
        physics.add(new Report("Mohamed Ramadan", 79 , "B"));
        physics.add(new Report("Nora Kamel", 72 , "C"));
        physics.add(new Report("Hadeer Mohamed", 71 , "C"));
        physics.add(new Report("Ahmed Ezz", 94 , "A"));
        physics.add(new Report("AbdElsatar Ahmed", 76 , "C"));
        physics.add(new Report("Fouad Elkholy", 78 , "B"));
        physics.add(new Report("Eslam Salah", 93 , "A"));
        physics.add(new Report("Mohamed Salah 'el hero'", 97 , "A"));
        physics.add(new Report("Yara Hossam", 78 , "B"));
        physics.add(new Report("Mona Mohamed", 55 , "D"));
        physics.add(new Report("Noha Ashraf", 33 , "F"));

/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, physics);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);

    }
    }
