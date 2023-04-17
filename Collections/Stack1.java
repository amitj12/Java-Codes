import java.util.Stack;


public class Stack1 {
    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();

        s.push("Apple");
        s.push("mango");
        s.push("banana");
      
        s.push("chiku");

        System.out.println(s);

        s.pop();
        System.out.println(s);

       Collections.sort(s);

       System.out.println(s);

       System.out.println(s.peek());
       System.out.println(s.isEmpty());


    }
}
