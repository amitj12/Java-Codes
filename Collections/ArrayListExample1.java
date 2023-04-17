import java.util.*;  
 public class ArrayListExample1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object   
     // System.out.println(list);  
   /* System.out.println(list.get(0));

    list.set(0, "peru");
    Iterator x=list.iterator();
     while (x.hasNext()) {
        System.out.println(x.next());
     }*/
     /*Collections.sort(list);
     System.out.println(list);*/


    ArrayList<String> x=new ArrayList<String>();
     x.add("ciku");
     x.add("tomato");

     list.addAll(x);
     System.out.println(list);

     x.remove(1);
     System.out.println(x);

    /* x.removeAll(x);
     System.out.println(x);*/

     System.out.println(x.size());
     System.out.println(x.isEmpty());
     System.out.println(x.indexOf("chiku"));


 }  
} 