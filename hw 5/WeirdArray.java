/*Course : CS27500
 * Name: Xavier Richardson
 * Email: xarichar@pnw.edu
 * Assignment: 5
*/
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class WeirdArray<T> implements Iterable <T>
{
 private Object[] theArray;
 
 public WeirdArray(int n)
 {
  theArray = new Object[n];
 }
 
 public T getElement(int i){
  return (T) theArray[i];
 }
 
 public void setElement(int i, T e){
  theArray[i] = e;
 }
 
 public int getLength(){
  return theArray.length;
 }
 
 public Iterator <T> iterator(){
  return (Iterator <T>) new WeirdIterator<T>(this);
 }
}
