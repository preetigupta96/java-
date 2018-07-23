//package greaterno;
import java.util.*;


public class Triangle {

    
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter three no.s");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num2=sc.nextInt();
        if(num1=num2 && num1==num3)
        {
                System.out.println("Equilateral Triangle");
 
        }
        else if(num1==num2 || num1==num3|| num2==num3)
       {
       System.out.println("Iscosceles Triangle");

       }
        else
                    System.out.println("Scalar Triangle");

        
    }
    
}
