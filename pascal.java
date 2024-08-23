import java.util.*;

public class pascal {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int r = p.nextInt();
        p.close();
       for (int i=0;i<r;i++) {
            for (int j=0;j<r-i;j++) {
                System.out.print("  ");
            }
            int c=1;
            for (int j=0; j<=i;j++) {
                System.out.print(c+ "   ");
                c=c*(i-j)/(j+1);
            }
              System.out.println();
        }
    }
}

