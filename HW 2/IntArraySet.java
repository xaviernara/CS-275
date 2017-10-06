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
     manyItems = 0;
	  data = new int[initialCapacity ];
    /* if (initialCapacity <0){
       throw new IllegalArgumentException 
         ("No negative numbers for initialCapacity " + initialCapacity);
       
       //data = new int[initialCapacity];
       //manyItems=0;
      }*/
     
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
           //System.out.println("INCHECK");
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
      
           data_trimed= new int [manyItems];
       
       
      // for (int i =0; i<data.length; i++){
        // data[i]=data_trimed[i]; 
       // }
        
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
   public void add(IntSet set_x) //overloading original add method
   {
	 System.out.println("SIZE = "+ getCapacity());
     boolean unique = true;   //checking for unique numbers in the user input set_x

     int cnt = 0;
     
     int SIZE = getCapacity()+ set_x.size();
     //IntSet set3 = new IntArraySet(SIZE);
     int [] unioned_set = new int[SIZE];
     //copy data array into unioned_set
	 trimToSize();
     for(int i = 0 ; i < getCapacity(); i++){
           unioned_set[i] = toArray()[i];
           if (data.length < manyItems){
             //cnt++;
           }
     }
     
     for(int i = 0 ; i <= set_x.size(); i++){
       for(int j = 0 ; j < unioned_set.length; j++){
        if(set_x.toArray()[i] == unioned_set[j]){
           unique = false;
         }
        }
		if(unique){
          unioned_set[manyItems] = set_x.toArray()[i];
          //cnt++;
          manyItems++;
          
       }
       unique = true; //when the if statement finds a  a un
     }
	 ensureCapacity(unioned_set.length);
     System.out.printf("UNIONED SET ");
     for(int i = 0; i < manyItems;i++){
     System.out.printf("%d ",unioned_set[i]);
      //add(unioned_set[i]);
      data[i] = unioned_set[i]; 
     }
     System.out.println();
	 /*System.out.printf(" Unioned Set ");
	 for(int i = 0; i < cnt;i++){
      System.out.printf("%d ",unioned_set[i]);
     }*/
	      
       
     
     
     // toArray()
     //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     
   }


    /**
   *Remove from this set any element of another set that is in this set.
   *
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
   public void subtract(IntSet subtracrt_set)
   {
    // if (manyItems != set2.size()){
    //   for(int =0; i<data.length; i++)
     //  {
      //   data[i] -= set2.size();
      // }
   //  }
   
      System.out.println("SIZE = "+ getCapacity());
     boolean unique = false; //checking for ununique numbers in the subtracrt_set
     int cnt = 0;
     
     int SIZE = getCapacity()+ subtracrt_set.size();
     //IntSet set3 = new IntArraySet(SIZE);
     int [] minused_set = new int[SIZE];
     //copy data array into minused_set
	 trimToSize();
    
     for(int i = 0 ; i < getCapacity(); i++){
           minused_set[i] = toArray()[i];
          // if (data.length < manyItems){
             //cnt++;
           //}
     }
     
     for(int i = 0 ; i <= subtracrt_set.size(); i++){
       for(int j = 0 ; j < minused_set.length; j++){
        if(subtracrt_set.toArray()[i] == minused_set[j]){
           unique = true;
            manyItems--;
         }
        }
		if(unique){
         minused_set[manyItems] = subtracrt_set.toArray()[i];
          //cnt++;
          manyItems++;
          
       }
       unique = false;
     }
	 ensureCapacity(minused_set.length);
     System.out.printf("UNIONED SET ");
     for(int i = 0; i < manyItems;i++){
     System.out.printf("%d ",minused_set[i]);
      //add(unioned_set[i]);
      data[i] = minused_set[i]; 
     }
     System.out.println();

    }


 
 
   /**
   * Remove from this set any of its elements that are not contained in another set.
   * The result is this set intersected with the other set
   * @param set2
   *   a set whose elements will be intersected with this set
   * @precondition
   *   The parameter, set2, is not null.
   * @postcondition
   *   This set contains the intersection of itself with set2.
   * @exception NullPointerException
   *   Indicates that set2 is null.
   **/
   public void keepCommonElements(IntSet set2)
   {
    System.out.println("SIZE = "+ getCapacity());
     boolean CommonElements = true;   //checking for unique numbers in the user input set_x

     //int cnt = 0;
     
     int SIZE = getCapacity()+ set_x.size();
     //IntSet set3 = new IntArraySet(SIZE);
     int [] unioned_set = new int[SIZE];
     //copy data array into unioned_set
	 trimToSize();
     for(int i = 0 ; i < getCapacity(); i++){
           unioned_set[i] = toArray()[i];
           if (data.length < manyItems){
             //cnt++;
           }
       }
     
     for(int i = 0 ; i <= set_x.size(); i++){
       for(int j = 0 ; j < unioned_set.length; j++){
        if(set_x.toArray()[i] == unioned_set[j]){
           CommonElements = false;
         }
        }
		if(unique){
          unioned_set[manyItems] = set_x.toArray()[i];
          //cnt++;
          manyItems++;
          
       }
       CommonElements = true; //when the if statement finds a  a un
     }
	 ensureCapacity(unioned_set.length);
     System.out.printf("UNIONED SET ");
     for(int i = 0; i < manyItems;i++){
     System.out.printf("%d ",unioned_set[i]);
      //add(unioned_set[i]);
      //data[i] = unioned_set[i]; 
     }
     
     return CommonElements;
     System.out.println();
   }


   /**
   * Method to determine if a particular element is in this set.
   * @param target
   *   the element that needs to be found in this set
   * @return
   *   true if the target element is in this set, false otherwise
   **/
   public boolean contains(int target)
   {
     return true;

   }


   /**
   * {@inheritDoc}
   */
   public boolean remove(int target)
   {
      int index; // The location of target in the data array.

      // First, set index to the location of target in the data array,
      // which could be as small as 0 or as large as manyItems-1; If target
      // is not in the array, then index will be set equal to manyItems;
      for (index = 0; (index < manyItems) && (target != data[index]); index++);
         // No work is needed in the body of this for-loop.

      if (index == manyItems)
         // The target was not found, so nothing is removed.
         return false;
      else
      {  // The target was found at data[index].
         // So reduce manyItems by 1 and copy the last element onto data[index].
         manyItems--;
         data[index] = data[manyItems];
         return true;
      }

   }


   /**
   * {@inheritDoc}
   */
   public int size( )
   {
     return manyItems;

   }


   /**
   * {@inheritDoc}
   */
   public IntSet union(IntSet set2)
   {
     IntArraySet result = new IntArraySet(this.size() + set2.size());

      result.add( this.toArray() );
      result.add(   set2.toArray() );
      // If set2 is null, then a NullPointerException is thrown.
      return result;

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
     int[] result = new int[data.length];
      for (int i = 0; i < data.length; i++)
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
      for (int i = 0; i <manyItems; i++)
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
