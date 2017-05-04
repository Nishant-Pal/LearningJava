/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava2;
import learningjava2.ExceptionHandling;
//step 2 make the exception thrown from the required method
/**
 *
 * @author Nishant
 */
public class ExceptionHandling1 {
    private int no =0;
    public void add()
    {
        no=1;
    }
    public void display() throws ExceptionHandling//this is required so that the system beccomes aware that an exception is going to be thrown
    {
        if(no==1)
            throw new ExceptionHandling();
    }
    
}//step three catch the exception

class Exc
{
    
    public static void main(String[] args)
    {
        try{
            ExceptionHandling1 e1=new ExceptionHandling1();
            e1.add();
            e1.display();
            
        }
        catch(ExceptionHandling e)
        {
            e.message();
            
        }        
    }
}