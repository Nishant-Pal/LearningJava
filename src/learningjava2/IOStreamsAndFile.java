/*
 always remember to use .flush method while writing from file
 */
package learningjava2;
import java.io.*;

/**
 *
 * @author Nishant
 */
public  abstract class IOStreamsAndFile {
   static int n=0; 
    //for handling file File object can be used 
    File f=new File("hello.txt");
    /*
            --->InputStream  ->1)FileInputStream
                 (abstract)            ->2)ByteArrayInputStream-->
                                                        --->BufferedInputStream/DataInputStream
                             ->3)FilterInputStream----->    
                             ->4)ObjectInputStream
 Object
            
    
    
    
            --->OutputStream  ->1)FileOutputStream
                 (abstract)             ->2)ByteArrayOutputStream-->
                                                        --->BufferedOutputStream/DataOutputStream
                              ->3)FilterOutputStream----->    
                              ->4)ObjectOutputStream
    
    to append file use this new FileOutputStream("Filename",true);
    */
 public static void WriteFile()throws java.io.FileNotFoundException,java.io.IOException
  {
      FileOutputStream out1= new FileOutputStream("Sample.bin")    ;  
      String ab="Welcome to sample file";
      out1.write(ab.getBytes());
      out1.flush();
      out1.close();
  }
  
  public static void readFile()throws java.io.FileNotFoundException,java.io.IOException
 {
      InputStream in= new FileInputStream("Sample.bin");
        byte[] b=new byte[50];
       /* in.read(b);   
        System.out.println(b);*/
      int b1;
      while((b1=in.read())!=-1)
      {
          
          System.out.println(b1);
      }
      
       
        in.close();
  }
      public static void main(String[] arg) throws java.io.IOException
      {
          try{
          WriteFile();
          readFile();
         
          }
          catch(Exception e)
          {e.printStackTrace();}
          File f=new File("Sample.bin");
          System.out.println(f.getCanonicalPath());
  }
    
    
    
}
