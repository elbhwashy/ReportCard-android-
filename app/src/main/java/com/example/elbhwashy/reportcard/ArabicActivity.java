package com.example.elbhwashy.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ArabicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);
        ArrayList<Report> arabic = new ArrayList<Report>();

        arabic.add(new Report("Mohamed Godaa", 91 , "A"));
        arabic.add(new Report("Ahmed Mohamed", 80 , "B"));
        arabic.add(new Report("AbdAllah Wael", 80 , "B"));

        arabic.add(new Report("ahmed Mahmoud", 86 , "A"));
        arabic.add(new Report("Sobhy mohamed", 73 , "C"));
        arabic.add(new Report("AbdAllah mohamed", 61 , "D"));

        arabic.add(new Report("Yasser Saber", 72 , "C"));
        arabic.add(new Report("Elsayed mohamed", 69 , "C"));
        arabic.add(new Report("AbdElrahman mohamed", 96 , "A"));

        arabic.add(new Report("Hassam Gamal", 79 , "B"));
        arabic.add(new Report("Gamal Sabry", 74 , "C"));
        arabic.add(new Report("Mona Ahmed", 49 , "F"));
        arabic.add(new Report("Noha Essam", 60 , "D"));

        arabic.add(new Report("Mohamed Ahmed", 83 , "B"));
        arabic.add(new Report("Yassmen Godaa", 98 , "A"));
        arabic.add(new Report("Saber Eltayeb", 71 , "C"));

        arabic.add(new Report("Adel Emam", 84 , "B"));
        arabic.add(new Report("Vin Diesel", 89 , "A"));
        arabic.add(new Report("Leo Messi", 69 , "C"));

        arabic.add(new Report("Abo Treka", 63 , "D"));
        arabic.add(new Report("Mohamed Walied", 68 , "C"));
        arabic.add(new Report("Ahmed Saad", 94 , "A"));

        arabic.add(new Report("Hesham Elsyed", 81 , "B"));
        arabic.add(new Report("Melegy Mohamed", 74 , "C"));
        arabic.add(new Report("Yara Hossam", 76 , "C"));
        arabic.add(new Report("Emad Meteb", 62 , "D"));

        arabic.add(new Report("Hossam Elbadry", 82 , "B"));
        arabic.add(new Report("Ahmed Hegazzy", 97 , "A"));
        arabic.add(new Report("Mohamed Ramadan", 73 , "C"));

        arabic.add(new Report("Nora Kamel", 81 , "B"));
        arabic.add(new Report("Hadeer Mohamed", 88 , "A"));
        arabic.add(new Report("Ahmed Ezz", 72 , "C"));

        arabic.add(new Report("AbdElsatar Ahmed", 62 , "D"));
        arabic.add(new Report("Fouad Elkholy", 72 , "C"));
        arabic.add(new Report("Eslam Salah", 97 , "A"));

        arabic.add(new Report("Mohamed Salah 'el hero'", 80 , "B"));
        arabic.add(new Report("Yara Hossam", 72 , "C"));
        arabic.add(new Report("Mona Mohamed", 42 , "F"));

        arabic.add(new Report("Noha Ashraf", 64 , "D"));

/* create object from wordAdapter class and pass to it list of numbers. */
        ReportAdapter adapter = new ReportAdapter(this, arabic);

        /* create object from ListView class with the view ID called list. */
        ListView listView = (ListView) findViewById(R.id.list);


        /* set adapter in the ListView. */
        listView.setAdapter(adapter);







    }


}
