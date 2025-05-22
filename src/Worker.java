
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
    private int score;
    private static final int DEFAULT_SCORE = 0;
    private double workHours = 0;
    
    public Worker(String name, int age, double workHours, Time time) {
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
    
    public static ArrayList<User> readFromFile(String fileName) {
       ArrayList <User> users = new ArrayList<>();

       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          String line;
          int i = 0;
          while ((line = reader.readLine()) != null) {
            String data[] = line.split(",");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            String[] timeParts = data[2].split(",");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int seconds = Integer.parseInt(timeParts[2]); 
            Time time = new Time(hours, minutes, seconds);
            
            double workHours = Double.parseDouble(data[3]);

            users.add(new Student(name, age, workHours, time));
            i++;
          }
      } catch (IOException ioException) {
          System.out.println("Java Exception: " + ioException);
      }
        return users;
      }
    
}
