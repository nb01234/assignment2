
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
        return super.toString() + "" + workHours; 
    }
    
    public static ArrayList<User> readFromFile(String fileName) {
       ArrayList <User> users = new ArrayList<>();

       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          String line;
          while ((line = reader.readLine()) != null) {
            String data[] = line.split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            int hours = Integer.parseInt(data[2]);
            int minutes = Integer.parseInt(data[3]);
            int seconds = Integer.parseInt(data[4]); 
            
            Time time = new Time(hours, minutes, seconds);
            
            int workHours = Integer.parseInt(data[5]);
            
            int score = Integer.parseInt(data[6]);

            users.add(new Student(name, age, workHours, time, score));
          }
      } catch (IOException ioException) {
          System.out.println("Java Exception: " + ioException);
      }
        return users;
      }
    
}
