interface inter{
void display();
}
public class interfacekey implements inter{
    public void display()
    {
        System.out.println("This is a Interface Method");
    }
    public static void main(String[] args) {
        interfacekey i=new interfacekey();
        i.display();
        inter a =i;
        a.display();
    }
    
}
