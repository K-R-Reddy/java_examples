import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many students : ");
        int n=s.nextInt();
        int age[]=new int[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name,age : ");
            name[i]=s.next();
            age[i]=s.nextInt();
            
        }
        s.close();
        System.out.println("NAME\t\tAGE ");
        System.out.println("--------------------");
        for(int j=0;j<n;j++)
        {
            System.out.printf("%-15s%-2d\n",name[j],age[j]);
            
        } 
    }
    
}
