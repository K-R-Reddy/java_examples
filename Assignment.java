import java.util.*;
public class Assignment {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a,b : ");   
int a=s.nextInt();
int b=s.nextInt();
s.close();
a+=b;
System.out.println(a);
a-=b;
System.out.println(a);
a*=b;
System.out.println(a);
a/=b;
System.out.println(a);
a%=b;
System.out.println(a);
a=b;
System.out.println(a); 
}
}