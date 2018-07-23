//package greaterno;
import java.util.*;


 class Alpha{

    
    public static void main(String[] args)
    {
        char ch;
	System.out.println("\n Enter any character");
       Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
	{
	System.out.println("The Character is Alphabet "+"\t"+ch);
	}
	else if(ch>=48 && ch<=57)
	{
	System.out.println("The Character is Number");
	}
	else
	System.out.println("The character is Special Character");
        
}
}
