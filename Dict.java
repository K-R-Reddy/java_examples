import java.util.*;
public class Dict{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Dictionary<Integer,String> d=new Hashtable<>();
        int ch;
        do{
        System.out.println("1.Insert 2.Delete 3.SearchKey 4.Display 5.Exit\nEnter Choice :: ");
        ch=s.nextInt();
        switch(ch){
            case 1:System.out.println("Enter Roll Number and Name :: ");
                   int key=s.nextInt();
                   String name=s.nextLine();
                   d.put(key, name);
                   break;
           case 2:System.out.println("Enter Roll Number to Delete :: ");
                    int dkey=s.nextInt();
                    d.remove(dkey);
                    break;
           case 3:System.out.println("Enter Roll Number to Search :: ");
                    int skey=s.nextInt();
                    System.out.println((d.get(skey)==null)?"Roll Number Not Found":"Name of the Student :: "+d.get(skey));
                    break;
           case 4:System.out.println("Current Dictionary :: ");
                 // for (int ele: d.keys()){
                 //    System.out.println(ele+"="+d.get(ele));
                 // }
                  break;
           case 5:System.out.println("Exiting....");break;
           default:System.out.println("Enter Vaild Operation!!");
        }
        }while(ch!=5);
        s.close();
    }
}