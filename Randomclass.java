import java.util.*;
public class Randomclass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("If You Got 10 By Luck(0-10) \"You Win\"");
        String ch="yes";
        while (ch.equals("yes")) {
            int luck=r.nextInt(11);
        if(luck==10){
            System.out.println("You Win the Game.You got the 10...");
            break;
        }
        else{
          System.out.println(luck);
          System.out.println("You Loose the Game.If you want to Try again??Enter yes :: ");
          ch=s.next();
          ch=ch.toLowerCase();
        }
        }
        s.close();
    }
    
}
