
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
 * @author 342468766
 */
public class Worker extends User {
    private int workHours;
    
    public Worker(String name, int age, int workHours, Time time, int score) {
        super(name, age, time, score);
        this.workHours = workHours;
    }
    
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
