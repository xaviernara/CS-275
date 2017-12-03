
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
      //IntSeq seq = new IntLinkedSeq();
      IntNode head =null;
      IntNode tail= head;
      IntNode cursor =head;
      manyItems=0;

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


   public void SetTail(){
      IntNode ptr =head;
     
      while (head!= head){
         ptr=ptr.getLink();
         
         if (ptr.getLink() == null){
            tail=ptr;
            break;
           }
      }
      
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
     
      IntNode ptr= head;
   
   //case2 : If there was no current element, then the new element is placed at the end of the sequence.
      
       if(cursor.getLink() == null){
        cursor.setLink( new IntNode(element, null));
        cursor = cursor.getLink();
        tail= cursor;
        manyItems++;
       }
       
       
   
    //case 1 : If there was a current element, then the new element is placed after the current element. 
     //if(cursor != null)
        // head.getLink(new IntNode(element, head.getLink()));
      cursor.setLink( new IntNode(element, cursor.getLink()));
      manyItems++;  
      
      SetTail(); 
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
   public void addBefore(int element){
     
      IntNode ptr = head;
      IntNode ptr2= null;
      while(head!=null){
         ptr2=ptr;
         ptr=ptr.getLink();
         //ptr2=ptr.getLink();
         ptr2=ptr2.getLink();

      //case1 : If there was a current element, then the new element is placed before the current element.
      
       if(ptr==cursor && cursor.getLink()!=null){
        cursor.setLink( new IntNode(element,ptr2.getLink()));
        //cursor = ptr2.getLink();
        cursor = ptr2;
        //tail= cursor;
        manyItems++;
        break;
       }
   
    //case 1 : If there was a current element, then the new element is placed after the current element. 
     //if(cursor != null)
        // head.getLink(new IntNode(element, head.getLink()));
      //cursor.setLink( new IntNode(element, cursor.getLink()));
      //manyItems++; 
      SetTail();
      }   
   }


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
   public void addAll(IntSeq addend)
   {
   


   }


  /**
   * Add a new element to the beginning of this sequence.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to the beginning
   *   of this sequence. The current element is unchanged.
   */
   public void addFirst(int element)
   {    
     //if (head.getLink()== null){
     //case 1: If there's no node in the sequence this checks and adds a new node to the front
     //and sets tail and cursor to the front of the Seq
       if (head== null){
          // head = new IntNode(element, head);
          head = new IntNode(element, null);
          manyItems++;
          cursor = head;
          tail = head;
       }
     //case 2: If there's a node in front of the sequence this checks and adds a new node to the front
     //and tail and cursor (current element) are unchanged
         else if (head.getLink()== null){
            head = new IntNode(element, head);
            //cursor=head.getLink();
            //cursor=head;
            //tail = head;
            manyItems++;
            //return;
        }
        //case 3: If there's nodes in the sequence and head and head.getLink() doesn't equal null this checks and adds a new node to the front
        else if (head.getLink()!= null && head!=null){
            head = new IntNode(element, head);
            //cursor=head.getLink();
            //cursor=head;
            //tail = head;
            manyItems++;
            //return;
        }  
        
        SetTail();           
   }
   

   /**
   * Add a new element to the end of this sequence.
   *
   * @param element
   *   the new element that is being added
   * @postcondition
   *   A new copy of the element has been added to the end
   *   of this sequence. The current element is unchanged.
   */
   public void addLast(int element)
   {
      IntNode ptr = head;
      
      while(head!=null){ 
         ptr=ptr.getLink();
         
         //if (tail.getLink()== null){
         if(ptr.getLink()==null){
            tail=ptr;
            tail.setLink( new IntNode(element, null));
            tail = tail.getLink();
         //tail = new IntNode(element, null);
            manyItems++;
            break;
          }
          
         // else{
           // tail.setLink( new IntNode(element, tail.getLink()));
            //tail = tail.getLink();
         //tail = new IntNode(element, null);
            //manyItems++;
          //}
      }
       
    
     
      System.out.println("manyItems = " + manyItems);
      
      //cursor = tail;
      
   }


   /**
   * Set the current element at the front of this sequence.
   *
   * @param none
   * @postcondition
   *   The front element of this sequence is now the current element
   *  (but if this sequence has no elements at all, then there is
   *  no current element).
   */
   public void start( )
   {  
      //if(head!= tail && head.getLink()!= null) 
    //case 1: The front element of this sequence is now the current element if theres atleast 1 node in the Seq list
      if(head!= null)
         cursor = head;
    //case 2: If there isnt a front element of this sequence, then the current element is set to null
      else
         cursor = null;
      
   }


    /**
   * Accessor method to determine whether this sequence has a specified
   * current element that can be retrieved with the getCurrentValue() method.
   *
   * @param none
   * @return
   *   true (there is a current element) or
   *   false (there is no current element at the moment)
   */
   public boolean isCurrent( )
   {
      //if(contains()== true) 
       if(cursor!=null)
         return true; 
      else 
         return false;    
   }


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
   public int getCurrentValue( )
   {
      IntNode ptr;
      //this ptr will track the cursor'ss data in the Seq
      ptr = head;
      //this int will represent the cursor's data when ptr gets to it in the Seq 
      int cursorData = 0;
      
      while (head != null){
      
         ptr=ptr.getLink();
          if (ptr == cursor){
            
            cursorData= ptr.getData();
            System.out.println("This the current value of the cursor" + cursorData );
            //cursorData= ptr.getData();
            //or cursor.getData();
            break;
           }
            
       }
   return cursorData; 
}

      
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

   public void setCurrentValue(int element)
   {
      
      if (isCurrent()== true){
          cursor.setData(element);  
       }
   }


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
   public void removeCurrent( )
   {
        //if (cursor ==  tail)  // ( null == cursor.getLink() )
          //         throw new Error("nothing there");

        //if ( null != cursor.getLink().getLink() )
        if (isCurrent() == true)
         {
            //cursor.setLink(cursor.getLink());
           cursor=cursor.getLink().getLink();
           manyItems--;
           
         }
        else 
         {
            cursor.setLink(cursor.getLink());
            tail = cursor;
            manyItems--;
         }
      
      
      
      

   }


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

   public void removeFirst( )
   {
     //case 1: if theres more than 1 node in the seq the first node is removed by making head point to the next node in the seq
     if (head != null || head != tail){
        head = head.getLink();
        manyItems--;
     }
     
          
     //case 2: The first element of the sequence is deleted from the sequence.
     //If this was the current element, then the current element status is invalidated.
     
     //if(head.getLink()== null )
     //if(cursor == head && head==null)
     if (head == null){
         invalidateCurrent();   
         System.out.println("Theres no nodes in the Seq");
         manyItems=0;
        }

   }


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

     public void removeLast( )
   {
      IntNode ptr;
      ptr=head;
         for (int i=0; ptr!=null && i<size()-1; i++){
            ptr.getLink();
            //if (ptr == null || ptr.getLink()== null)
            if (ptr.getLink()== null){
               //tail.setLink(ptr.getLink()-1);
               tail=ptr;
               ptr.getLink().getLink();
               manyItems--;
             }
         }   

   }
   


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
   public void advance( )
   {
     //IntNode ptr= cursor;
     //while(head!=null){
         //ptr=ptr.getLink();
         //if (cursor.getLink() != null)
         //if (ptr==cursor && cursor.getLink() != null) 
     
         if (cursor.getLink()!= null)
           //cursor.setLink(cursor.getLink()); 
           cursor=cursor.getLink();
         //if (ptr==cursor && cursor.getLink() == null) 
          else
           invalidateCurrent();

      }
   //}



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
   public void setCurrent(int Seqindex)
   {
      IntNode ptr=head;
      int index=0;
      
      while (head!=null){
         ptr=ptr.getLink();
         index++;
         if(index==Seqindex){
            cursor = ptr;
            break;
          }
        }
    }
   
   
  /**
   * Set the state of this sequence so that it does not have a current element.
   *
   * @param none
   * @postcondition
   *   After calling this method, calling isCurrent() returns false.
   */

   public void invalidateCurrent( )
   {
      //if(head.getLink()== null )
     
         cursor=null;  
   }

 /**
   * Method to determine if a particular element
   * is in this sequence.
   *
   * @param target
   *   the element that needs to be found in this sequence
   * @return
   *   true if the target element is in this sequence, false otherwise
   */
  
     public boolean contains(int target)
   {
       if (head != null && head.getData() == target)
           return true;
       else if (cursor != null && head.getData() == target)
           return true;
       else if (tail != null && head.getData() == target)
           return true;
           
           
      return false; // Replace this return statement with your own code:
   }
 
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
   
   public int indexOf(int target)
   {
      IntNode ptr = head;
      int index = 0;
      
      while (head!=null){
      
         ptr=ptr.getLink();
         index++;
         
         if (ptr.getData() == target)
            return index;
       }
      return -1;   
   }


  
   public int size( )
   {
         return manyItems;
      //return 0; // Replace this return statement with your own code:
   }


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


   
   public IntSeq catenation(IntSeq s2)
   {  
      IntSeq newSeq = new IntLinkedSeq();
      IntNode head1;
      IntNode head2;
      IntNode tail2;
      IntNode cursor2;
      IntNode ptr2;
      ptr2=head;
      head2=null;
      
      
      while (head!=null){
         ptr2=ptr2.getLink();
         
         if (ptr2== null)
           // head2.setLink(ptr2.getLink()); 
           //head2.setLink(tail); 
           head2=ptr2.getLink();
           
         //if(head2==null)
            //return head;
         //if(head==null)
            //return head2;    
     }        
      //head=cursor;
      //tail=head;

      return newSeq; // Replace this return statement with your own code:
   }
   
   

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
   public IntSeq subSeq(int fromIndex, int toIndex)
   {


      return null; // Replace this return statement with your own code:
   }


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
   public IntSeq reverse( )
   {
      IntNode currentPtr = head;
      IntNode prevPtr=null;
      IntNode nextPtr=null;
      
      while (currentPtr!=null){
         nextPtr=currentPtr.getLink();
         //currentPtr.getLink()=prevPtr;
         prevPtr=currentPtr.getLink();

         prevPtr=currentPtr;
         currentPtr=nextPtr;
         }
         head=prevPtr;
      
      

      return null; // Replace this return statement with your own code:
   }
   

/**
   * Returns an array containing all of the elements in this sequence.
   *
   * @param none
   * @return
   *   an array containing all the elements in this sequence
   */
   
   public int[] toArray( )
   {
      int[] seqArray = new int[size()] ;
      int index = 0;
      IntNode ptr = head;
      
     // try(
         //while(head!= null){
         while(size()!=0){
            seqArray[index]= ptr.getData();
            
            ptr=ptr.getLink();
            //seqArray[index]  = ptr.getData() ;
            //index= ptr.getData();
            index++;
            //index=ptr.getData();
            //System.out.println("Seq Array= " +seqArray[index]);
            //index++;
            //return seqArray[index];
            
           }
         return seqArray; // Replace this return statement with your own code:
         
       //catch(Exception e){
         //throw new IllegalStateExpression("No elements in the list");
         //}
       
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
            result += "****"; // use a special symbol at the cursor
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
