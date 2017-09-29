/*


*/


/**
* An IntArraySet is a collection of integer numbers.
* A number may appear only one time in a set.
*
* @note
*   (1) The capacity of one of these sets can change after it's created, but
*   the maximum capacity is limited by the amount of free memory on the
*   machine. The constructor, addItem, clone,
*   and union will result in an OutOfMemoryError
*   when free memory is exhausted.
*   <p>
*   (2) A set's capacity cannot exceed the maximum integer 2,147,483,647
*   (Integer.MAX_VALUE). Any attempt to create a larger capacity
*   results in a failure due to an arithmetic overflow.
*   <p>
*   (3) Because of the slow linear algorithms of this
*   class, large sets will have poor performance.
*/
public class IntArraySet extends IntSet
{
   // Invariant of the IntArraySet class:
   //   1. The number of elements in the set is in the instance variable
   //      manyItems, which is no more than data.length.
   //   2. For an empty set, we do not care what is stored in any of data;
   //      for a non-empty set, the elements in the set are stored in data[0]
   //      through data[manyItems-1], and we don't care what's in the
   //      rest of data.
   private int[ ] data;
   private int manyItems;

   /**
   * Initialize an empty set with an initial capacity of 10.
   * Note that the addItem method works efficiently (without
   * needing more memory) until this capacity is reached.
   * @postcondition
   *   This set is empty and has an initial capacity of 10.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for:
   *   new int[10].
   */
   public IntArraySet( )
   {

   }


   /**
   * Initialize an empty set with a specified initial capacity.
   * Note that the addItem method works efficiently (without
   * needing more memory) until this capacity is reached.
   * @param initialCapacity
   *   the initial capacity of this set
   * @precondition
   *   initialCapacity is non-negative.
   * @postcondition
   *   This set is empty and has the given initial capacity.
   * @exception IllegalArgumentException
   *   Indicates that initialCapacity is negative.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[initialCapacity].
   */
   public IntArraySet(int initialCapacity)
   {

   }


   /**
   * Change the current capacity of this set.
   * @param minimumCapacity
   *   the new capacity for this set
   * @postcondition
   *   This set's capacity has been changed to at least minimumCapacity.
   *   If the capacity was already at or greater than minimumCapacity,
   *   then the capacity is left unchanged.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[minimumCapacity].
   **/
   public void ensureCapacity(int minimumCapacity)
   {

   }


   /**
   * Accessor method to get the current capacity of this set.
   * The add method works efficiently (without needing
   * more memory) until this capacity is reached.
   * @return
   *   the current capacity of this set
   **/
   public int getCapacity( )
   {

   }


   /**
   * Reduce the current capacity of this set to its actual size
   * (i.e., the number of elements it contains).
   * @postcondition
   *   This set's capacity has been changed to its current size.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for altering the capacity.
   **/
   public void trimToSize( )
   {

   }



   /**
   * {@inheritDoc}
   */
   public void add(int... elements)
   {

   }


   /**
   * {@inheritDoc}
   */
   public void add(IntSet set2)
   {

   }


   /**
   * {@inheritDoc}
   */
   public void subtract(IntSet set2)
   {

   }


   /**
   * {@inheritDoc}
   */
   public void keepCommonElements(IntSet set2)
   {

   }


   /**
   * {@inheritDoc}
   */
   public boolean contains(int target)
   {

   }


   /**
   * {@inheritDoc}
   */
   public boolean remove(int target)
   {

   }


   /**
   * {@inheritDoc}
   */
   public int size( )
   {

   }


   /**
   * {@inheritDoc}
   */
   public IntSet union(IntSet set2)
   {
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public IntSet intersection(IntSet set2)
   {
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public IntSet minus(IntSet set2)
   {
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public int[] toArray()
   {


   }


   /**
   * {@inheritDoc}
   */
   public String toString()
   {
      String result = "{";



      result += "}";
      return result;
   }

}//IntArraySet
