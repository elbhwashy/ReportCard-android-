package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class FrenshActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> frensh = new ArrayList<Report>();

        frensh.add(new Report("Mohamed Godaa", 93 , "A"));
        frensh.add(new Report("Ahmed Mohamed", 72 , "C"));
        frensh.add(new Report("AbdAllah Wael", 86 , "A"));

        frensh.add(new Report("ahmed Mahmoud", 74 , "C"));
        frensh.add(new Report("Sobhy mohamed", 65, "C"));
        frensh.add(new Report("AbdAllah mohamed", 64 , "C"));

        frensh.add(new Report("Yasser Saber", 77 , "B"));
        frensh.add(new Report("Elsayed mohamed", 73 , "C"));
        frensh.add(new Report("AbdElrahman mohamed", 93 , "A"));

        frensh.add(new Report("Hassam Gamal", 76 , "B"));
        frensh.add(new Report("Gamal Sabry", 87 , "A"));
        frensh.add(new Report("Mona Ahmed", 60 , "D"));
        frensh.add(new Report("Noha Essam", 70 , "C"));


        frensh.add(new Report("Mohamed Ahmed", 90 , "A"));
        frensh.add(new Report("Yassmen Godaa", 92 , "A"));
        frensh.add(new Report("Saber Eltayeb", 75 , "B"));
        frensh.add(new Report("Adel Emam", 79 , "B"));
        frensh.add(new Report("Vin Diesel", 84 , "B"));
        frensh.add(new Report("Leo Messi", 73 , "C"));
        frensh.add(new Report("Abo Treka", 87 , "A"));
        frensh.add(new Report("Mohamed Walied", 77 , "B"));
        frensh.add(new Report("Ahmed Saad", 83 , "B"));
        frensh.add(new Report("Hesham Elsyed", 80 , "B"));
        frensh.add(new Report("Melegy Mohamed", 76 , "B"));
        frensh.add(new Report("Yara Hossam", 69 , "C"));
        frensh.add(new Report("Emad Meteb", 64 , "D"));
        frensh.add(new Report("Hossam Elbadry", 80 , "B"));
        frensh.add(new Report("Ahmed Hegazzy", 88 , "A"));
        frensh.add(new Report("Mohamed Ramadan", 79 , "B"));
        frensh.add(new Report("Nora Kamel", 72 , "C"));
        frensh.add(new Report("Hadeer Mohamed", 71 , "C"));
        frensh.add(new Report("Ahmed Ezz", 94 , "A"));
        frensh.add(new Report("AbdElsatar Ahmed", 76 , "C"));
        frensh.add(new Report("Fouad Elkholy", 78 , "B"));
        frensh.add(new Report("Eslam Salah", 93 , "A"));
        frensh.add(new Report("Mohamed Salah 'el hero'", 97 , "A"));
        frensh.add(new Report("Yara Hossam", 78 , "B"));
        frensh.add(new Report("Mona Mohamed", 55 , "D"));
        frensh.add(new Report("Noha Ashraf", 33 , "F"));
/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, frensh);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);

    }
    }
