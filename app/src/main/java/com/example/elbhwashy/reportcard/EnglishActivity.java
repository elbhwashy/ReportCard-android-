package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class EnglishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> english = new ArrayList<Report>();

        english.add(new Report("Mohamed Godaa", 85 , "B"));
        english.add(new Report("Ahmed Mohamed", 78 , "B"));
        english.add(new Report("AbdAllah Wael", 84 , "B"));

        english.add(new Report("ahmed Mahmoud", 84 , "B"));
        english.add(new Report("Sobhy mohamed", 72 , "B"));
        english.add(new Report("AbdAllah mohamed", 70 , "B"));

        english.add(new Report("Yasser Saber", 82 , "B"));
        english.add(new Report("Elsayed mohamed", 77 , "B"));
        english.add(new Report("AbdElrahman mohamed", 88 , "A"));

        english.add(new Report("Hassam Gamal", 79 , "B"));
        english.add(new Report("Gamal Sabry", 86 , "A"));
        english.add(new Report("Mona Ahmed", 70 , "C"));
        english.add(new Report("Noha Essam", 64 , "D"));

        english.add(new Report("Mohamed Ahmed", 87 , "A"));
        english.add(new Report("Yassmen Godaa", 92 , "A"));
        english.add(new Report("Saber Eltayeb", 75 , "B"));

        english.add(new Report("Adel Emam", 79 , "B"));
        english.add(new Report("Vin Diesel", 84 , "B"));
        english.add(new Report("Leo Messi", 73 , "C"));

        english.add(new Report("Abo Treka", 87 , "A"));
        english.add(new Report("Mohamed Walied", 77 , "B"));
        english.add(new Report("Ahmed Saad", 83 , "B"));

        english.add(new Report("Hesham Elsyed", 80 , "B"));
        english.add(new Report("Melegy Mohamed", 76 , "B"));
        english.add(new Report("Yara Hossam", 69 , "C"));

        english.add(new Report("Emad Meteb", 64 , "D"));
        english.add(new Report("Hossam Elbadry", 80 , "B"));
        english.add(new Report("Ahmed Hegazzy", 88 , "A"));

        english.add(new Report("Mohamed Ramadan", 79 , "B"));
        english.add(new Report("Nora Kamel", 72 , "C"));
        english.add(new Report("Hadeer Mohamed", 71 , "C"));

        english.add(new Report("Ahmed Ezz", 94 , "A"));
        english.add(new Report("AbdElsatar Ahmed", 76 , "C"));
        english.add(new Report("Fouad Elkholy", 78 , "B"));

        english.add(new Report("Eslam Salah", 93 , "A"));
        english.add(new Report("Mohamed Salah 'el hero'", 97 , "A"));
        english.add(new Report("Yara Hossam", 78 , "B"));

        english.add(new Report("Mona Mohamed", 55 , "D"));
        english.add(new Report("Noha Ashraf", 33 , "F"));

/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, english);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);


    }
}
