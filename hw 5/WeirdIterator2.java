/*Course : CS27500
 * Name: Xavier Richardson
 * Email: xarichar@pnw.edu
 * Assignment: 5
*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WeirdIterator2<T> implements Iterator<T>
{
 //what fields do you need?
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
 
 public WeirdIterator2(WeirdArray<T> wa)
 {
  this.arrayData = wa;
  this.currentSize = arrayData.getLength();
  this.leftIndex = 0;
  this.rightIndex = currentSize - 1;
 }
 
/**
  * Returns true if the iteration has more elements. (In other words, returns true if next() would return an element rather than throwing an exception.)
  * 
  * @param none
  * 
  * @return 
  *   true if the iteration has more elements.  
 **/ 
 public boolean hasNext()
 {
  if(totalReturned < currentSize && totalReturned >= 0)
   return true;
  else
   return false;
 }
 
/**
  * Returns the next element in the iteration.
  * 
  * @param none
  * 
  * @return 
  *   the next element in the iteration  
 **/ 
 
 public T next()
 {
  if(leftRightSide){
   leftRightSide = false;
   if(rightIndex >= 0){
    returnIndex = rightIndex;
    rightIndex--;
   }
  }
  else{
   leftRightSide = true;
   if(leftIndex >= 0){
    returnIndex = leftIndex;
    leftIndex++;
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
