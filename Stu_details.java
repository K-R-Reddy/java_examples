import java.util.*;
public class Stu_details {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter your name,section,branch,percentage : ");
String name=s.nextLine();
char section=s.next().charAt(0);
String branch=s.next();
float percentage=s.nextFloat();
s.close();
System.out.println("\t::Student Details::");
System.out.println("Name : "+name+"\nSection : "+section+"\nBranch : "+branch+"\nPercentage : "+percentage);

}
    
}
