/*Course : CS27500
 * Name: Xavier Richardson
 * Email: xarichar@pnw.edu
 * Assignment: 5
*/

public class Pair<T1, T2>{
  
 private T1 first;
 private T2 second;
 
 public Pair(){
  this.first = null;
  this.second = null;
 }
 public Pair(T1 one, T2 two){
  this.first = one;
  this.second = two;
 }
 public Pair(Pair <T1, T2> obj){
  this.first = obj.first;
  this.second = obj.second;
 }
 public Pair< T1, T2 > setFirst(T1 one){
  this.first = one;
  return this;
 }
 public Pair<T1 , T2> setSecond(T2 two){
  this.second = two;
  return this;
 }
 public T1 getFirst(){
  return this.first;
 }
 public T2 getSecond(){
  return this.second;
 }
 public Pair<T2, T1> transpose(){
  Pair<T2, T1> apair = new Pair<T2 , T1> (this.second, this.first);
  return apair;
 }
 public void set(T1 one, T2 two){
  setFirst(one);
  setSecond(two);
 }
 public <T3> Pair<T3, T2> replaceFirst(T3 obj){
  Pair<T3,T2> apair = (Pair<T3,T2>) new Pair<T1,T2> ((T1) obj, this.second);
  return apair;
 }
 public <T4> Pair<T1, T4> replaceSecond(T4 obj){
  Pair<T1,T4> apair = (Pair <T1, T4>) new Pair<T1 , T2> (this.first, (T2) obj);
  return apair;
 }
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
 public String toString(){
  String result = "[";
  result += getFirst();
  result += ",";
  result += getSecond();
  result += "]";
  return result;
 }
}