/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ahmed
 */
public class Main 
{
      private static final String filepath="C:\\Users\\CH9319\\Documents\\NetBeansProjects\\Student\\src\\student\\test";

        public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
      
    public static void main(String[] args) throws FileNotFoundException 
    {
         Student[] std = 
         {
            new ArtStudent(30, 45, 10 ,2 , "yazan" , "IT"),
            new ArtStudent(25, 45, 10 ,2 , "ahmed" , "IT"),
            new ArtStudent(22, 45, 10 ,2 , "ameer" , "IT"),
            new ItStudent(28, 40, 10 ,2 , "abood" , "IT"),
            new ItStudent(10, 40, 10 ,2 , "rami" , "IT")
        };
        
        
        List<Student> stdliststd = Arrays.asList(std).
                stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());;
                
        System.out.println("Sorted Student");
        
        FileOutputStream fileOut = new FileOutputStream(filepath);
          
            System.out.println("The Object  was succesfully written to a file");
        
        
        for(Student std1: stdliststd)
        {
            System.out.println(std1.getName());
            
        Main objectIO = new Main();

        objectIO.WriteObjectToFile(std1);        
        
        }

        
               
        
        
    }
    
}
