/*
    Use this program to test your WeirdArray, WeirdIterator, and WeirdIterator2 classes.
*/
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestIterator_2
{
   public static void main(String[] args)
   {
      // Create and initialize a String array.
      WeirdArray<String> waS = new WeirdArray<String>(15){{
         setElement(0,  "a");
         setElement(1,  "bb");
         setElement(2,  "ccc");
         setElement(3,  "dddd");
         setElement(4,  "eeeee");
         setElement(5,  "ffffff");
         setElement(6,  "ggggggg");
         setElement(7,  "hhhhhhhh");
         setElement(8,  "iiiiiii");
         setElement(9,  "jjjjjj");
         setElement(10, "kkkkk");
         setElement(11, "llll");
         setElement(12, "mmm");
         setElement(13, "nn");
         setElement(14, "o");
      }};

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

      // Iterate through the array using the other iterator and a while-loop.
      Iterator<String> it = new WeirdIterator2<String>(waS);
      while ( it.hasNext() )
      {
         String s = it.next();
         System.out.println( s );
      }
      System.out.println();

      // Create and initialize an Integer array.
      WeirdArray<Integer> waI = new WeirdArray<Integer>(10){{
         setElement(0,  1);
         setElement(1,  22);
         setElement(2,  333);
         setElement(3,  4444);
         setElement(4,  55555);
         setElement(5,  66666);
         setElement(6,  7777);
         setElement(7,  888);
         setElement(8,  99);
         setElement(9,  0);
      }};

      // Loop through the array.
      for (int i = 0; i < waI.getLength(); i++)
      {
         System.out.println( waI.getElement(i) );
      }
      System.out.println();

      // Iterate through the array using a for-each loop.
      for (Integer i : waI)
      {
         System.out.println( i );
      }
      System.out.println();

      // Iterate through the array using the other iterator and a while-loop.
      Iterator<Integer> it2 = new WeirdIterator2<Integer>(waI);
      while ( it2.hasNext() )
      {
         Integer i = it2.next();
         System.out.println( i );
      }
      try // to go past the "end" of the iterator
      {
         Integer i = it2.next();
         System.out.println("There is a problem with the WeirdIterator2 class.");
      }
      catch (NoSuchElementException e)
      {
         System.out.println("Reached the end of the iterator.");
      }
      System.out.println();

   }
}
