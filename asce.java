import java.util.*;
public class asce
{
 public static void main(String[] args)
{
int a,b,c;
Scanner si=new Scanner(System.in);
System.out.println("enter three numbers::");
a=si.nextInt();
b=si.nextInt();
c=si.nextInt();
si.close();
if(a>b&&b>c)
{
System.out.println("descending order");
}
else if(a<b&&b<c)
{
System.out.println("ascending order");
}
else
{
System.out.println("not in order:");
}
}
}