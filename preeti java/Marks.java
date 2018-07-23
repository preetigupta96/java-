//package greaterno;
import java.util.*;


 class Subject {

    
    public static void main(String[] args)
    {
        int num1,num2,num3,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter three marks");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        per=((num1+num2+num3)/3)*100;
        if(per>40 && per<=50)
	{
	  System.out.println("\n Average");
	}
	else if(per>50 && per<=60)
	{

	System.out.println("Higher second class");
	}
	else if(per>60 && per<=66)
	{
	 System.out.println("First class");
	}   
	else if(per>66 && per<=100) 
	{
	 System.out.println(" First class with Distinction ");
	}
        else
	{
		System.out.println("You have ATKT");
	}
}
}
