import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  /*Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  */

  /*System.out.println(al);

  al.add(1,"amit");
  System.out.println(al);


  al.addFirst("aj");
  System.out.println(al);

  al.addLast("jadhav");
  System.out.println(al);*/

  al.remove(0);  
  System.out.println("After invoking remove(index) method: "+al);   
  LinkedList<String> ll2=new LinkedList<String>();  
  ll2.add("Ravi");  
  ll2.add("Hanumat");  

  al.addAll(ll2);  
  System.out.println(al);

  al.removeLastOccurrence("Ravi");
  System.out.println(al);

  System.out.println(al.size());
 }  
}  