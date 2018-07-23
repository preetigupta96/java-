//package greaterno;
import java.util.*;


 class SimpleInt {

    
    public static void main(String[] args)
    {
        int P,R,T,SI;
        
       System.out.println("\n Enter P,R and T");
       Scanner sc=new Scanner(System.in);
       P=sc.nextInt();
	R=sc.nextInt();
	T=sc.nextInt();
	SI=(P*R*T)/100;

	System.out.println("The Simple Interest is:"+SI);
        
}
}
