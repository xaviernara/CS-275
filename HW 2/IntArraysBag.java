/******************************************************************************
* An IntArraysBag is a collection of int numbers.
* The same number may appear multiple times in a bag.
*
* @note
*   (1) The capacity of one of these bags can change after it's created.
*
******************************************************************************/
public class IntArraysBag implements Cloneable
{
   // The arrays data and dataCounts are "parallel arrays"
   // The array data containes the numbers that are in the bag.
   // The array dataCounts contains the count of the occurrances
   // of each number.in the bag.
   // Say data[i] is 5 and dataCounts[i] is 12.
   // That means the bag holds 12 occurrances of the number 5.
   // Note that if data[i] is 5, then data[j] cannot be 5 for any j != i.
   private int[ ] data;
   private int[ ] dataCounts;
   private int manyItems;      // the number of entries in the bag
   private int distinctItems;  // the number of entries in data[]


   /**
   * Initialize an empty bag with an initial capacity of 10 distinct numbers.
   *
   * @param - none
   *
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for:
   *   new int[10].
   **/
   public IntArraysBag( )
   {
      final int INITIAL_CAPACITY = 10;
      manyItems = 0;
      distinctItems = 0;
      data       = new int[INITIAL_CAPACITY];
      dataCounts = new int[INITIAL_CAPACITY];
   }


   /**
   * Initialize an empty bag with a specified initial capacity for distinct nubers.
   *
   * @param initialCapacity
   *   the initial capacity of distinct numbers in this bag
   *
   * @exception IllegalArgumentException
   *   Indicates that initialCapacity is negative.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[initialCapacity].
   **/
   public IntArraysBag(int initialCapacity)
   {
      if (initialCapacity < 0)
         throw new IllegalArgumentException
         ("The initialCapacity is negative: " + initialCapacity);
      data       = new int[initialCapacity];
      dataCounts = new int[initialCapacity];
      manyItems = 0;
      distinctItems = 0;
   }


   /**
   * Add a new element to this bag. If the new element would take this
   * bag beyond its current capacity, then the capacity is increased
   * before adding the new element.
   * @param element
   *   the new element that is being inserted
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the bag's capacity.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause the bag to fail with an
   *   arithmetic overflow.
   **/
   public void add(int element)
   {
      int index = 0;
      for (; index < distinctItems; index++)
      {
         if (element == data[index])
            break;
      }

      if (index == distinctItems)
      {  // elelment is not in the bag
         if (distinctItems == data.length)
         {  // Ensure twice as much space as we need.
            ensureCapacity((manyItems + 1)*2);
         }

         data[distinctItems] = element;
         dataCounts[distinctItems] = 1;
         distinctItems++;
         manyItems++;
      }
      else
      {  // element is already in the bag
         dataCounts[index]++;
         manyItems++;
      }
   }


   /**
      A private helper method that can make some of the other (public) methods more efficient.
     @param element
       the new element that is being inserted
     @param thisManyTimes
       the number of times to insert the new element
   */
   private void add(int element, int thisManyTimes)
   {
      int index = 0;
      for (; index < distinctItems; index++)
      {
         if (element == data[index])
            break;
      }

      if (index == distinctItems)
      {  // elelment is not in the bag
         if (distinctItems == data.length)
         {  // Ensure twice as much space as we need.
            ensureCapacity((manyItems + 1)*2);
         }

         data[distinctItems] = element;
         dataCounts[distinctItems] = thisManyTimes;
         distinctItems++;
         manyItems += thisManyTimes;
      }
      else
      {  // element is already in the bag
         dataCounts[index] += thisManyTimes;
         manyItems += thisManyTimes;
      }
   }


   /**
   * Add new elements to this bag. If the new elements would take this
   * bag beyond its current capacity, then the capacity is increased.
   * @param elements
   *   (a variable-arity argument)
   *   one or more new elements that are being inserted
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the bag's capacity.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause the bag to fail with an
   *   arithmetic overflow.
   **/
   public void addMany(int... elements)
   {
      for (int i = 0; i < elements.length; i++)
      {
         this.add( elements[i] );
      }
   }


   /**
   * Add the contents of another bag to this bag.
   * @param addend
   *   a bag whose contents will be added to this bag
   * @precondition
   *   The parameter, addend, is not null.
   * @exception NullPointerException
   *   Indicates that addend is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory to increase the size of the bag.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the bag to fail. Such large collections should use
   *   a different bag implementation.
   **/
   public void addAll(IntArraysBag addend)
   {
      // If addend is null, then a NullPointerException is thrown.
      for (int i = 0; i < addend.distinctItems; i++)
      {
         // use the private helper method
         this.add( addend.data[i], addend.dataCounts[i] );
      }

      // What if addend == this ??? (See page 142 of the textbook.)
   }


   /**
   * Generate a copy of this bag.
   * @param - none
   * @return
   *   The return value is a copy of this bag. Subsequent changes to the
   *   copy will not affect the original, nor vice versa.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/
   public IntArraysBag clone( )
   {  // Clone an IntArrayBag object.
      IntArraysBag answer;

      try
      {
         answer = (IntArraysBag) super.clone( );
      }
      catch (CloneNotSupportedException e)
      {  // This exception should not occur. But if it does, it would probably
         // indicate a programming error that made super.clone unavailable.
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
         ("This class does not implement Cloneable");
      }

      answer.data = data.clone( );
      answer.dataCounts = dataCounts.clone( );

      return answer;
   }


   /**
   * Accessor method to count the number of occurrences of a particular element
   * in this bag.
   * @param target
   *   the element that needs to be counted
   * @return
   *   the number of times that target occurs in this bag
   **/
   public int countOccurrences(int target)
   {
      for (int index = 0; index < distinctItems; index++)
      {
         if (target == data[index])
            return dataCounts[index];
      }
      return 0;
   }


   /**
   * Change the current capacity of distinct numbers in this bag.
   * @param minimumCapacity
   *   the new capacity of distinct numbers for this bag
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[minimumCapacity].
   **/
   public void ensureCapacity(int minimumCapacity)
   {
      int[ ] biggerArray1;
      int[ ] biggerArray2;

      if (data.length < minimumCapacity)
      {
         biggerArray1 = new int[minimumCapacity];
         System.arraycopy(data, 0, biggerArray1, 0, distinctItems);
         data = biggerArray1;

         biggerArray2 = new int[minimumCapacity];
         System.arraycopy(dataCounts, 0, biggerArray2, 0, distinctItems);
         dataCounts = biggerArray2;
      }
   }


   /**
   * Accessor method to get the current capacity of distinct numbers for this bag.
   * @param - none
   * @return
   *   the current capacity of this bag
   **/
   public int getCapacity( )
   {
      return data.length;
   }


   /**
   * Remove one copy of a specified element from this bag.
   * @param target
   *   the element to remove from the bag
   * @postcondition
   *   If target was found in the bag, then one copy of
   *   target has been removed and the method returns true.
   *   Otherwise the bag remains unchanged and the method returns false.
   **/
   public boolean remove(int target)
   {
      int index; // The location of target in the data array.

      // First, set index to the location of target in the data array,
      // which could be as small as 0 or as large as distinctItems-1;
      // If target is not in the array, then index will be set equal to distinctItems;
      for (index = 0; (index < distinctItems) && (target != data[index]); index++)
         // No work is needed in the body of this for-loop.
         ;

      if (index == distinctItems)
      {  // The target was not found, so nothing is removed.
         return false;
      }
      else
      {  // The target was found at data[index].
         manyItems--;
         dataCounts[index]--;
         if ( 0 == dataCounts[index] )
         {
            data[index]       = data[distinctItems - 1];
            dataCounts[index] = dataCounts[distinctItems - 1];
            distinctItems--;
         }
         return true;
      }
   }


   /**
   * Determine the number of elements in this bag.
   * @param - none
   * @return
   *   the number of elements in this bag
   **/
   public int size( )
   {
      return manyItems;
   }



   /**
   * Create a new bag that contains all the elements from two other bags.
   * @param b1
   *   the first of two bags
   * @param b2
   *   the second of two bags
   * @precondition
   *   Neither b1 nor b2 is null, and
   *   b1.getCapacity( ) + b2.getCapacity( ) &lt;= Integer.MAX_VALUE.
   * @return
   *   the union of b1 and b2
   * @exception NullPointerException.
   *   Indicates that one of the arguments is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new bag.
   * @note
   *   An attempt to create a bag with a capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the bag to fail. Such large collections should use
   *   a different bag implementation.
   **/
   public static IntArraysBag union(IntArraysBag b1, IntArraysBag b2)
   {
      // If either b1 or b2 is null, then a NullPointerException is thrown.
      // In the case that the total number of items is beyond
      // Integer.MAX_VALUE, there will be an arithmetic overflow and
      // the bag will fail.
      IntArraysBag answer = new IntArraysBag(b1.getCapacity() + b2.getCapacity());

      for (int i = 0; i < b1.distinctItems; i++)
      {
         // use the private helper method
         answer.add( b1.data[i], b1.dataCounts[i] );
      }

      for (int i = 0; i < b2.distinctItems; i++)
      {
         // use the private helper method
         answer.add( b2.data[i], b2.dataCounts[i] );
      }

      return answer;
   }


   public String toString()
   {
      String result = "[";
      for (int i = 0; i < distinctItems; i++)
      {
         result += " " + data[i];
      }
      result += "]\n[";
      for (int i = 0; i < distinctItems; i++)
      {
         result += " " + dataCounts[i];
      }
      result += "]";

      return result;
   }
}
