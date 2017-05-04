
package learningjava;

/**
 *
 * @author Nishant
 */
public class PublicClass {
      public int name;
      protected int a;
      private int b;
     
      protected void mess()
      {
          System.out.println("package private inheritance is possible");
      }
      
      public void message()
      {
          this.b=5;
          
          System.out.println("the value of b is :"+this.b);
      }
      
    
}

class PackagePrivate
{
    int no;
    
}
