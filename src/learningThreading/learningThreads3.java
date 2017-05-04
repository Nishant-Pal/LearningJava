/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningThreading;

import java.util.Collections;

/**
 *
 * @author Nishant
 */
class Counter{
    volatile int c;
    Counter(){
        c=0;
    }
    public void flip(){
        c=(c==0)?1:0;
    }
    public int show()
    {
        return c;
    }
}
public class learningThreads3 {
    public static void main(String[] ar)
    {
       Counter c1=new Counter();
        Thread t= new Thread(){
          public void run()
          {
              synchronized(System.out){
              for(int i=0;i<100;i++)
              {
                  System.out.print(i);
                  if(c1.show()==0)
                      try{System.out.wait(200);}catch(java.lang.InterruptedException e){
                          e.printStackTrace();
                      }
                  
                  c1.flip();
                  System.out.notifyAll();
              }}
          }};
          Thread t1= new Thread(){
          public void run()
          {
              synchronized(System.out){
                  
              for(int i=0;i<100;i++)
              {
                  
                  if(c1.show()==1)
                      try{System.out.wait(500);}catch(java.lang.InterruptedException e){
                          e.printStackTrace();
                      }
                  System.out.println("\t"+(2*i));
                  c1.flip();
                  System.out.notifyAll();
              }
          }}
        };
          
          t.start();
          t1.start();
    

    
    
}
}
