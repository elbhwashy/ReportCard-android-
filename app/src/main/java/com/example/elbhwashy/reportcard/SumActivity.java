package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class SumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> Sum = new ArrayList<Report>();

        Sum.add(new Report("Mohamed Godaa", 87 , "A"));
        Sum.add(new Report("Ahmed Mohamed", 81 , "B"));
        Sum.add(new Report("AbdAllah Wael", 83 , "B"));

        Sum.add(new Report("ahmed Mahmoud", 81 , "A"));
        Sum.add(new Report("Sobhy mohamed", 71 , "C"));
        Sum.add(new Report("AbdAllah mohamed", 67 , "C"));

        Sum.add(new Report("Yasser Saber", 78 , "B"));
        Sum.add(new Report("Elsayed mohamed", 74 , "C"));
        Sum.add(new Report("AbdElrahman mohamed", 92 , "A"));

        Sum.add(new Report("Hassam Gamal", 80 , "B"));
        Sum.add(new Report("Gamal Sabry", 89 , "A"));
        Sum.add(new Report("Mona Ahmed", 62 , "D"));
        Sum.add(new Report("Noha Essam", 65 , "C"));

        Sum.add(new Report("Mohamed Ahmed", 87 , "B"));
        Sum.add(new Report("Yassmen Godaa", 98 , "A"));
        Sum.add(new Report("Saber Eltayeb", 71 , "C"));

        Sum.add(new Report("Adel Emam", 84 , "B"));
        Sum.add(new Report("Vin Diesel", 89 , "A"));
        Sum.add(new Report("Leo Messi", 69 , "C"));

        Sum.add(new Report("Abo Treka", 63 , "D"));
        Sum.add(new Report("Mohamed Walied", 68 , "C"));
        Sum.add(new Report("Ahmed Saad", 94 , "A"));

        Sum.add(new Report("Hesham Elsyed", 81 , "B"));
        Sum.add(new Report("Melegy Mohamed", 74 , "C"));
        Sum.add(new Report("Yara Hossam", 76 , "C"));

        Sum.add(new Report("Emad Meteb", 62 , "D"));
        Sum.add(new Report("Hossam Elbadry", 82 , "B"));
        Sum.add(new Report("Ahmed Hegazzy", 97 , "A"));

        Sum.add(new Report("Mohamed Ramadan", 73 , "C"));
        Sum.add(new Report("Nora Kamel", 81 , "B"));
        Sum.add(new Report("Hadeer Mohamed", 88 , "A"));

        Sum.add(new Report("Ahmed Ezz", 72 , "C"));
        Sum.add(new Report("AbdElsatar Ahmed", 62 , "D"));
        Sum.add(new Report("Fouad Elkholy", 72 , "C"));

        Sum.add(new Report("Eslam Salah", 97 , "A"));
        Sum.add(new Report("Mohamed Salah 'el hero'", 80 , "B"));
        Sum.add(new Report("Yara Hossam", 72 , "C"));

        Sum.add(new Report("Mona Mohamed", 42 , "F"));

/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, Sum);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);

    }
    }
