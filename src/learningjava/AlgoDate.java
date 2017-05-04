/*Always remember to show date in a specified format a,and to take date from user as input 
use java.text.SimpleDateFormat.
Eg SimpleDateFormat ft=new SimpleDateFormat("dd/mm/yyyy");
    for input use ft.parse("String");
for output use ft.format(date object);
*/


/*format for date= dd/MM/yyyy
    format for time= hh:mm:ss a;
*/

/*for current time use System.currentTimeMillis*/

package learningjava;
import java.util.*;

/**
 *
 * @author Nishant
 */
public class AlgoDate {
    public static void main(String args[])
    {
        try
        {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the current date in dd/mm/yyyy");
        String d1=sc.next();
        java.text.SimpleDateFormat s1=new java.text.SimpleDateFormat("dd/MM/yyyy");
        Date D1=s1.parse(d1);
        Calendar c1=new GregorianCalendar();
        c1.setTime(D1);
        int m1=c1.get(Calendar.MONTH)+1;
        int y1=c1.get(Calendar.YEAR);
        int d11=c1.get(Calendar.DAY_OF_MONTH);
        System.out.println("day :"+d11+"\nmonth "+m1+"\nyear :"+y1);
        }
        catch(Exception e)
        {
            ;
        }
    }
        
        
        
    }
    

