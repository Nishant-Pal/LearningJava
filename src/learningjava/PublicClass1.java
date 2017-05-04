/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;



/**
 *
 * @author Nishant
 */
public class PublicClass1 extends PublicClass {
    
    public static void main(String[] args)
    {
        PublicClass ball=new PublicClass();
        ball.name=2;
        PackagePrivate bat=new PackagePrivate();
        bat.no=3;
        ball.mess();
        PublicClass1 t =new PublicClass1();
        t.mess();
        
    }

 
    }
     
  
 

