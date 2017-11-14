/*
   This file tests toArray(), reverse(), subSeq(), addAll(), catenation(), and the copy constructor
*/
public class TestIntLinkedSeq_ver2
{
   public static void main(String[ ] args)
   {
      IntSeq seq1 = new IntLinkedSeq( );
      IntSeq seq2 = new IntLinkedSeq( );

      seq1.addFirst(42);
      seq1.addFirst(52);
      seq1.addFirst(62);
      seq1.addFirst(72);
      seq1.addFirst(82);
      seq1.addFirst(92);

      seq2.addFirst(142);
      seq2.addFirst(152);
      seq2.addFirst(162);
      seq2.addFirst(172);
      seq2.addFirst(182);
      seq2.addFirst(192);

      if ( seq1.size() != 6 || !seq1.toString().equals("[92, 82, 72, 62, 52, 42]") )
      {
         System.out.println("1. There is something wrong with addFirst().");
         System.out.println( seq1 );
         System.exit(-1);
      }
      if ( seq2.size() != 6 || !seq2.toString().equals("[192, 182, 172, 162, 152, 142]") )
      {
         System.out.println("2. There is something wrong with addFirst().");
         System.out.println( seq2 );
         System.exit(-1);
      }


      int[] arrayFromList = seq1.toArray();
      if ( arrayFromList.length != 6
        || arrayFromList[0] != 92
        || arrayFromList[1] != 82
        || arrayFromList[2] != 72
        || arrayFromList[3] != 62
        || arrayFromList[4] != 52
        || arrayFromList[5] != 42 )
      {
         System.out.println("3. There is something wrong with toArray().");
         System.out.println( arrayFromList );
         System.exit(-1);
      }


      IntSeq listCopy = new IntLinkedSeq( (IntLinkedSeq)seq1 );  // make a copy of seq1
      if (listCopy == seq1)
      {
         System.out.println("4. There is something wrong with the Copy Constructor.");
         System.exit(-1);
      }
      if ( listCopy.size() != 6 || !listCopy.toString().equals("[92, 82, 72, 62, 52, 42]") )
      {
         System.out.println("5. There is something wrong with the Copy Constructor.");
         System.out.println( listCopy );
         System.exit(-1);
      }
      listCopy.removeFirst();
      listCopy.removeLast();
      if ( seq1.size() != 6 || !seq1.toString().equals("[92, 82, 72, 62, 52, 42]") )
      {
         System.out.println("6. There is something wrong with the Copy Constructor.");
         System.out.println( listCopy );
         System.exit(-1);
      }

      listCopy.start();
      listCopy.advance();
      listCopy = new IntLinkedSeq( (IntLinkedSeq)listCopy );  // clone with a cursor
      if ( listCopy.size() != 4 || !listCopy.toString().equals("[82, 72*, 62, 52]") )
      {
         System.out.println("7. There is something wrong with the Copy Constructor.");
         System.out.println( listCopy );
         System.exit(-1);
      }

      IntSeq reversed = listCopy.reverse();
      if ( reversed.size() != 4 || !reversed.toString().equals("[52, 62, 72, 82]") )
      {
         System.out.println("8. There is something wrong with reverse().");
         System.out.println( reversed );
         System.exit(-1);
      }
      reversed.start();   // now include a cursor
      reversed.advance();
      if ( reversed.size() != 4 || !reversed.toString().equals("[52, 62*, 72, 82]") )
      {
         System.out.println("9. There is something wrong with reverse().");
         System.out.println( reversed );
         System.exit(-1);
      }

      IntSeq subSeq = seq1.subSeq(1, 4);
      if ( subSeq.size() != 3 || !subSeq.toString().equals("[82, 72, 62]") )
      {
         System.out.println("10. There is something wrong with subSeq().");
         System.out.println( subSeq );
         System.exit(-1);
      }

      subSeq.addAll( seq2 );
      if ( subSeq.size() != 9 || !subSeq.toString().equals("[82, 72, 62, 192, 182, 172, 162, 152, 142]") )
      {
         System.out.println("11. There is something wrong with addAll().");
         System.out.println( subSeq );
         System.exit(-1);
      }


      IntSeq concat = seq1.catenation( seq2 );
      if ( concat.size() != 12 || !concat.toString().equals("[92, 82, 72, 62, 52, 42, 192, 182, 172, 162, 152, 142]") )
      {
         System.out.println("12. There is something wrong with catenation().");
         System.out.println( concat );
         System.exit(-1);
      }


      System.out.println("Your class IntLinkedSeq passed all these tests.");
   }//main()
}//TestIntLinkedSeq_ver2
