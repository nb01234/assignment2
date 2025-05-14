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
    public Time(int hours,int mins,int secs){
        this.hours=hours;
        this.mins=mins;
        this.secs=secs;
    }
    public Time(){
        this.hours=0;
        this.mins=0;
        this.secs=0;
    }
    public int getTotalHours(){
        if (secs>30){
            mins=mins+(secs/60)+1;
        }
        if (mins>30){
            hours=hours+(mins/60)+1;
        }
        return hours;
    }
    public int  getTotalMinutes(){
        
    }
    public int  getTotalSeconds(){
        
    }
    public String toString(){
        
    }

}
