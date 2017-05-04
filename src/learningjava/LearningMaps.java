/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;
import java.util.*;
import java.io.*;

/**
 *
 * @author Nishant
 */
public class LearningMaps {
    public static void main(String[]args)throws java.io.IOException
    {
        Random r=new Random(System.currentTimeMillis());
        Map<Integer,Integer> m1=new HashMap();
        Map<Integer,Integer> m2=new LinkedHashMap();
        Map<Integer,Integer> m3=new TreeMap();
        
       
        
        
        //Putting entries in map
        
        for(int i=0;i<100;i++)
        {
            m1.put(i,(r.nextInt(1000)%34));
            m2.put(i,(r.nextInt(1000)%345));
            m3.put(i,(r.nextInt(1000)%334));
        }
        //Display entries from mapint k;
        for(int i=0;i<100;i++)
        {
            System.out.println("Hash Map entry "+m1.get(i));
            System.out.println("LinkeHash Map entry "+m2.get(i));
            System.out.println("Tree Map entry "+m3.get(i));
        }
        
    
        
        Set s1=m1.entrySet();
        Iterator i =s1.iterator();
        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
        }
       
        
        
         s1=m2.entrySet();
         i =s1.iterator();
        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
        }
       
        
          s1=m3.entrySet();
         i =s1.iterator();
        while(i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
        }
       
}
    
}
