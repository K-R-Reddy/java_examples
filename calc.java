import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int a,b,ch;
        System.out.println("\t\t\t\t\tTHIS IS SIMPLE CALCULATER");
        a=c.nextInt();
        ch=c.next().charAt(0);
        b=c.nextInt();
        c.close();
        switch (ch) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '%':System.out.println(a%b);
                break;
            default:
            System.out.println("INVAILD OPERATOR");
                break;
        }

    }
    
}
