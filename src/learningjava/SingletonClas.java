/*
 A singleton class is a class whose only one object can be created .It is used to limit the no
 of resources .For example if a single database connection is only allowed then it is made using singleton class
 */
package learningjava;

/**
 *
 * @author Nishant
 */
public class SingletonClas {

    /**
     * make the constructor private to prevent instantiation
     */
   private SingletonClas(){;}
   
   public static String ab ="This is  singleton class";
     public String ab1 ="2)  This is  singleton class";
     private String ab2 ="3)  This is  singleton class";
   /*
   make a private instance of class that is accesible only by class method 
   but is returnable in a static method and can be referenced in 
     a static method (public static void main method)
   
   */
   private static SingletonClas singleton=null;
   
   /*create a method to use the single instance of the class 
   make it static so that the method can be called by Class name*/
   public static SingletonClas getInstance()
   {/*this technique is lazy instantiation*/
       if(singleton==null)
       singleton=new SingletonClas();
       return singleton;
   }
   public  String getMessage()
   {
       return ab2;
   }
   
   
        
    
}

class Sample
{
    
    public static void main(String args[])
    {
        SingletonClas alpha=SingletonClas.getInstance();
        System.out.println(alpha.ab);
        /*  since ab is public so it can be accessed through class name itself*/
        System.out.println(SingletonClas.ab);
        /* so in order for a data element to be accessed by object only remove static
           */
        System.out.println(alpha.ab1);
        /* in order for a data element o be accesed by method only declare it private*/
        System.out.println(alpha.getMessage());
        
    }
}





