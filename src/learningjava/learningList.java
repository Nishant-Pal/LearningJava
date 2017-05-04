/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;
import java.util.*;

/**
 *
 * @author Nishant
 */
public class learningList {
    public static void main(String[]args){
        List<Integer> l1= new LinkedList<>();
         List<Integer> l2= new ArrayList<>();
        Random ram= new Random(System.nanoTime());
        for(int i=0;i<100;i++)
        {
            l1.add(ram.nextInt(100)%45);
            l2.add(ram.nextInt(100)%45);
        }
        
        Iterator<Integer> i1=l1.iterator();int k;
         System.out.println("Linkedlist");
        while(i1.hasNext())
        {
            /*if(((k=i1.next())%2)==0)
                System.out.println(0);
           else*/
            k=i1.next();
            System.out.println(k);
                
        }
         Iterator<Integer> i2=l2.iterator();
         System.out.println("Array List");
         while(i2.hasNext())
        {
            /*if(((k=i2.next())%2)==0)
                System.out.println(0);*/k=i2.next();
           System.out.println(k);
                
        }
    }
        
        
    
    
}
