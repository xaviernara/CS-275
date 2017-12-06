/*
   This file tests mostly addFirst(), addLast(), removeFirst(), removeLast(),
                          addBefore(), addAfter(), and removeCurrent().
*/
public class TestIntLinkedSeq_ver1
{
   public static void main(String[ ] args)
   {
      IntSeq seq1 = new IntLinkedSeq( );
      IntSeq seq2 = new IntLinkedSeq( );
 /*
      //seq1.addAfter(77);
      seq1.addFirst(42);
      seq1.removeFirst();
      System.out.println("seq1 after first removed " +seq1 );
      seq1.addFirst(78);
      seq1.addFirst(90);
      seq1.addFirst(33);
      seq1.setCurrent(1);
      
      
      //seq1.addBefore(69);
      seq1.removeCurrent();
      System.out.println("seq1 after removed current "+ seq1);
      
      
      seq2.addFirst(1);
      seq2.addFirst(2);
      seq2.addFirst(3);
      seq2.addFirst(4);
      seq2.setCurrent(2);
      seq2.addBefore(6);
      
      seq1.addAll(seq2);

     
      //seq1.removeLast();
    
      seq1.removeCurrent();
      System.out.println( "after remvoed current "+ seq1 );
      
      seq1.addFirst(12);
      seq1.addLast(1);
      seq1.addLast(19);
      seq1.removeLast();
  

     //int[] arrayFromList = seq1.toArray();
     int[] arrayFromList2 = seq2.toArray();
      
     //System.out.println("array from seq [ " +arrayFromList+ " ]"  );
     System.out.println("array from seq [ " +arrayFromList2+ " ]"  );
      
     
      //seq1.setCurrent(3);
     // seq1.reverse();
      //seq1.catenation(seq1);
      
      //System.out.println("cancatenate"+seq1.catenation(seq1) );

      
      //seq1.removeFirst();
      
      //System.out.println("cursor = "+seq1.getCurrentValue());  
          
      System.out.println( seq1 );
      
      if ( seq1.size() != 4) //|| !seq1.contains(42) )
      {
         System.out.println("1. There is something wrong with addFirst() or contains().");
         System.out.println( seq1 );
         //System.exit(-1);
      }
      
      //seq2.addLast(1);
     
    */
      
      
      seq1.addFirst(42);
      seq1.removeLast();
      if ( seq1.size() != 0 || seq1.contains(42) )
      {
         System.out.println("2. There is something wrong with removeLast() or contains().");
         System.out.println( seq1 );
         System.exit(-1);
      }

      seq2.addLast(-42);
      if ( seq2.size() != 1 || !seq2.contains(-42) )
      {
         System.out.println("3. There is something wrong with addLast() or contains().");
         System.out.println( seq2 );
         System.exit(-1);
      }
      seq2.removeFirst();
      if ( seq2.size() != 0 || seq2.contains(-42) )
      {
         System.out.println("4. There is something wrong with removeFirst() or contains().");
         System.out.println( seq2 );
         System.exit(-1);
      }


      seq1.addBefore(242);
      seq1.addBefore(142);
      seq1.advance();
      seq1.addAfter(342);
      if ( seq1.size() != 3 || !seq1.toString().equals("[142, 242, 342*]") )
      {
         System.out.println("5. There is something wrong with addBefore(), addAfter(), or advance().");
         System.out.println( seq1 );
         System.exit(-1);
      }


      seq2.addAfter(342);
      seq2.addBefore(142);
      seq2.addAfter(242);
      seq2.advance();
      seq2.addAfter(442);
      if ( seq2.size() != 4 || !seq2.toString().equals("[142, 242, 342, 442*]") )
      {
         System.out.println("6. There is something wrong with addBefore(), addAfter(), or advance().");
         System.out.println( seq2 );
         System.exit(-1);
      }

      seq2.start();
      seq2.advance();
      seq2.advance();
      seq2.advance();
      seq2.removeCurrent();
      if ( seq2.size() != 3 || !seq2.toString().equals("[142, 242, 342]") )
      {
         System.out.println("7. There is something wrong with removeCurrent().");
         System.out.println( seq2 );
         System.exit(-1);
      }

      seq2.start();
      seq2.advance();
      seq2.removeCurrent();
      if ( seq2.size() != 2 || !seq2.toString().equals("[142, 342*]") )
      {
         System.out.println("8. There is something wrong with removeCurrent().");
         System.out.println( seq2 );
         System.exit(-1);
      }


      seq1.addLast(442);
      seq1.addFirst(42);
      seq1.addBefore(-300);
      if ( seq1.size() != 6 || !seq1.toString().equals("[42, 142, 242, -300*, 342, 442]") )
      {
         System.out.println("9. There is something wrong with addLast(), addFirst(), or the current element.");
         System.out.println( seq1 );
         System.exit(-1);
      }
      seq1.setCurrent(4);
      if ( seq1.size() != 6 || !seq1.toString().equals("[42, 142, 242, -300, 342*, 442]") )
      {
         System.out.println("10. There is something wrong with setCurrent().");
         System.out.println( seq1 );
         System.exit(-1);
      }
      seq1.setCurrentValue(1042);
      if ( seq1.size() != 6 || !seq1.toString().equals("[42, 142, 242, -300, 1042*, 442]") )
      {
         System.out.println("11. There is something wrong with setCurrentValue().");
         System.out.println( seq1 );
         System.exit(-1);
      }
      

      System.out.println("Your class IntLinkedSeq passed all these tests.");
   }//main() 
 }//TestIntLinkedSeq_ver1
//}
