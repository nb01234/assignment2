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
    private static int DEFAULT_AGE = 0;
    private static int DEFAULT_SCORE = 0;
    private static int numPeople = 0;
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.score = DEFAULT_SCORE;
        numPeople++;
    }
    
    public User(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
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
