import java.util.*;
public class Job_Sequencing_Greedy {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no of Jobs :: ");
                int n=sc.nextInt();
                int job[]=new int[n];
                int d[]=new int[n];
                int p[]=new int[n];
                for(int i=0;i<n;i++){
                    job[i]=i+1;
                    System.out.println("Enter Job "+job[i]+" profit : ");
                    p[i]=sc.nextInt();
                    System.out.println("Enter Job "+job[i]+" DeadLine : ");
                    d[i]=sc.nextInt();
                }
                ArrayList<Job> jobs = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    jobs.add(new Job(job[i], p[i], d[i]));
                }

                // Sort jobs by profit in descending order
                Collections.sort(jobs, (a, b) -> b.profit - a.profit);

                int maxDeadline = 0;
                for (int i = 0; i < n; i++) {
                    if (jobs.get(i).deadline > maxDeadline) {
                        maxDeadline = jobs.get(i).deadline;
                    }
                }

                int[] result = new int[maxDeadline + 1];
                boolean[] slot = new boolean[maxDeadline + 1];

                for (int i = 0; i < n; i++) {
                    for (int j = Math.min(maxDeadline, jobs.get(i).deadline); j > 0; j--) {
                        if (!slot[j]) {
                            result[j] = jobs.get(i).id;
                            slot[j] = true;
                            break;
                        }
                    }
                }

                System.out.println("Scheduled Jobs:");
                for (int i = 1; i <= maxDeadline; i++) {
                    if (slot[i]) {
                        System.out.print("J" + result[i] + " ");
                    }
                }
                System.out.println();
                sc.close();
        }
}

class Job {
    int id;
    int profit;
    int deadline;

    public Job(int id, int profit, int deadline) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}
