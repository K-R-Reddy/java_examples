import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any two values : ");
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();
        if (a>b) {
            System.out.println(a+" is Max");
            System.out.println(b+" is Min");
        }
        else
        {
            System.out.println(b+" is Max");
            System.out.println(a+" is Min");
        }
    }
    
}
