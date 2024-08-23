import java.util.Scanner;

public class Count {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Enter Number : ");
int num=s.nextInt();
s.close();
int count=0,r,rev=0;
while(num>0)
{
    r=num%10;
    rev=(rev*10)+r;
    num=num/10;
    count++;
}
System.out.println("This is "+count+" Digit Number");
while(rev>0)
{
    r=rev%10;
    System.out.println(r);
    rev/=10;
}
    }
}

