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

public class ChemistryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> chemistry = new ArrayList<Report>();

        chemistry.add(new Report("Mohamed Godaa", 84 , "B"));
        chemistry.add(new Report("Ahmed Mohamed", 83 , "B"));
        chemistry.add(new Report("AbdAllah Wael", 88 , "A"));

        chemistry.add(new Report("ahmed Mahmoud", 81 , "B"));
        chemistry.add(new Report("Sobhy mohamed", 70 , "C"));
        chemistry.add(new Report("AbdAllah mohamed", 65 , "C"));

        chemistry.add(new Report("Yasser Saber", 80 , "B"));
        chemistry.add(new Report("Elsayed mohamed", 79 , "B"));
        chemistry.add(new Report("AbdElrahman mohamed", 90 , "A"));

        chemistry.add(new Report("Hassam Gamal", 84 , "B"));
        chemistry.add(new Report("Gamal Sabry", 98 , "A"));
        chemistry.add(new Report("Mona Ahmed", 63 , "D"));
        chemistry.add(new Report("Noha Essam", 58 , "D"));

        chemistry.add(new Report("Mohamed Ahmed", 86 , "A"));
        chemistry.add(new Report("Yassmen Godaa", 92 , "A"));
        chemistry.add(new Report("Saber Eltayeb", 75 , "B"));

        chemistry.add(new Report("Adel Emam", 79 , "B"));
        chemistry.add(new Report("Vin Diesel", 84 , "B"));
        chemistry.add(new Report("Leo Messi", 73 , "C"));

        chemistry.add(new Report("Abo Treka", 87 , "A"));
        chemistry.add(new Report("Mohamed Walied", 77 , "B"));
        chemistry.add(new Report("Ahmed Saad", 83 , "B"));

        chemistry.add(new Report("Hesham Elsyed", 80 , "B"));
        chemistry.add(new Report("Melegy Mohamed", 76 , "B"));
        chemistry.add(new Report("Yara Hossam", 69 , "C"));

        chemistry.add(new Report("Emad Meteb", 64 , "D"));
        chemistry.add(new Report("Hossam Elbadry", 80 , "B"));
        chemistry.add(new Report("Ahmed Hegazzy", 88 , "A"));

        chemistry.add(new Report("Mohamed Ramadan", 79 , "B"));
        chemistry.add(new Report("Nora Kamel", 72 , "C"));
        chemistry.add(new Report("Hadeer Mohamed", 71 , "C"));

        chemistry.add(new Report("Ahmed Ezz", 94 , "A"));
        chemistry.add(new Report("AbdElsatar Ahmed", 76 , "C"));
        chemistry.add(new Report("Fouad Elkholy", 78 , "B"));

        chemistry.add(new Report("Eslam Salah", 93 , "A"));
        chemistry.add(new Report("Mohamed Salah 'el hero'", 97 , "A"));
        chemistry.add(new Report("Yara Hossam", 78 , "B"));

        chemistry.add(new Report("Mona Mohamed", 55 , "D"));
        chemistry.add(new Report("Noha Ashraf", 33 , "F"));

/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, chemistry);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter((ListAdapter) adapter);


    }
}
