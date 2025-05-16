/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342468766
 */
public class User {
    private String name;
    private int age;
    private int score;
    private Time time;
    private static int DEFAULT_SCORE = 0;
    private static int numPeople = 0;
    
    public User(String name, int age, Time time) {
        this.name = name;
        this.age = age;
        this.Time = time;
        this.score = DEFAULT_SCORE;
        numPeople++;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getNumPeople() {
        return numPeople;
    }
    
    protected static void increment() {
        numPeople++;
    }
    
    public String toString() {
        return "Name: " + name + "Age: " + age; 
    }
    
}
