/*Always remember to show date in a specified format a,and to take date from user as input 
use SimpleDateFormat.
Eg SimpleDateFormat ft=new SimpleDateFormat("dd/mm/yyyy");
    for input use ft.parse("String");
for output use ft.format(date object);
*/
/*her .getTime() will get you no of days difference in particular month on if month changes,
it will not calculate*/
package learningjava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DATE1 {

    public static void main(String[] args) {
        try{
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        String l1=d1+"/"+m1+"/"+y1;
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        String l2=d2+"/"+m2+"/"+y2;
        
        SimpleDateFormat ft=new SimpleDateFormat("dd/mm/yyyy");

        java.util.Date D1=ft.parse(l1);
        java.util.Date D2=ft.parse(l2);
        int fine=0;
        
        int m=(int)((D1.getTime()-D2.getTime())/1000/60/60/24);
        System.out.println("----*"+m);
        
            
                if(y1!=y2)
                    fine=10000;
                else if(m1>m2)
                    fine=(m1-m2)*500;
                    else
                    fine=m*15;
        
            if(fine<=0)
                fine=0;
        System.out.println(fine);

        }catch(Exception e)
            {;}
            
    }

}