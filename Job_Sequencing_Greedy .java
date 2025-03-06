import java.util.*;
public class Job_Sequencing_Greedy {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no of Jobs :: ");
                int n=sc.nextInt();
                int j[]=new int[n];
                int d[]=new int[n];
                int p[]=new int[n];
                for(int i=0;i<n;i++){
                    job[i]=i+1;
                    System.out.println("Enter Job "+job[i]+" profit : ");
                    p[i]=sc.nextInt();
                    System.out.println("Enter Job "+job[i]+" DeadLine : ");
                    d[i]=sc.nextInt();
                }
                int temp,maxdeadline=d[0];
                for(int i=0;i<n-1;i++){
                        if(maxdeadline<d[i+1]){
                        	maxdeadline=d[i+1];
                        }
                        for(int j=i+1;j<n;j++){
                            if(p[i]<p[j]){
                                temp=p[i];
                                p[i]=p[j];
                                p[j]=temp;
                                temp=job[i];
                                job[i]=job[j];
                                job[j]=temp;
                                temp=d[i];
                                d[i]=d[j];
                                d[j]=temp;
                            }
                        }
                    }

        }
        
}
