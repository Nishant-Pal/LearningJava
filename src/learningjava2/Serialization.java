/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava2;
import java.io.*;

/**
 *
 * @author Nishant
 */

class Employee implements java.io.Serializable 
{ 
   public String name; 
   public String address; 
   public transient int SSN; 
   public int number; 
    
   public void mailCheck() 
   { 
      System.out.println("Mailing a check to " + name + " " + address); 
   } 
} 
 
public class Serialization {
     public static void main(String [] args) 
   { 
      Employee e = new Employee(); 
      e.name = "Reyan Ali"; 
      e.address = "Phokka Kuan, Ambehta Peer"; 
      e.SSN = 11122333; 
      e.number = 101; 
       
      try 
      { 
         FileOutputStream fileOut = new FileOutputStream("employee.ser"); //Remember objecty file isaved with.ser extension
         ObjectOutputStream out = new ObjectOutputStream(fileOut); 
         out.writeObject(e); 
         out.close(); 
         fileOut.close(); 
  System.out.printf("Serialized data is saved in /tmp/employee.ser"); 
      }catch(IOException i) 
      { 
          i.printStackTrace(); 
      } 
   } 
}     

