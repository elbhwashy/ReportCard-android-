package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class MathActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> math = new ArrayList<Report>();

        math.add(new Report("Mohamed Godaa", 89 , "A"));
        math.add(new Report("Ahmed Mohamed", 74 , "C"));
        math.add(new Report("AbdAllah Wael", 80 , "B"));

        math.add(new Report("ahmed Mahmoud", 86 , "A"));
        math.add(new Report("Sobhy mohamed", 69 , "C"));
        math.add(new Report("AbdAllah mohamed", 78 , "B"));

        math.add(new Report("Yasser Saber", 84 , "B"));
        math.add(new Report("Elsayed mohamed", 65 , "C"));
        math.add(new Report("AbdElrahman mohamed", 96 , "A"));

        math.add(new Report("Hassam Gamal", 79 , "B"));
        math.add(new Report("Gamal Sabry", 91 , "A"));
        math.add(new Report("Mona Ahmed", 64 , "D"));
        math.add(new Report("Noha Essam", 72 , "C"));

        math.add(new Report("Mohamed Ahmed", 88 , "A"));
        math.add(new Report("Yassmen Godaa", 92 , "A"));
        math.add(new Report("Saber Eltayeb", 75 , "B"));
        math.add(new Report("Adel Emam", 79 , "B"));
        math.add(new Report("Vin Diesel", 84 , "B"));
        math.add(new Report("Leo Messi", 73 , "C"));
        math.add(new Report("Abo Treka", 87 , "A"));
        math.add(new Report("Mohamed Walied", 77 , "B"));
        math.add(new Report("Ahmed Saad", 83 , "B"));
        math.add(new Report("Hesham Elsyed", 80 , "B"));
        math.add(new Report("Melegy Mohamed", 76 , "B"));
        math.add(new Report("Yara Hossam", 69 , "C"));
        math.add(new Report("Emad Meteb", 64 , "D"));
        math.add(new Report("Hossam Elbadry", 80 , "B"));
        math.add(new Report("Ahmed Hegazzy", 88 , "A"));
        math.add(new Report("Mohamed Ramadan", 79 , "B"));
        math.add(new Report("Nora Kamel", 72 , "C"));
        math.add(new Report("Hadeer Mohamed", 71 , "C"));
        math.add(new Report("Ahmed Ezz", 94 , "A"));
        math.add(new Report("AbdElsatar Ahmed", 76 , "C"));
        math.add(new Report("Fouad Elkholy", 78 , "B"));
        math.add(new Report("Eslam Salah", 93 , "A"));
        math.add(new Report("Mohamed Salah 'el hero'", 97 , "A"));
        math.add(new Report("Yara Hossam", 78 , "B"));
        math.add(new Report("Mona Mohamed", 55 , "D"));
        math.add(new Report("Noha Ashraf", 33 , "F"));
/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, math);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);

    }
    }
