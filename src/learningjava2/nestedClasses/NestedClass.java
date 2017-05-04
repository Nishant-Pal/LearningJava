/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava2.nestedClasses;

/**
 *
 * @author Nishant
 */
public class NestedClass {
   static protected String name ;
    protected int rollNo;
    
    public void display()
    {
        this.name="nishant";
        this.rollNo=564;
        System.out.println("Name:"+name+"\n"+"Roll No:"+rollNo);
    }
    class InnerClass//Inner Class
    {
        InnerClass()
        {
            name="Nishant";
            rollNo=890;
        }
        public void display()
        {
            System.out.println("Name:"+name+"\n"+"Roll No:"+rollNo);
        }
    }
    public void print()
    {
        class Jello//Method nested class,its scope is the method only
        {
         void printl(){
             System.out.println("Jello means Hello");
         }   
        }
        Jello j=new Jello();
        j.printl();
    }
    
    
    //static nested class
    static class Myself
    {
        void play()
        {
            System.out.println(name);
        }
    }
    
}





class Test
{
    public static void main(String[] args)
    {
        //Inner Class Example
        NestedClass n=new NestedClass();
       
        NestedClass.InnerClass ob1= n.new InnerClass();
        ob1.display();
        
        
        
        //Anonymoius class
         NestedClass af=new  NestedClass(){
        public void display()
        {
            System.out.println("rollNo:"+rollNo+"name:"+name);
        }
        
        
    };
    af.display();
    af.print();//example of method nested class
    NestedClass.Myself b=new NestedClass.Myself();//example of static nested class see instantiation is different than others
    b.play();//object creation is necessary
  
}}
