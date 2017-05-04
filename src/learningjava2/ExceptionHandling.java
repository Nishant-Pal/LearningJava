/*
important methods in catch are 
.getMessage()
.printStackTrace()
.getCause()
 */
// All exceptions  are preset in java.io
//-----------------------------User Defined Exceptions----------------------------
package learningjava2;
import java.io.*;
/* for checked exception extend Exception    checked are checked at compile time
for Runtime(unchecked) exception extend RuntimeException they are checked at runtime
*/



//Step 1 create user defined exception class
public class ExceptionHandling extends Exception {
    
    public void message()
    {
        System.out.println("how dare you tried to hack");
    }
    
}
