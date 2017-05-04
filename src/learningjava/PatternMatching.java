/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Nishant
 */
public class PatternMatching {
    
    static void main1()
    {
        String name="(hello*)|(HSJJjdjfkfkdk$)";
        Pattern p=Pattern.compile(name);
        Matcher m=p.matcher("WHYYWHWWHJWJ HSJJjdjfkfkdk");
        while(m.find())
        {
         System.out.println("The start method returns the start index of the \n"
                 + "subsequence captured by the given group during the previous\n"
                 + " match operation.  m.start() :"+m.start());
         System.out.println(m.group(0));
         System.out.println(m.group(1));
         System.out.println(m.group(2));
         System.out.println("the end returns the index of the last character "
                + "matched, plus one: m.end()"+m.end());
        }
    }
        static void main2() 
       {
           String pat="9971321507";
           Pattern p=Pattern.compile(pat);
           Matcher m=p.matcher("45465623232399713215074545656456792");
           System.out.println("matches method compares the whole string and if it matches "
                   + "then returns true :m.matches(): "+m.matches()+"\n");
           System.out.println("lookingAt method Attempts to match the input sequence,\n"
                   + " starting at the beginning of the region, against the pattern:\n"
                   + "m.lookingAt() "+m.lookingAt());
           System.out.println("\n"+"to find a middle substring"
                   + "in a string use : m.find() :"+m.find());
       }
        
        static void main3()
        {
           try{ String ab="pig cute cute cute cute cute hip";
            Pattern p =Pattern.compile("(hip$)|(^pig)");
            int l="cute".length();
            Matcher m= p.matcher(ab);
            System.out.println(l);int count=0;
           while(m.find())
            {
               
                count++;
                System.out.println("start:"+m.start());//1
                System.out.println("end:"+(m.end()));//2-> 1 and 2 should be used one after other
                System.out.println("group:"+m.group(1)); 
             
            } 
           System.out.println("count :"+count);
           }catch(Exception e){;}
        }
          
        static void main4()
          {
           String ab="cute cute cute cute cute";
            Pattern p =Pattern.compile("cute");
            int l="cute".length();
            Matcher m= p.matcher(ab);
            System.out.println(l);
           while(m.find())
            {
               
               
                System.out.println(m.replaceFirst("Bald"));
                System.out.println("\n"+ab);
                System.out.println(m.replaceAll("bald"));
                
                
            } 
           
           
          }
        static void main5()//go for replacement by using this method
        {
            String ab="fake fake fake  fake";
            Pattern p=Pattern.compile("fake");
            Matcher m=p.matcher(ab);
            StringBuffer f =new StringBuffer();
            while(m.find())
            {
                m.appendReplacement(f,"real");
                
                System.out.println(f.toString());
            }
            m.appendTail(f);
            System.out.println(f.toString());
    
        }
        
        
        public static void main(String[] args)
        {
        main1();
        }
           
           
            
       }
       
        
        
    
    

