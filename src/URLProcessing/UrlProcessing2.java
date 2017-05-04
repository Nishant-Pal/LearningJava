/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLProcessing;
import java.net.URL;

/**
 *
 * @author Nishant
 */
public class UrlProcessing2 {
    
    
    public static void main(String[] args)
    {
        try{
//use uri  first because uri will not need"java%20tutorials" for "java tutorials 
        //it uses the same format as url
        //format=("absolute url")/("first url","relative url")/("protocol","main url","relative url")
        ///("protocol","main url","port no","relative url")
        java.net.URI u=new java.net.URI("file:///F:/java%20tutorials/tutorial/networking/urls/readingWriting.html");
        URL ul=u.toURL();
        java.io.BufferedReader eyes=new java.io.BufferedReader(new java.io.InputStreamReader(ul.openStream()));
        java.io.File f=new java.io.File("hello.html");
        
        Boolean b=f.createNewFile();
        System.out.println("File exists"+f.exists()+"File created :"+b);
        f.setWritable(true);
        System.out.println(f.getAbsolutePath());
        
        String sc;
        java.io.PrintWriter pen=new java.io.PrintWriter(new java.io.FileWriter(f));
        while((sc=eyes.readLine())!=null){
           
            System.out.println(sc);
            pen.println(sc);
            pen.flush();
        }
        pen.close();
        }
      
        catch(java.io.IOException|java.net.URISyntaxException e)
        {
            System.out.println(e.getMessage()+"\n");e.printStackTrace();
        }
        
    }
    
}
