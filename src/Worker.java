/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342468766
 */
public class Worker extends User {
    // Initialize attributes
    private int workHours;
    
    // Primary constructor
    public Worker(String name, int age, int workHours, Time time, int score) {
        super(name, age, time, score);
        this.workHours = workHours;
    }
    
    // Default constructor
    public Worker() {
    }
    
    public int getWorkHours() {
        return workHours;
    }
    
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Work Hours: " + workHours; 
    }
}
