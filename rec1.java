import java.util.*;
public class rec1
{
static int fact(int n)
{
    if(n==0){
        return 1;
    }
    else 
    {
        return n*fact(n-1);
    }
}
public static void main(String[] args) {
    int num;
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter any number : ");
        num = s.nextInt();
    }
    int factorial=fact(num);
    System.out.println("Factorial of "+num+" is "+factorial);
}
}