package com.example.elbhwashy.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class ReportAdapter extends ArrayAdapter<Report> {
    public ReportAdapter(Activity context, ArrayList<Report> details) {

        super(context, 0, details);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_list, parent, false);
        }


        Report currentPos = getItem(position);

        // Find the TextView in the word_item.xml layout with the ID version_number
        TextView studentTextView = (TextView) listItemView.findViewById(R.id.student_name_text_view);
        // Get the student name object and
        // set this text on the name TextView
        studentTextView.setText(currentPos.getStudentName());


        /* Find the TextView in the word_item.xml layout with the ID  */
        TextView classTextView = (TextView) listItemView.findViewById(R.id.class_text_view);
        // Get the student class object and
        // set this text on the class TextView
        classTextView.setText(currentPos.getStudentClass());


        /* Find the TextView in the list_item.xml layout with the ID */
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        gradeTextView.setText(""+currentPos.getStudentGrade());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
