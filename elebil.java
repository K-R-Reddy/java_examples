import java.util.*;
class elebil
{
    public static void main(String[] args) {
    {
     Scanner e =new Scanner(System.in);
     int un;
     double bil;
     System.out.println("Enter How many units used : "); 
     un=e.nextInt();
     e.close();
     if(un<=50)
     {
      bil=un*0.5;
     } 
     else if(un>50 && un<=150)
     {
    bil=25+((un-50)*0.75); 
     }
     else if(un>150 && un<=250)
     {
       bil=100+((un-150)*1); 
     }
     else
     {
        bil=200+((un-250)*1.25);
     }
     bil+=(bil*0.2);
     System.out.println("Your Electricity Bill : "+bil+" Rupees");
    }
    }
}