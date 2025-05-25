/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342468766
 */
public class Student extends User {
    // Initialize attributes
    private int studyHours;
    
    // Primary constructor
    public Student(String name, int age, int studyHours, Time time, int score) {
        super(name, age, time, score);
        this.studyHours = studyHours;
    }
    
    // Default constructor
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
