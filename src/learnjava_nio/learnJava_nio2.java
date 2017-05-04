/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava_nio;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


import java.nio.file.StandardOpenOption;


/**
 *
 * @author Nishant
 */
public class learnJava_nio2 {
    
    public static void main(String[] args)throws java.io.IOException
    {
        System.out.println("Enter the name of the file");
        String name=new java.util.Scanner(System.in).next();
        Path f1=Paths.get(name);
        if(Files.deleteIfExists(f1))
        Files.createFile(f1);
        PrintWriter pen=new PrintWriter(new OutputStreamWriter(Files.newOutputStream(f1)));
        
       Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the contents of the file\nFor exit press eNd");
        String word;
        while(!(word=sc.next()).contains("eNd"))
        {
              pen.println(word);
              pen.flush();
        }
      
        
        pen.close();
        System.out.println(Files.readAllLines(f1));
        
        
    }
    
    }

