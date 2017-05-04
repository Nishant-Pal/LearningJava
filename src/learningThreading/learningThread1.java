/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningThreading;

/**
 *
 * @author Nishant
 */
class Hello extends Thread
{
    public void run()
    {
       try{Thread.sleep(1000);
       for(int i=0;i<100;i++)
        {
            System.out.println(i);
           
        }
       }
       catch(java.lang.InterruptedException e)
       {
           e.getMessage();
    }
}}
public class learningThread1 {
   
    public static void main(String[] args)throws java.lang.InterruptedException{
        
        
   //default method of thread creation
    Thread t=new Hello();
     t.start();
     try{t.join();}catch(java.lang.InterruptedException e){e.getMessage();}
    
     //the .join() method causes the current execution to wait until the thread that has invoked .join is finished
     //it also throws java.lang.InterruptedException like Thread.sleep();
     
    java.io.PrintWriter pen=new java.io.PrintWriter(System.out);
     
    pen.println("New Way of thread creation");
    pen.flush();
    
    
    //another way of thread creation
  
    Thread t1=new Thread(new Hello());
    t1.start();
    t1.join() ;
    pen.println("Another way of thread creation");
    pen.flush();
    
    //another way of thread creation
    Thread t2=new Thread(){
        public void run()
        {
            System.out.println("hhahahahhaha");
        }
    };t2.start();
   
  
 
    }
    
    
    }  

