/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 342628146
 */
public class Student extends User{
    private int score;
    private static int DEFAULT_SCORE = 0;
    private double studyHours = 0;
    
    public Student(String name, int age, double studyHours) {
        super(name, age);
        this.score = DEFAULT_SCORE;
        this.studyHours = studyHours;
    }
    
    public double getStudyHours() {
        return studyHours;
    }
    
    public void setStudyHours(double studyHours) {
        this.studyHours = studyHours;
    }
        
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
 
    public String toString() {
        return "Name: " + getName() + "Age: " + getAge() + "Daily Study Hours: " + getStudyHours(); 
    }
    
}
