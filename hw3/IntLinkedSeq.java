
// This is an assignment for students to complete after reading Chapter 4
// of "Data Structures and Other Objects Using Java" by Michael Main.

/**
* This class is a homework assignment;
* A <CODE>IntLinkedSeq</CODE> is a collection of <CODE>int</CODE> numbers.
* The sequence can have a special "current element," which is specified and
* accessed through four methods (start, getCurrent, advance, and isCurrent).
*
* <dl>
* <dt><b>Limitations:</b>
* <dd> Beyond Int.MAX_VALUE</CODE> elements, the <CODE>size</CODE> method
*      does not work.
*
* <dt><b>Note:</b>
* <dd> This file contains only blank implementations ("stubs")
*      because this is a Programming Project for students.
*/
public class IntLinkedSeq extends IntSeq
{
   private int manyItems;  // how many nodes are in this sequence
   private IntNode head;   // reference to the first node of the sequence
   private IntNode tail;   // reference to the last node of the sequence
   private IntNode cursor; // reference to the "current" node (null
                           // if there isn't one)

   /**
   * Initialize an empty sequence.
   *
   * @param none
   * @postcondition
   *   This sequence is empty. It does not have a current element.
   **/
   public IntLinkedSeq( )
   {
      IntSeq seq1 = new IntLinkedSeq( );
      head = new IntNode(null);
      tail= head;

   }


   /**
   * Copy Constructor
   *
   * @param otherSequence
   *   Sequence to make a deep copy of.
   *
   * @postcondition
   *   This sequence is a DEEP copy of the parameter sequence.
   *   Subsequent changes to the copy will not affect the original, nor vice versa.
   *   The copy should have its cursor set in the appropriate
   *   place within its linked list.
   **/
   public IntLinkedSeq(IntLinkedSeq otherSequence)
   {
      
      

   }



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

   public void addAfter(int element)
   {
      if (head.getLink() != null)  
        head.getLink(new IntNode(element, head.getLink())); 
   }


  
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
   
   public void addBefore(int element)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void addAll(IntSeq addend)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void addFirst(int element)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void addLast(int element)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void start( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public boolean isCurrent( )
   {


      return false; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public int getCurrentValue( )
   {


      return 0; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public void setCurrentValue(int element)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void removeCurrent( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public void removeFirst( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public void removeLast( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public void advance( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public void setCurrent(int i)
   {


   }


   /**
   * {@inheritDoc}
   */
   public void invalidateCurrent( )
   {


   }


   /**
   * {@inheritDoc}
   */
   public boolean contains(int target)
   {


      return false; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public int indexOf(int target)
   {


      return 0; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public int size( )
   {


      return 0; // Replace this return statement with your own code:
   }



   /**
   * {@inheritDoc}
   */
   public IntSeq catenation(IntSeq s2)
   {


      return null; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public IntSeq subSeq(int fromIndex, int toIndex)
   {


      return null; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public IntSeq reverse( )
   {


      return null; // Replace this return statement with your own code:
   }


   /**
   * {@inheritDoc}
   */
   public int[] toArray( )
   {


      return null; // Replace this return statement with your own code:
   }



   /**
   * {@inheritDoc}
   */
   public String toString( )
   {
      String result = "[";
      IntNode ptr = head;
      while (ptr != null)
      {
         result += ptr.getData();
         if (ptr == cursor)
         {
            result += "*"; // use a special symbol at the cursor
         }
         ptr = ptr.getLink();
         if (ptr != null)
         {
            result += ", ";
         }
      }
      result += "]";
      return result;
   }

}//IntLinkedSeq
