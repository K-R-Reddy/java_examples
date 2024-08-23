import java.util.*;
class Even
{
public static void main(String args[])
{
Scanner si=new Scanner(System.in);
System.out.println("Enter Number:");
int i=si.nextInt();
if(i%2==0)
System.out.println("Number is EVEN");
else
System.out.println("Number is ODD");
si.close();
}
}
