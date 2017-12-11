/*
    Use this program to test your WeirdArray and WeirdIterator classes.
*/
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestIterator
{
   public static void main(String[] args)
   {
      // Create a String array of size 11.
      WeirdArray<String> waS = new WeirdArray<String>(11);
      // Initialize the array.
      waS.setElement(0,  "a");
      waS.setElement(1,  "bb");
      waS.setElement(2,  "ccc");
      waS.setElement(3,  "dddd");
      waS.setElement(4,  "eeeee");
      waS.setElement(5,  "ffffff");
      waS.setElement(6,  "ggggg");
      waS.setElement(7,  "hhhh");
      waS.setElement(8,  "iii");
      waS.setElement(9,  "jj");
      waS.setElement(10, "k");

      // Loop through the array.
      for (int i = 0; i < waS.getLength(); i++)
      {
         System.out.println( waS.getElement(i) );
      }
      System.out.println();

      // Iterate through the array using a for-each loop.
      for (String s : waS)
      {
         System.out.println( s );
      }
      System.out.println();

      // Create and initialize an Integer array of size 10.
      // For the "double brace" notation, see
      //   http://www.c2.com/cgi/wiki?DoubleBraceInitialization
      WeirdArray<Integer> waI = new WeirdArray<Integer>(10){{
         setElement(0, 0);
         setElement(1, 11);
         setElement(2, 222);
         setElement(3, 3333);
         setElement(4, 44444);
         setElement(5, 55555);
         setElement(6, 6666);
         setElement(7, 777);
         setElement(8, 88);
         setElement(9, 9);
      }};
      // Iterate through this array using a while-loop.
      Iterator<Integer> it = waI.iterator();
      while ( it.hasNext() )
      {
         Integer i = it.next();
         System.out.println( i );
      }
      try // to go past the "end" of the iterator
      {
         Integer i = it.next();
         System.out.println("There is a problem with the WeirdIterator class.");
      }
      catch (NoSuchElementException e)
      {
         System.out.println("Reached the end of the iterator.");
      }
      System.out.println();
   }
}
