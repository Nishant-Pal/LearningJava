/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLProcessing;
  import java.net.*; 
import java.io.*;

/**
 *
 * @author Nishant
 */
public class Urlprocessing1  
{ 
   public static void main(String [] args) 
   { 
      
      try 
      { 
         URL url = new URL("https://www.tutorialspoint.com/java/java_using_comparator.htm"); 
          
         System.out.println("URL is " + url.toString()); 
         System.out.println("protocol is " + url.getProtocol()); 
         System.out.println("authority is " + url.getAuthority()); 
         System.out.println("file name is " + url.getFile()); 
         System.out.println("host is " + url.getHost()); 
         System.out.println("path is " + url.getPath()); 
         System.out.println("port is " + url.getPort()); 
         System.out.println("default port is " + url.getDefaultPort()); 
         System.out.println("query is " + url.getQuery()); 
         System.out.println("ref is " + url.getRef()); 
      }catch(IOException e) 
      { 
         e.printStackTrace(); 
      } 
   } 
}

