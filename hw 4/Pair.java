/*Course : CS27500
 * Name: Xavier Richardson
 * Email: xarichar@pnw.edu
 * Assignment: 5
*/

public class Pair<T1, T2>{
  
 private T1 first;
 private T2 second;
 
 /**
   * Default Constructor
   *
   * @param none 
   *
   * @postcondition
   *   This constructor sets both fields to null
   *      
   **/
 
 public Pair(){
  this.first = null;
  this.second = null;
 }
 

/**
   * Second Constructor
   *
   * @param one, two
      Two (private) instance fields called first (of type T1) and second (of type T2)
   *   
   * @postcondition
   *   This constructor takes references to objects of type T1 and T2 and points the two instance fields at these two objects.
   *        
   **/
 public Pair(T1 one, T2 two){
  this.first = one;
  this.second = two;
 }
 
/**
   * Thrid Constructor
   *
   * @param  obj
   *   reference to a Pair object of the same type as the one being constructed
   *   
   * @postcondition
   *   This constructor creates a shallow copy by pointing the instance fields of 
   *    the item being constructed at the two objects contained in the given Pair object
   *      
   **/

 public Pair(Pair <T1, T2> obj){
  this.first = obj.first;
  this.second = obj.second;
 }
 
 
 /**
  * Points the fisrt object to the T1 object one
  * 
  * @param one
  *   reference to a Pair object of the same type as the one being constructed
  *
  *
  * @postcondition
  *    Points the fisrt object to the T1 object one
  *
  * 
  * @return A reference to the current object (so that other method calls can be chained).
  * 
  * 
  * 
 **/
 public Pair< T1, T2 > setFirst(T1 one){
  this.first = one;
  return this;
 }
 
 /**
  * Points the second object to the T1 object one
  * 
  * @param two
  *   reference to a Pair object of the same type as the one being constructed
  *
  * @postcondition
  *    Points the second object to the T1 object one
  *
  * @return 
  *    A reference to the current object (so that other method calls can be chained).
  * 
  **/

 public Pair<T1 , T2> setSecond(T2 two){
  this.second = two;
  return this;
 }
 
  /**
   * Accessor method to get the data from this pair.
   * @param none
   * @return
   *   the data from this pair's first index 
   **/
 public T1 getFirst(){
  return this.first;
 }
 
 
 /**
   * Accessor method to get the data from this pair.
   * @param none
   * @return
   *   the data from this pair's second index 
   **/
 public T2 getSecond(){
  return this.second;
 }
 
 /**
  * Causes a new Pair of ojects to change places with each other.
  * 
  * @param none
  * 
  * @postcondition
  *    The objects in the new Pair are the same as the objects in the current pair, but in the opposite order.
  *
  * @return 
  *    A reference to a new Pair object of type Pair<T2,T1> where the objects in the new Pair are the same as the objects in the current pair, but in the opposite order.
  * 
  **/

 public Pair<T2, T1> transpose(){
  Pair<T2, T1> apair = new Pair<T2 , T1> (this.second, this.first);
  return apair;
 }
 
 
 /**
   * Modification method to set the data in this pair.
   * @param one, two
   *   the new data to place in this pair
   * @postcondition
   *   The data of this pair has been set to one and two.
   **/

 public void set(T1 one, T2 two){
  setFirst(one);
  setSecond(two);
 }
 
 /**
  *  Replaces the first item in the new pair as the argument object and the second item in the new pair is the first item from the this object. 
  * 
  * @param obj, this.second
  * 
  * @postcondition
  *    The objects in the new Pair are the same as the objects in the current pair, but in the opposite order.
  *
  * @return 
  *   A new Pair object where the first item in the new pair is the argument object and the second item in the new pair is the second item from the this object. 
  **/

 public <T3> Pair<T3, T2> replaceFirst(T3 obj){
  Pair<T3,T2> apair = (Pair<T3,T2>) new Pair<T1,T2> ((T1) obj, this.second);
  return apair;
 }
 
 

 /**
  *  Replaces the second item in the new pair as the argument object and the thrid item in the new pair is the second item from the this object now. 
  * 
  * @param obj, this.first
  * 
  * @postcondition
  *    The objects in the new Pair are the same as the objects in the current pair, but in the opposite order.
  *
  * @return 
  *   A new Pair object where the first item in the new pair is the argument object and the second item in the new pair is the second item from the this object. 
  **/
 public <T4> Pair<T1, T4> replaceSecond(T4 obj){
  Pair<T1,T4> apair = (Pair <T1, T4>) new Pair<T1 , T2> (this.first, (T2) obj);
  return apair;
 }
 
 /**
  *  Determines if the items in the pair are equal to the parameter.
  * 
  * @param obj
  * 
  * @postcondition
  *    The objects in the new Pair are the same as the objects in the current pair, but in the opposite order.
  *
  * @return 
  *   return true when the argument that is not null, the argument that is a Pair object, and the items in that pair are equal to the items in this pair.
  *
  **/

 @Override
 public boolean equals(Object obj){
  if(obj instanceof Pair <? , ? > && obj != null){
   if(((Pair <? ,?>) obj) .getFirst().equals(getFirst())){
    if(((Pair < ?, ? >)obj).getSecond().equals(getSecond())){
     return true;
    }
   }
  }
  return false;
 }
 
 
 /**
   * Returns a String containing a representation of all the elements
   * in this pair.   
   * @param none
   * @return
   *   a String containing all the elements in this pair
   */

 public String toString(){
  String result = "[";
  result += getFirst();
  result += ",";
  result += getSecond();
  result += "]";
  return result;
 }
}