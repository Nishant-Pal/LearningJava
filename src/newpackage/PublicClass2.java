/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import learningjava.PublicClass;

/**
 *
 * @author Nishant
 */
public class PublicClass2 extends PublicClass {
        static public int b=4;
        public void mess()
        {
         System.out.println("hello");   
        }
        public void message()
        {
              System.out.println(this.b);
        }
 void claim()
 {
     this.a=3;
 }
}

class PublicClass3 extends PublicClass2
{
    
}
class Main
{
    public static void main(String[] args)
    {
        PublicClass2 p=new PublicClass3();
        
        p.message();
        
        
        
    }
}


