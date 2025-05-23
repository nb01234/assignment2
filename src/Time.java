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
    
    public Time(int hours, int mins, int secs){
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    public Time(){
        this.hours = 0;
        this.mins = 0;
        this.secs = 0;
    }
    public int getHours(){
        if ((secs % 60) > 30) {
            mins = mins + (secs / 60) + 1;
        } else {
            mins = mins + (secs / 60);
        }
        if ((mins % 60) > 30) {
            hours = hours +(mins / 60) + 1;
        } else {
            hours = hours + (mins / 60);
        }
        return hours;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public int getMinutes(){
        if ((secs % 60) > 30){
            mins = mins+(secs / 60) + 1;
        } else {
            mins = mins + (secs / 60);
        }
        mins = hours * 60;
        return mins;
    }
    
    public void setMinutes(int minutes) {
        this.mins = minutes;
    }
    
    public int getSeconds(){
        secs =(mins + (hours * 60)) * 60;
        return secs;
    }
    
    public void setSeconds(int seconds) {
        this.secs = seconds;
    }
    
    @Override
    public String toString(){
        return hours + ";" + mins + ";" + secs;
    }
}