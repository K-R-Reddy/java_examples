import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any year : ");
        int a=s.nextInt();
        s.close();
        if(a%4==0 && a%100!=0)
        {
            System.out.println(a+" is a Leap year");
        }
        else if(a%400==0)
        {
            System.out.println(a+" is a Leap year");
        }
        else 
        {
            System.out.println(a+" is not a Leap year");
        }
    }
    
}
