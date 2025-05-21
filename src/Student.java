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
 * @author 
 */
public class Student extends User {
    private int score;
    private static final int DEFAULT_SCORE = 0;
    private double studyHours = 0;
    
    public Student(String name, int age, double studyHours, Time time) {
        super(name, age, time);
        this.score = DEFAULT_SCORE;
        this.studyHours = studyHours;
    }
    
    public double getStudyHours() {
        return studyHours;
    }
    
    public void setStudyHours(double studyHours) {
        this.studyHours = studyHours;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + "Age: " + getAge() + "Daily Study Hours: " + getStudyHours(); 
    }
    
    public static ArrayList<Student> readFromFile(String fileName) {
       ArrayList <Student> students = new ArrayList<>();

       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          String line;
          while ((line = reader.readLine()) != null) {
            String data[] = line.split(",");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            String[] timeParts = data[2].split(",");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int seconds = Integer.parseInt(timeParts[2]); 
            Time time = new Time(hours, minutes, seconds);
            
            double studyHours = Double.parseDouble(data[3]);

            students.add(new Student(name, age, studyHours, time));
          }
      } catch (IOException ioException) {
          System.out.println("Java Exception: " + ioException);
      }
        return students;
      }
}
