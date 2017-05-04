/*
 learning volatile
 */
package learningThreading;

/**
 *
 * @author Nishant
 */
class Abc
{
    public static volatile int no=0;
    
    public static void increment(){
        no++;
    }
    public static int show(){return no;}
}
public class learningThread2 {
    
    static Abc a=new Abc();
    public static void main(String[] args)
    {
       Thread t= new Thread(){
           public void run()
           {
               Abc.increment();try{Thread.sleep(2000);}catch(java.lang.InterruptedException e)
               {
                   e.getCause();
               }
              System.out.println( Abc.show());
               
           }};
           Thread t1=new Thread(){
               public void run(){
                   Abc.increment();
                   try{Thread.sleep(2000);}catch(java.lang.InterruptedException e)
               {
                   e.getCause();
               }
                   System.out.println(Abc.show());
               }
           };
           t.start();
           t1.start();
           
           
       };
    }
    

