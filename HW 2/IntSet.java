/*
   Do not make any changes to this file.
*/


/**
* An IntSet is a collection of integer numbers.
* A number may appear only one time in a set.
*/
public abstract class IntSet
{
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
   public abstract void add(int... elements);


   /**
   * Add to this set any element of another set that is not already in this set.
   * The result is this set unioned with the other set.
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
   public abstract void add(IntSet set2);


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
   public abstract void subtract(IntSet set2);


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
 public abstract void keepCommonElements(IntSet set2);


   /**
   * Method to determine if a particular element is in this set.
   * @param target
   *   the element that needs to be found in this set
   * @return
   *   true if the target element is in this set, false otherwise
   **/
  public abstract boolean contains(int target);


   /**
   * Remove a specified element from this set.
   * @param target
   *   the element to be removed from the set
   * @return
   *   true if the target element was in this set, false otherwise
   * @postcondition
   *   If target was found in the set, then the
   *   target has been removed and the method returns true.
   *   Otherwise the set remains unchanged and the method returns false.
   **/
   public abstract boolean remove(int target);


   /**
   * Determine the number of elements in this set.
   * @return
   *   the number of elements in this set
   **/
   public abstract int size( );


   /**
   * Create a new set that contains all the elements from this set and the other set.
   * @param set2
   *   the second set in the union
   * @precondition
   *   set2 is not null, and
   *   getCapacity( ) + set2.getCapacity( ) &lt;= Integer.MAX_VALUE.
   * @return
   *   the union of this set and set2
   * @exception NullPointerException
   *   Indicates that the argument is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new set.
   * @note
   *   An attempt to create a set with a capacity beyond
   *   Integer.MAX_VALUE will cause an arithmetic overflow
   *   that will cause the set to fail. Such large collections should use
   *   a different set implementation.
   **/
   public abstract IntSet union(IntSet set2);


   /**
   * Create a new set that contains all the elements that are in both this set and the other set.
   * @param set2
   *   the second set in the intersection
   * @precondition
   *   set2 is not null
   * @postcondition
   *   the returned set is smaller than either this set or set2
   * @return
   *   the intersection of this set and set2
   * @exception NullPointerException
   *   Indicates that the argument is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new set.
   **/
   public abstract IntSet intersection(IntSet set2);


   /**
   * Create a new set that contains all the elements from this set except those from the other set.
   * @param set2
   *   the second set in the subtraction
   * @precondition
   *   set2 is not null
   * @postcondition
   *   the returned set is smaller than this set
   * @return
   *   the subtraction of set2 from this set
   * @exception NullPointerException
   *   Indicates that the argument is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new set.
   **/
   public abstract IntSet minus(IntSet set2);
   
   


   /**
   * Create an array represntation of the contents of this set.
   * @return
   *   an integer array containg every element of this set
   */
   public abstract int[] toArray();


   /**
   * Create a String representation of the contents of this set.
   * @return
   *   a String representation of the contents of this set
   */
   public abstract String toString();

}//IntSet
