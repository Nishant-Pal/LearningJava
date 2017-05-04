/*
 as seen from implementation treeSet and HashSet both stores elements in sorted order
where as Linked HashSet does not
 */
package learningjava;
import java.util.*;

/**
 *
 * @author Nishant
 */
public class learningSet {
    public static void main(String[]args){
        Set<Integer> l1= new HashSet<>();
         Set<Integer> l2= new LinkedHashSet<>();
         Set<Integer> l3= new TreeSet<>();
         
        Random ram= new Random(System.nanoTime());
        for(int i=0;i<100;i++)
        {
            l1.add(ram.nextInt(100)%45);
            l2.add(ram.nextInt(100)%45);
            l3.add(ram.nextInt(100)%45);
            
        }
      
 
        Iterator<Integer> i1=l1.iterator();int k;long l;long ke;
        System.out.println("hash set");
       
        l=System.nanoTime();
       System.out.println("time start"+l);
         while(i1.hasNext())
        {
            /*if(((k=i1.next())%2)==0)
                System.out.println(0);
           else*/
            k=i1.next();
            System.out.println(k);
                
        }
        
        System.out.println("Time end:"+(ke=System.nanoTime()));
        System.out.println("Time taken "+(ke-l));
        
        
         Iterator<Integer> i2=l2.iterator();
         System.out.println("Linked hash set");
         l=System.nanoTime();
       System.out.println("time start"+l);
         while(i2.hasNext())
        {
            /*if(((k=i2.next())%2)==0)
                System.out.println(0);*/k=i2.next();
           System.out.println(k);
                
        }
  System.out.println("Time end:"+(ke=System.nanoTime()));
  System.out.println("Time taken "+(ke-l));
          
         i2=l3.iterator();
         System.out.println("Tree set");
         l=System.nanoTime();
                System.out.println("time start"+l);         
         while(i2.hasNext())
        {
            /*if(((k=i2.next())%2)==0)
                System.out.println(0);*/k=i2.next();
           System.out.println(k);
                
        }
         System.out.println("Time end:"+(ke=System.nanoTime()));
          System.out.println("Time taken "+(ke-l));
          System.out.println("We conclude that tree is fastest");  
    }
        
        
    
    
}
