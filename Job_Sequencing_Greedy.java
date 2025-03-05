import java.util.*;
public class Job_Sequencing_Greedy {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no of Jobs :: ");
                int n=sc.nextInt();
                int 
                int d[]=new int[n];
                int p[]=new int[n];
                for(int i=0;i<n;i++){
                    System.out.println("Enter Job "+(i+1)+" profit : ");
                    p[i]=sc.nextInt();
                    System.out.println("Enter Job "+(i+1)+" DeadLine : ");
                    d[i]=sc.nextInt();
                }
                for(int i=0;i<n-1;i++){
                        for(int j=i+1;j<n;j++){
                            if(p[i]<p[j]){
                                temp=pw[i];
                                pw[i]=pw[j];
                                pw[j]=temp;
                                temp=p[i];
                                p[i]=p[j];
                                p[j]=(int)temp;
                                temp=w[i];
                                w[i]=w[j];
                                w[j]=(int)temp;
                            }
                        }
                    }

        }
        
}
