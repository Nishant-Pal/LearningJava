/*
 Tagging a interface means creating an empty interface and extending it
 I don't find it useful because none of the methods of the extende class
can be accessed fom interface's object*/

/**
 *
 * @author Nishant
 */
interface I1
{}
public class LearningInterface implements I1  {
 public void display()
  {
      System.out.println("Hello");
  }
}

class Maybe
{
    public static void main(String[] args)
    {
        I1 i=new LearningInterface();
       System.out.println( i.getClass());
    }
}
