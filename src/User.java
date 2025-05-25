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
public class User {
    private String name;
    private int age;
    private int score;
    private int numberOfBreaks;
    private int lengthOfBreaks;
    private int timeInBed;
    private Time time;
    private static int numPeople = 0;
    
    public User(String name, int age, Time time, int score) {
        this.name = name;
        this.age = age;
        this.time = time;
        this.score = score;
        numPeople++;
    }
    
    public User() {
        
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
    
    public int getNumberOfBreaks() {
        return numberOfBreaks;
    }
    
    public void setNumberOfBreaks(int numberOfBreaks) {
        this.numberOfBreaks = numberOfBreaks;
    }
    
    public int getLengthOfBreaks() {
        return lengthOfBreaks;
    }
    
    public void setLengthOfBreaks(int lengthOfBreaks) {
        this.lengthOfBreaks = lengthOfBreaks;
    }
    
    public int getTimeInBed() {
        return timeInBed;
    }
    
    public void setTimeInBed(int timeInBed) {
        this.timeInBed = timeInBed;
    }
    
     public Time getTime() {
        return time;
    }
    
    public void setTime(Time time) {
        this.time = time;
    }
    
    public int getNumPeople() {
        return numPeople;
    }
    
    protected static void increment() {
        numPeople++;
    }
    
    @Override
    public String toString() {
        return name + " " + age + " " + time + " " + score; 
    }
    
    public static ArrayList<User> readFromFile(String fileName) {

       ArrayList<User> users = new ArrayList<>();
        
       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          String line;
          while ((line = reader.readLine()) != null) {
            String data[] = line.split(", ");
            String type = data[0];
            String name = data[1];
            int age = Integer.parseInt(data[2]);
            int hours = Integer.parseInt(data[3]);
            int minutes = Integer.parseInt(data[4]);
            int seconds = Integer.parseInt(data[5]); 

            Time time = new Time(hours, minutes, seconds);

            if(type.equals("student")) {
                int studyHours = Integer.parseInt(data[6]);
                int score = Integer.parseInt(data[7]);
                users.add(new Student(name, age, studyHours, time, score));
            } else if(type.equals("worker")) {
                int workHours = Integer.parseInt(data[6]);
                int score = Integer.parseInt(data[7]);
                users.add(new Worker(name, age, workHours, time, score));
            } else {
                int score = Integer.parseInt(data[6]);
                users.add(new User(name, age, time, score));   
            }
          }
      } catch (IOException ioException) {
          System.out.println("Java Exception: " + ioException);
      }
        return users;
    }
}
