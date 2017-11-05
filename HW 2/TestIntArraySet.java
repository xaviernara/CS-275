/*
   Do not make any changes to this file.
*/


/**

*/
public class TestIntArraySet
{
   public static void main(String[ ] args)
   {
      IntSet set1 = new IntArraySet( );
      IntSet set2 = new IntArraySet( );
      IntSet set3 = new IntArraySet( );
      
      //IntSet set1 = new IntSet( );
      //IntSet set2 = new IntSet( );
      
      
      //IntArraySet set12 = new IntArraySet( );
      //set12.setManyItems(10);
      //set12.ensureCapacity(45); 
      
      //System.out.println( "set1 = ARRAY " +set12.getCapacity()); //testing to see if the capacity of the data array is changing depending on user input
      
      //set2.subtract(32,34,53,10,64,23,1,2);
    //set2.add(12,13,63,37,20,2,1,8); 
    set1.add(1,2,3,4,5,6,7);
    set2.add(15,17,33,67,89,80); 
    System.out.println("SIZE"+set2.size());
    
    
     System.out.printf("Old Set 1 = ");
     System.out.println(set1);
     System.out.printf("Old Set 2 = ");
     System.out.println(set2);
     System.out.println("DOES set 2 contain 80 = " + set2.contains(80));
    // set3 = set1.add(set2);
     set3= set1.minus(set2);
    // set1.add(set2);
     System.out.printf("Set 1 Minused to set 2 = ");
     System.out.println(set3);
     
    /* System.out.printf("After Old Set 2 = ");
     System.out.println(set2);
     System.out.println("after SIZE"+set2.size());*/
     //System.out.printf("Set 1 keepCommonElements Set 2 = ");
     //System.out.println(set1.keepCommonElements(set2));
     
    // System.out.printf("ToARRAY CHECK = " + set1.toArray());
     //for(int i = 0 ; i < set1.toArray().length; i++){
       //  System.out.printf("%d" , set1.toArray()[i]);
    // }
     
     
     


      
     
      
      
     /* set3 = set1.intersection( set2 );
      System.out.println( "set1 = " + set1 );
      System.out.println( "set2 = " + set2 );
      System.out.println( "set3 = set1 intersection with set2 = " + set3 );
      System.out.println();
      if ( 3 != set3.size()
        || !set3.contains(20)
        || !set3.contains(21)
        || !set3.contains(22) )
      {
         System.out.println("16. There is something wrong with intersection().");
         return;
      }
      if ( 5 != set1.size()
        || !set1.contains(18)
        || !set1.contains(19)
        || !set1.contains(20)
        || !set1.contains(21)
        || !set1.contains(22) )
      {
         System.out.println("17. There is something wrong with intersection().");
         return;
      }
      if ( 7 != set2.size()
        || !set2.contains(20)
        || !set2.contains(21)
        || !set2.contains(22)
        || !set2.contains(23)
        || !set2.contains(24)
        || !set2.contains(25)
        || !set2.contains(26) )
      {
         System.out.println("18. There is something wrong with intersection().");
         return;
      }*/

    
   //if ( 0 != set2.size() )
     // {
         //System.out.println("9. There is something wrong with subtract().");
         //return;
      //}
   
  // if ( set2 != )
     // {
        // System.out.println("9. There is something wrong with subtract().");
     //    return;
     // }


    
    
  // set2.subtract(set1);
   
   /*System.out.printf("\n");
   System.out.printf("New Set 2 = ");
   System.out.println(set2);
   
    
   System.out.printf("\n");
   System.out.printf("New Set 1 = ");
   System.out.println(set1);
   
   System.out.printf("\n");
   System.out.printf("New Set 3 = ");
   System.out.println(set3);


/*

     set1.subtract(12,13,43,35,33,2,1,8);
   set2.subtract(32,34,53,10,64,23,1,2);
   System.out.printf("Old Set 1 = ");
   System.out.println(set1);
     System.out.printf("Old Set 2 = ");
     
   System.out.println(set2);
   set2.subtract(set1);
   
   
   
   System.out.printf("\n");
   System.out.printf("New Set 2 = ");
   System.out.println(set2);
     
      set1.add(42);
      if ( !set1.contains(42) )
      {
         System.out.println("1. There is something wrong with add() or contains().");
         return;
      }
      boolean r = set1.remove(42);
      if ( !r || set1.contains(42) )
      {
         System.out.println("2. There is something wrong with remove() or contains().");
         return;
      }
      r = set1.remove(42);
      if ( r )
      {
         System.out.println("3. There is something wrong with remove().");
         return;
      }

      set1.add(-42);
      set1.add(-42);
      r = set1.remove(-42);
      if ( !r || set1.contains(-42) )
      {
         System.out.println("4. There is something wrong with add(), remove(), or contains().");
         return;
      }

      set1.add(15);
      set1.add(16);
      set1.add(25, 26, 27, 26, 25);
      if ( !set1.contains(15)
        || !set1.contains(16)
        || !set1.contains(25)
        || !set1.contains(26)
        || !set1.contains(27) )
      {
         System.out.println("5. There is something wrong with add(...).");
         return;
      }
      if ( 5 != set1.size() )
      {
         System.out.println("6. There is something wrong with size().");
         return;
      }

      set1.add( set1 );
      if ( 5 != set1.size()
        || !set1.contains(15)
        || !set1.contains(16)
        || !set1.contains(25)
        || !set1.contains(26)
        || !set1.contains(27) )
      {
         System.out.println("7. There is something wrong with add(IntSet).");
         return;
      }

      set1.keepCommonElements( set1 );
      if ( 5 != set1.size()
        || !set1.contains(15)
        || !set1.contains(16)
        || !set1.contains(25)
        || !set1.contains(26)
        || !set1.contains(27) )
      {
         System.out.println("8. There is something wrong with keepCommonElements().");
         return;
      }

      set1.subtract( set1 );
      if ( 0 != set1.size() )
      {
         System.out.println("9. There is something wrong with subtract().");
         return;
      }


      set1 = new IntArraySet( );
      set1.add( 8,  9, 10, 11, 12);
      set2.add(10, 11, 12, 13, 14, 15, 16);

      set1.keepCommonElements( set2 );
      if ( 3 != set1.size()
        || !set1.contains(10)
        || !set1.contains(11)
        || !set1.contains(12) )
      {
         System.out.println("10. There is something wrong with keepCommonElements().");
         return;
      }

      set1.add( set2 );
      if ( 7 != set1.size()
        || !set1.contains(10)
        || !set1.contains(11)
        || !set1.contains(12)
        || !set1.contains(13)
        || !set1.contains(14)
        || !set1.contains(15)
        || !set1.contains(16) )
      {
         System.out.println("11. There is something wrong with add(IntSet).");
         return;
      }

      set2.remove(16);
      set2.remove(15);
      set1.subtract( set2 );
      if ( 2 != set1.size()
        || !set1.contains(15)
        || !set1.contains(16) )
      {
         System.out.println("12. There is something wrong with subtract().");
         return;
      }


      set1 = new IntArraySet(5);
      set2 = new IntArraySet(5);
      set1.add(18,  19, 20, 21, 22);
      set2.add(20, 21, 22, 23, 24, 25, 26);

      IntSet set3 = set1.union( set2 );
      System.out.println( "set1 = " + set1 );
      System.out.println( "set2 = " + set2 );
      System.out.println( "set3 = set1 union with set2 = " + set3 );
      System.out.println();
      if ( 9 != set3.size()
        || !set3.contains(18)
        || !set3.contains(19)
        || !set3.contains(20)
        || !set3.contains(21)
        || !set3.contains(22)
        || !set3.contains(23)
        || !set3.contains(24)
        || !set3.contains(25)
        || !set3.contains(26) )
      {
         System.out.println("13. There is something wrong with union().");
         return;
      }
      if ( 5 != set1.size()
        || !set1.contains(18)
        || !set1.contains(19)
        || !set1.contains(20)
        || !set1.contains(21)
        || !set1.contains(22) )
      {
         System.out.println("14. There is something wrong with union().");
         return;
      }
      if ( 7 != set2.size()
        || !set2.contains(20)
        || !set2.contains(21)
        || !set2.contains(22)
        || !set2.contains(23)
        || !set2.contains(24)
        || !set2.contains(25)
        || !set2.contains(26) )
      {
         System.out.println("15. There is something wrong with union().");
         return;
      }

      set3 = set1.intersection( set2 );
      System.out.println( "set1 = " + set1 );
      System.out.println( "set2 = " + set2 );
      System.out.println( "set3 = set1 intersection with set2 = " + set3 );
      System.out.println();
      if ( 3 != set3.size()
        || !set3.contains(20)
        || !set3.contains(21)
        || !set3.contains(22) )
      {
         System.out.println("16. There is something wrong with intersection().");
         return;
      }
      if ( 5 != set1.size()
        || !set1.contains(18)
        || !set1.contains(19)
        || !set1.contains(20)
        || !set1.contains(21)
        || !set1.contains(22) )
      {
         System.out.println("17. There is something wrong with intersection().");
         return;
      }
      if ( 7 != set2.size()
        || !set2.contains(20)
        || !set2.contains(21)
        || !set2.contains(22)
        || !set2.contains(23)
        || !set2.contains(24)
        || !set2.contains(25)
        || !set2.contains(26) )
      {
         System.out.println("18. There is something wrong with intersection().");
         return;
      }

      set3 = set1.minus( set2 );
      System.out.println( "set1 = " + set1 );
      System.out.println( "set2 = " + set2 );
      System.out.println( "set3 = set1 minus set2 = " + set3 );
      System.out.println();
      if ( 2 != set3.size()
        || !set3.contains(18)
        || !set3.contains(19) )
      {
         System.out.println("19. There is something wrong with minus().");
         return;
      }
      if ( 5 != set1.size()
        || !set1.contains(18)
        || !set1.contains(19)
        || !set1.contains(20)
        || !set1.contains(21)
        || !set1.contains(22) )
      {
         System.out.println("20. There is something wrong with minus().");
         return;
      }
      if ( 7 != set2.size()
        || !set2.contains(20)
        || !set2.contains(21)
        || !set2.contains(22)
        || !set2.contains(23)
        || !set2.contains(24)
        || !set2.contains(25)
        || !set2.contains(26) )
      {
         System.out.println("21. There is something wrong with minus().");
         return;
      }

      System.out.println("Your class IntArraySet passed all the tests.");
      
      */
   } //main()
   
   
}  //TestIntArraySet
