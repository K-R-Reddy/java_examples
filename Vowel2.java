import java.util.*;
public class Vowel2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch=s.next().charAt(0);
        s.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.println(ch+" is a Vowel");break;
            default:System.out.println(ch+" is a Consonant");
                break;
        }
    }
    
}
