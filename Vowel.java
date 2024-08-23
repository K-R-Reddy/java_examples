import java.util.*;
public class Vowel {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Character : ");
    char c=s.next().charAt(0);
    s.close();
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
        System.out.println(c+" is a Vowel");
    }
    else
    {
        System.out.println(c+" is a Consonant");
    }
    }
}
