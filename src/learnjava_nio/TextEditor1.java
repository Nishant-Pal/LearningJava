package learnjava_nio;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class TextEditor1{
   static private java.util.Scanner sc=new java.util.Scanner(System.in);
    private int lineNO;
    private int POSI;
  
    TextEditor1()
    {
        lineNO=-1;
        POSI=-1;
  
    }
   
Path openFile(String Name)throws java.io.IOException
{
    Path p=Paths.get(Name);
    
    if(!Files.exists(p))
        Files.createFile(p);
        display(p);
        System.out.println("\n\nFile opened successfully");
        return p;
        
    
}
void writeFile(Path Name)throws java.io.IOException
{
    PrintWriter pen=new PrintWriter(new FileWriter(Name.toFile(),true));
    String word;
    System.out.println("Now enter the data in the file.\nPress eNd for exit");
    
    while(!(word=sc.nextLine()).contains("eNd"))
    {
      
       pen.println(word);
    }
    
    pen.close();
    display(Name);
}

void display(Path Name)throws java.io.IOException
{
    System.out.println();
    BufferedReader eyes=Files.newBufferedReader(Name,Charset.defaultCharset());
    String word;
    while((word=eyes.readLine())!=null)
    {
        System.out.println(word);
    }
    eyes.close();
    System.out.println();
}

public void paste(Path Name,String ab)throws IOException
{
    display(Name);
    System.out.println("Enter the line no at which you want to paste the string");
    int LineNo=sc.nextInt()-1;
    int size=Files.readAllLines(Name).size();
    if(LineNo>=size)
    {
        System.out.println("Wrong line no entered");
    
        return;
    }
    System.out.println("Enter the position at which you want to paste the string");
    int Pos=sc.nextInt()-1;
    int count=-1;
    
    BufferedReader eyes=Files.newBufferedReader(Name);
    Path pl=Paths.get("Temp.txt");
    if(Files.deleteIfExists(pl))
    {
    Files.createFile(pl);
    }
    PrintWriter pen=new PrintWriter(new FileWriter(pl.toFile()));
    String word;
    while((word=eyes.readLine())!=null)
    {   count++;
        if(count==LineNo)
        {
            if(Pos>word.length())
            {
                System.out.println("Wrong position entered");
                return;
            }
            pen.write(word.substring(0, Pos));
            pen.flush();
            pen.write(ab);
            pen.flush();
            pen.write(word.substring(Pos,word.length()));
            pen.flush();
        }
        else
        {pen.write(word);
        pen.flush();
        }
    
    
    }pen.close();
    eyes.close();
    Files.move(pl, Name,StandardCopyOption.REPLACE_EXISTING);
    display(Name);
}
boolean find(Path Name,String ab)throws IOException
{
    BufferedReader eyes =Files.newBufferedReader(Name);
    String word;int count=-1;lineNO=-1;POSI=-1;
    while((word=eyes.readLine())!=null)
    {
        count++;
        if(word.contains(ab))
        { lineNO=count;
            System.out.println("Line No:"+lineNO+1);
            POSI=word.indexOf(ab);
            System.out.println(" initial position:"+POSI+1);
            
            eyes.close();
            return true;
        }
    }
        eyes.close();
        return false;
}

public void copy(Path Name)throws IOException
{   
    display(Name);
    System.out.println("Enter the string to be copied");
    String word=sc.next();
    if(find(Name,word))
    {
        paste(Name, word);
    }
    else
        System.out.println("Sorry ,the string is not present");
        
    
}

public void cut(Path Name)throws IOException
{
    display(Name);
    System.out.println("Enter the string to be cut");
    String word1=sc.next();
    if(find(Name,word1))
    {
          int count =-1;
   
    BufferedReader eyes=Files.newBufferedReader(Name);
    Path pl=Paths.get("Temp.txt");
    Files.deleteIfExists(pl);
    Files.createFile(pl);
    
    PrintWriter pen=new PrintWriter(new FileWriter(pl.toFile()));
    String word;
    while((word=eyes.readLine())!=null)
    {   count++;
        if(count==lineNO)
        {
            pen.write(word.replace(word1, ""));
            pen.flush();
            
        }
        else
        {
            pen.println(word);
        pen.flush();
        }
    
    
    }pen.close();
    eyes.close();
    Files.move(pl, Name,StandardCopyOption.REPLACE_EXISTING);
    display(Name);
        
    }
    else
        System.out.println("Sorry ,the string is not present");
    
    
}
public static void main(String[] args)throws java.io.IOException
{
    TextEditor1 t1=new TextEditor1();

    System.out.println("Enter the name of the file to be opened");
    Path f1=t1.openFile(sc.next());int a;
    
    while(true)
    {
        System.out.println("Enter the option you want to perform with the file:\n1)write"
                + "\n2)display\n3)copy\n4)cut\n5)delete\n6)exit");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
                    t1.writeFile(f1);
                    break;
            case 2:if(Files.exists(f1))
                    t1.display(f1);
                    else System.out.println("File does not exists");
                    break;
            case 3:if(Files.exists(f1))
                    t1.copy(f1);
                    else System.out.println("File does not exists");
                    break;
            case 4:if(Files.exists(f1))
                   t1.cut(f1);
                   else System.out.println("File does not exists");
                   break;
            case 5:Files.deleteIfExists(f1);
                    break;
            case 6:System.exit(0);
                    break;
            
            
        }
    }

}
}
