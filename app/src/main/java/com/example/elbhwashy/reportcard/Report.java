package com.example.elbhwashy.reportcard;

/**
 * Created by elbhwashy on 9/13/2017.
 */

public class Report {
    /* student name. */
    private String studentName;

    /* student grade */
    private int studentGrade;

    /* student class */
    private String studentClass;

    /* constructor */
    public  Report(String aStudentName , int aStudentGrade, String aStudentClass ){
        studentName = aStudentName;
        studentGrade = aStudentGrade;
        studentClass = aStudentClass;
    }

    /* get student name */
    public String getStudentName (){
        return studentName ;
    }

    /* set student name */
    public void setStudentName(String name){
        studentName = name;
    }

    /* get student grade */
    public int getStudentGrade (){
        return studentGrade;
    }

    /* set student grade */
    public void setStudentGrade(int grade){
        studentGrade = grade;
    }

    /* get student class */
    public String getStudentClass (){
        return studentClass;
    }

    /* set student class */
    public void setStudentClass(String sclass){
        studentClass = sclass;
    }
}
