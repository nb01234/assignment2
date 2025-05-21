/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342468766
 */
public class Worker extends User {
    private int score;
    private static final int DEFAULT_SCORE = 0;
    private double workHours = 0;
    
    public Worker(String name, int age, double studyHours, Time time) {
        super(name, age, time);
        this.score = DEFAULT_SCORE;
        this.workHours = workHours;
    }
    
    public double getWorkHours() {
        return workHours;
    }
    
    public void setStudyHours(double workHours) {
        this.workHours = workHours;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + "Age: " + getAge() + "Daily Work Hours: " + getWorkHours(); 
    }
    
}
