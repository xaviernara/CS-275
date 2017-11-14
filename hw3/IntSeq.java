
/**
* This class is a homework assignment;
* A <CODE>IntSeq</CODE> is a collection of <CODE>int</CODE> numbers.
* The sequence can have a special "current element," which is specified and
* accessed through four methods (start, getCurrent, advance, and isCurrent).
*/
public abstract class IntSeq
{
  /**
   * Add a new element to this sequence, after the current element.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to this sequence.
   *   If there was a current element, then the new element is placed
   *   after the current element. If there was no current element,
   *   then the new element is placed at the end of the sequence.
   *   In all cases, the new element becomes the new current element
   *   of this sequence.
   */
   public abstract void addAfter(int element);



  /**
   * Add a new element to this sequence, before the current element.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to this sequence.
   *   If there was a current element, then the new element is placed
   *   before the current element. If there was no current element,
   *   then the new element is placed at the start of the sequence.
   *   In all cases, the new element becomes the new current element
   *   of this sequence.
   */
   public abstract void addBefore(int element);



  /**
   * Place the contents of another sequence at the end of this sequence.
   *
   * @param addend
   *   a sequence whose contents will be placed at the end of this sequence
   * @precondition
   *   The parameter, addend, is not null.
   * @postcondition
   *   The elements from addend have been placed at the end of
   *   this sequence. The current element of this sequence remains where it
   *   was, and the addend is also unchanged.
   */
   public abstract void addAll(IntSeq addend);


  /**
   * Add a new element to the beginning of this sequence.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to the beginning
   *   of this sequence. The current element is unchanged.
   */
   public abstract void addFirst(int element);


  /**
   * Add a new element to the end of this sequence.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to the end
   *   of this sequence. The current element is unchanged.
   */
   public abstract void addLast(int element);



  /**
   * Set the current element at the front of this sequence.
   *
   * @param none
   * @postcondition
   *   The front element of this sequence is now the current element
   *  (but if this sequence has no elements at all, then there is
   *  no current element).
   */
   public abstract void start( );



  /**
   * Accessor method to determine whether this sequence has a specified
   * current element that can be retrieved with the getCurrentValue() method.
   *
   * @param none
   * @return
   *   true (there is a current element) or
   *   false (there is no current element at the moment)
   */
   public abstract boolean isCurrent( );



  /**
   * Accessor method to get the value in the current element of this sequence.
   *
   * @param none
   * @precondition
   *   isCurrent() returns true.
   * @return
   *   the value in the current element of this sequence
   * @exception IllegalStateException
   *   Indicates that there is no current element,
   *   so getCurrentValue() may not be called.
   */
   public abstract int getCurrentValue( );



  /**
   * Mutator method to set the value in the current element of this sequence.
   *
   * @param element
   *   the new value that is to be placed in the current element
   * @precondition
   *   isCurrent() returns true.
   * @exception IllegalStateException
   *   Indicates that there is no current element,
   *   so setCurrentValue() may not be called.
   */
   public abstract void setCurrentValue(int element);



  /**
   * Remove the current element from this sequence.
   *
   * @param none
   * @precondition
   *   isCurrent() returns true.
   * @postcondition
   *   The current element has been removed from this sequence, and the
   *   following element (if there is one) is now the new current element.
   *   If there was no following element, then there is now no current
   *   element.
   * @exception IllegalStateException
   *   Indicates that there is no current element,
   *   so removeCurrent() may not be called.
   */
   public abstract void removeCurrent( );



  /**
   * Remove the element at the beginning of this sequence.
   *
   * @param none
   * @precondition
   *   The sequence is not empty.
   * @postcondition
   *   The first element of the sequence is deleted from the sequence.
   *   If this was the current element, then the current element status
   *   is invalidated.
   * @exception IllegalStateException
   *   Indicates that the sequence is empty,
   *   so removeFirst() may not be called.
   */
   public abstract void removeFirst( );



  /**
   * Remove the element at the end of this sequence.
   *
   * @param none
   * @precondition
   *   The sequence is not empty.
   * @postcondition
   *   The last element of the sequence is deleted from the sequence.
   *   If this was the current element, then the current element status
   *   is invalidated.
   * @exception IllegalStateException
   *   Indicates that the sequence is empty,
   *   so removeLast() may not be called.
   */
   public abstract void removeLast( );



  /**
   * Move forward, so that the current element is now the next element
   * in this sequence.
   *
   * @param none
   * @precondition
   *   isCurrent() returns true.
   * @postcondition
   *   If the current element was already the end element of this
   *   sequence (with nothing after it), then there is no longer
   *   any current element. Otherwise, the new element is the
   *   element immediately after the  original current element.
   * @exception IllegalStateException
   *   Indicates that there is no current element,
   *   so advance() may not be called.
   */
   public abstract void advance( );



  /**
   * Set the current element to be the i'th element of this sequence
   * (starting with the 0'th element at the head).
   *
   * @param i
   *   the index of the element to make the current element
   * @precondition
   *   The parameter i is greater than or equal to 0
   *   and i is less than size (i >= 0 && i < size).
   * @postcondition
   *   The current element is the i'th element of the sequence
   *   (where the head element is the 0'th element)
   * @exception IndexOutOfBoundsException
   *   Indicates that i is less than 0 or greater than
   *   size-1 (i < 0 || i >= size).
   */
   public abstract void setCurrent(int i);



  /**
   * Set the state of this sequence so that it does not have a current element.
   *
   * @param none
   * @postcondition
   *   After calling this method, calling isCurrent() returns false.
   */
   public abstract void invalidateCurrent( );



  /**
   * Method to determine if a particular element
   * is in this sequence.
   *
   * @param target
   *   the element that needs to be found in this sequence
   * @return
   *   true if the target element is in this sequence, false otherwise
   */
   public abstract boolean contains(int target);



  /**
   * Returns the index of the first occurrence of the specified element in
   * this sequence, or -1 if this sequence does not contain the element.
   *
   * @param target
   *   the element that needs to be found in this sequence
   * @return
   *   the index of the first occurrence of target in this sequence, or -1
   *   if this sequence does not contain target
   */
   public abstract int indexOf(int target);


  /**
   * Determine the number of elements in this sequence.
   *
   * @param none
   * @return
   *   the number of elements in this sequence
   */
   public abstract int size( );



  /**
   * Create a new sequence that contains all the elements from
   * this sequence followed by another sequence. The returned
   * sequence should not be backed by this sequence or the other
   * sequence (so changes to the returned sequence are not reflected
   * in this sequence or the other sequence).
   *
   * @param s2
   *   the second sequence
   * @precondition
   *   s2 is not null.
   * @return
   *   a new sequence that has the elements of this followed by the
   *   elements of s2 (with no current element)
   */
   public abstract IntSeq catenation(IntSeq s2);



  /**
   * Create a new sequence that contains all the elements from
   * this sequence that are between the indices fromIndex, inclusive,
   * and toIndex, exclusive. (If fromIndex and toIndex are equal,
   * the returned sequence is empty.) The returned sequence should not
   * be backed by this sequence (so changes to the returned sequence
   * are not reflected in this sequence).
   * The new sequence should not have a current element.
   *
   * @param fromIndex
   *    low endpoint (inclusive) of the sub sequence
   * @param toIndex
   *   high endpoint (exclusive) of the sub sequence
   * @precondition
   *   fromIndex is less than or equal to toIndex (fromIndex <= toIndex),
   *   fromIndex is greater than or equal to zero (fromIndex >= 0),
   *   toIndex is less than or equal to size (toIndex <= size)
   * @return
   *   a new sequence that contains all the elements from this
   *   sequence that are between the indices fromIndex, inclusive,
   *   and toIndex, exclusive.
   * @exception IllegalArgumentException
   *   if the endpoint indices are out of order (fromIndex > toIndex)
   * @exception IndexOutOfBoundsException
   *   endpoint index value out of range (fromIndex < 0 || toIndex > size)
   */
   public abstract IntSeq subSeq(int fromIndex, int toIndex);



  /**
   * Create a new sequence that contains all the elements from
   * this sequence in the reverse order. The returned sequence
   * should not be backed by this sequence (so changes to the
   * returned sequence are not reflected in this sequence).
   * The new sequence should not have a current element.
   *
   * @param none
   * @return
   *   a new sequence that has the elements of this
   *   in their reverse order (with no current element)
   */
   public abstract IntSeq reverse( );


  /**
   * Returns an array containing all of the elements in this sequence.
   *
   * @param none
   * @return
   *   an array containing all the elements in this sequence
   */
   public abstract int[] toArray( );



  /**
   * Returns a String containing a representation of all the elements
   * in this sequence. Notice that a special symbol is used to denote
   * the current element.
   *
   * @param none
   * @return
   *   a String containing all the elements in this sequence
   */
   public abstract String toString( );

}//IntSeq
