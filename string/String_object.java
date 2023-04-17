/**
 * String_object
 */
public class String_object {

    public static void main(String[] args) {
        String s="Hello world";
        
        System.out.println(s);

        //String is class.
        //s=object or reference of string 

        String str=new String("Hello world");
        System.out.println(str);

        char a[]={'a','b','c','d'};
        String cg =new String(a);
        //it take 'a' as a constructor 
        //constructor is already defined in string class 


        System.out.println(cg);




        byte ar[]={65,66,67,68};

        String s1=new String(ar);

        System.out.println(s1);

    }
}