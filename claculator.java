package smallprogram.java;

import java.util.Scanner;

public class claculator {

	public static void main(String[] args) 
	{
		int a, b ,ans,choice;
		do 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println();
			System.out.println("****************************************************************");
			System.out.println();
		    System.out.println("1.Addition \n2.Subtarction \n3.Multiplication \n4.Division");
		    System.out.println("Enetr you choice : ");
		    choice = sc.nextInt();
		    
		    switch(choice)
		    {
		       case 1: System.out.println("enter 1st number : ");
		               a = sc.nextInt();
		               System.out.println("enter 2nd number : ");
		               b = sc.nextInt();
		               ans = a+b;;
		               System.out.println("Addition is : "+ans);
		               break;
		               
		       case 2: System.out.println("enter 1st number : ");
			           a = sc.nextInt();
			           System.out.println("enter 2nd number : ");
			           b = sc.nextInt();
			           ans = a-b;;
			           System.out.println("Subtarction is : "+ans);
			           break;
			           
		       case 3: System.out.println("enter 1st number : ");
			           a = sc.nextInt();
			           System.out.println("enter 2nd number : ");
			           b = sc.nextInt();
			           ans = a*b;;
			           System.out.println("Multiplication is : "+ans);
			           break;
			           
		       case 4: System.out.println("enter 1st number : ");
			           a = sc.nextInt();
			           System.out.println("enter 2nd number : ");
			           b = sc.nextInt();
			           ans = a/b;;
			           System.out.println("Division is : "+ans);
			           break;
			   default:System.out.println("chooise is invalid!!!!! please enetr valid choice ");
		    }
		}while(choice !=4);
		
	    
         
		}

}
