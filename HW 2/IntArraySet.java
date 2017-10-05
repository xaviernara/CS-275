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
   
   public void setManyItems(int amanyitems){
     manyItems = amanyitems;
   
   }
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
   
   //Constructor with zero inputs 
   public IntArraySet( )
   {
      final int INITIAL_CAPACITY = 10;
      manyItems = 0;
      data = new int[INITIAL_CAPACITY];
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
   
   //Constructor with initialCapacity for set as a input 
   public IntArraySet(int initialCapacity)
   {
     if (initialCapacity <0){
       throw new IllegalArgumentException 
         ("No negative numbers for initialCapacity " + initialCapacity);
       
       //data = new int[initialCapacity];
       //manyItems=0;
      }
     
   }


   /**
   * Change the current capacity of this set.
   * @param minimumCapacity
   *   the new capacity for this set
   * @postcondition
   *   This set's capacity has been changed to at least minimumCapacity.
   * 
   *   If the capacity was already at or greater than minimumCapacity,
   *   then the capacity is left unchanged.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for: new int[minimumCapacity].
   **/
   public void ensureCapacity(int minimumCapacity)
   {
     int [] data_cpy = new int [minimumCapacity ];
     if (minimumCapacity >= data.length){
       for (int i = 0;i<data.length; i++){ 
           System.out.println("INCHECK");
            data_cpy[i] = data[i];
            //data.length = new int [minimumCapacity *2]; 
            //System.arraycopy(data, 0,minimumCapacity , 0, manyItems);
            data = new int[minimumCapacity];
            
          
           }
       
       for(int i = 0 ; i < data.length; i++){
         data[i] = data_cpy[i];
       }
  
          /*else{
            throw new OutOfMemoryError
              ("set is out of memory" + minimumCapacity); 
          }*/
     } 
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
     return data.length;
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
     int[] data_trimed;
     if (data.length != manyItems){
       for (int i = 0; i<data.length; i++){
           data_trimed= new int [manyItems];
       }
       /*
       for (int i =0; i<data.length; i++){
         data[i]=data_trimed[i]; 
        }
        */
     }
   }



    /**
   * Add new elements to this set. If any of the given elements is already
   * in the set, that element is ignored. If the new elements would take this
   * set beyond its current capacity, then the capacity is increased
   * in order to add the new elements.
   * @param elements
   *   (a variable-arity argument)
   *   one or more new elements that are being inserted
   * @postcondition
   *   A copy of each new element has been added to this set.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the set's capacity.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause the set to fail with an
   *   arithmetic overflow.
   **/
   public void add(int... elements)
   {
     //int [] data_addedTo= new data [elements];
     //copied from IntArrayBag class
     ensureCapacity(manyItems+elements.length);
     System.arraycopy(elements, 0, data, manyItems, elements.length);
     manyItems += elements.length;

   }


   /**
   * Add to this set any element of another set that is not already in this set.
   * The result is this set unioned with the other set.
   * 
   * @param set2
   *   a set whose elements will be unioned with this set
   * @precondition
   *   The parameter, set2, is not null.
   * @postcondition
   *   The elements from set2 have been unioned with this set.
   * @exception NullPointerException
   *   Indicates that set2 is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory to increase the size of this set.
   * @note
   *   An attempt to increase the capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the set to fail. Such large collections should use
   *   a different set implementation.
   **/
   public void add(IntSet set2) //overloading original add method
   {
     //add(set2 + manyItems);
    /* if(data.length = set2 
      IntSet data_set2= new data[set2];
     ensureCapacity(manyItems+set2.size());
     System.arraycopy(set2.toArray(), 0, data, manyItems, set2.length);
     manyItems += set2.size();*/
     
     // toArray()
     //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     
   }


    /**
   * Remove from this set any element of another set that is in this set.
   * The result is the other set's elements subtracted from this set.
   * @param set2
   *   a set whose elements will be subtracted from this set
   * @precondition
   *   The parameter, set2, is not null.
   * @postcondition
   *   The elements from set2 have been subtracted with this set.
   * @exception NullPointerException
   *   Indicates that set2 is null.
   **/
   public void subtract(IntSet set2)
   {
    // if (manyItems != set2.size()){
    //   for(int =0; i<data.length; i++)
     //  {
      //   data[i] -= set2.size();
      // }
   //  }
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
     return true;

   }


   /**
   * {@inheritDoc}
   */
   public boolean remove(int target)
   {
     return true;

   }


   /**
   * {@inheritDoc}
   */
   public int size( )
   {
     return 1;

   }


   /**
   * {@inheritDoc}
   */
   public IntSet union(IntSet set2)
   {
     boolean unique = true;
     int cnt = 0;
     
     int SIZE = data.length + set2.getCapacity();
     IntSet set3= new data[SIZE];
     int [] unioned_set = new int[SIZE];
     //copy data array into unioned_set
     for(int i = 0 ; i < getCapacity(); i++){
           unioned_set(i) = toArray()[i];
           cnt++;
     }
     
     for(int i = 0 ; i < set2.getCapacity(); i++){
       for(int j = 0 ; j < cnt; j++){
        if(set2.toArray()[i] == unioned_set[j]){
           unique = false;
        }
        if(unique){
          unioned_set[cnt] = set2.toArray()[i];
          cnt++;
        }
       }
     }
     for(int i = 0; i < cnt;i++){
      set3.toArray()[i] = unioned_set[i]; 
     }
      
       
     return set3;
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public IntSet intersection(IntSet set2)
   {
     return set2;
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public IntSet minus(IntSet set2)
   {
     return set2;
      // If set2 is null, then a NullPointerException is thrown.


   }


   /**
   * {@inheritDoc}
   */
   public int[] toArray()
   {
     int[] result = new int[manyItems];
      for (int i = 0; i < manyItems; i++)
      {
         result[i] = data[i];
      }
      return result;


   }


   /**
   * {@inheritDoc}
   */
   public String toString()
   {
      String result = "[";
      for (int i = 0; i < manyItems; i++)
      {
         if (i > 0)
         {
            result += " ";
         }
         result += data[i];
         if (i < manyItems-1)
         {
            result += ",";
         }
      }
      result += "]";
      return result;
   }

}//IntArraySet
