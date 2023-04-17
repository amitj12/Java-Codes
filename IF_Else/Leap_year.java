import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Leap_year {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0)
        {
            System.out.println("leap year");
        }
        else if(n%100==0)
        {
            System.out.println("not leap year");
        }
        else if(n%4==0)
        {
            System.out.println("leap year");
        }
    }
}  
    