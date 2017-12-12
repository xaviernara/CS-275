/*Course : CS27500
 * Name: Xavier Richardson
 * Email: xarichar@pnw.edu
 * Assignment: 5
*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WeirdIterator<T> implements Iterator<T>
{
  private WeirdArray<T> arrayData;
  private int currentSize;
  private int leftIndex = 0;
  private int rightIndex = 0;
  private int totalReturned = 0;
  private int returnIndex = 0;
  //when item number is odd, start iterating
  //from the left side of the array, which is false
  //always start from the left side
  private boolean leftRightSide = false;
  //true means use even iteration algorithm
  private boolean evenOddItr = true;
   
  public WeirdIterator(WeirdArray <T> wa){
   this.arrayData = wa;
   this.currentSize = arrayData.getLength();
   
   //test for even or odd
   if((this.currentSize%2)== 0){
    evenOddItr = true;
   }
   else{
    evenOddItr = false;
   }
   this.leftIndex = (int) Math.ceil(this.currentSize/2.0);
   this.rightIndex = this.leftIndex;
   this.leftIndex--;
  }
  public boolean hasNext(){
   if(totalReturned < currentSize && totalReturned >= 0)
    return true;
   else
    return false;
  }

 /**
  * Returns true if the iteration has more elements. (In other words, returns true if next() would return an element rather than throwing an exception.)
  * 
  * @param none
  * 
  * @return 
  *   true if the iteration has more elements.  
 **/ 
  public T next(){
   if(leftRightSide){//extract the right side of the array
    
    //switch to left side to get next element
    leftRightSide = false;
    if(rightIndex >= 0){
        returnIndex = rightIndex;
        rightIndex++;
    }
   }
   else{//extract the left side of the array
    if(evenOddItr){
     //switch to right side to get next element
     leftRightSide = true;
    }
    else{//need to print twice from left side
     evenOddItr = true;
    }
    //state wheather there are items in the left side of array
    if(leftIndex >= 0){
        returnIndex = leftIndex;
        leftIndex--;
    }
   }
   if( hasNext()){
    totalReturned++;
    return arrayData.getElement(returnIndex);
   }
   else 
    throw new NoSuchElementException();
  }
  
  public void remove(){
   throw new UnsupportedOperationException();
  }
}