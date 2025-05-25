/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345467385
 */
public class Time {
    private int hours;
    private int mins;
    private int secs;
    public static final int MAX_HOURS_PER_DAY = 24;
    
    // Primary Constructor
    public Time(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    // Default constructor
    public Time() {
        this.hours = 0;
        this.mins = 0;
        this.secs = 0;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public int getMinutes(){
        return mins;
    }
    
    public void setMinutes(int minutes) {
        this.mins = minutes;
    }
    
    public int getSeconds(){
        return secs;
    }
    
    public void setSeconds(int seconds) {
        this.secs = seconds;
    }
    
    @Override
    public String toString(){
        return hours + ":" + mins + ":" + secs;
    }
}