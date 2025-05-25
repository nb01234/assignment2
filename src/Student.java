import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Student extends User {
    private int studyHours;
    
    public Student(String name, int age, int studyHours, Time time, int score) {
        super(name, age, time, score);
        this.studyHours = studyHours;
    }
    
    public Student() {
    }
    
    public int getStudyHours() {
        return studyHours;
    }
    
    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Study Hours: " + studyHours; 
    }
}
