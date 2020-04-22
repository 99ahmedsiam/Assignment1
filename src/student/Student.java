/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.Serializable;

/**
 *
 * @author Ahmed
 */
public abstract class Student implements Serializable{
    
    private int id ; 
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }
    private double grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    
   abstract public  double  grade();
    
}
