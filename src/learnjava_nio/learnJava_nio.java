/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava_nio;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.Paths;

/**
 *
 * @author Nishant
 */
public class learnJava_nio {
    public static void main(String[] args)throws java.io.IOException
    {
       java.io.File f= new java.io.File("hello.txt");
       f.createNewFile();
       PrintWriter p=new PrintWriter(new FileWriter(f));
       p.println("Hello my name is Nishant Pal\nI am a student of Srm University");
       p.flush();
       p.close();
       Path p1=f.toPath();
       Path p2=p1.toRealPath();
       System.out.println(p1+"\n"+p2);
       System.out.println(p2.getFileName());
       System.out.println(p2.getFileSystem());
       System.out.println(p2.getName(0));
       System.out.println(p2.getRoot());
       System.out.println(p2.getParent());
       System.out.println(p2.subpath(1, 3));
       p1.resolve(p2);
       System.out.println(p1);
       Path p3=Paths.get("F:\\");
       System.out.println("Ends with "+p2.endsWith(p1));
       p3.resolve(Paths.get("Flash"));
       System.out.println(p3.resolve(Paths.get("Flash")));
       Path p4=Paths.get("Nishant");
       Path p5=Paths.get("Debjani");
       System.out.println(p4.relativize(p5));
       for(Path p23:p2)
       {
           System.out.println(p23);
       }
    }    
}
