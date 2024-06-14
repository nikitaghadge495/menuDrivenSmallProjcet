package smallprogram.java;

import java.util.Scanner;

public class AreasofTSCR {

	public static void main(String[] args) 
	{
		int choice ,a,b,s,d1,d2;
		double ans2,area;
		float r;
		
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("************************************************");
			System.out.println();
			System.out.println("1.Area of Square : ");
			System.out.println("2.Area of Rectangle : ");
			System.out.println("3.Area of Circle : ");
			System.out.println("4.Area of Equilateral Tringle : ");
			System.out.println("5.Area of Rhombus : ");

			System.out.println("enetr your choice : ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			   case 1: System.out.println("Enter the side :");
			            a = sc.nextInt();
			           int ans = a*a;
			           System.out.println("Area of Square is : "+ans);
			           break;
			           
			   case 2: System.out.println("Enter the Length :");
			            b = sc.nextInt();
			           System.out.println("Enter the Breadth :");
			            a = sc.nextInt();
			            ans = b*a;
			           System.out.println("Area of rectangle is : "+ans);
			           break;
			           
			   case 3: System.out.println("Enter the Radius :");
			            r = sc.nextFloat();
			            ans2 = 3.14*r*r;
			            System.out.println("Area of circle is : "+ans2);
			            break;
			            
			   case 4: System.out.println("Enter the side of an Equilateral Triangle");
		               s = sc.nextInt();
		               area=(s* s * Math.sqrt(3)) / 4;
		               System.out.println("The area of the Equilateral triangle is " + area );
		               break;
			   case 5:
	                   System.out.println("Enter the first diagonal of a Rhombus :");
	                   d1 = sc.nextInt();
	                   System.out.println("Enter the second diagonal of the Rhombus :");
	                   d2 = sc.nextInt();
	                   area = d1 * d2 * 1 / 2;
	                   System.out.println("Area of the Rhombus is " + area);
	                   break;
		       default : System.out.println("enter valid choice ");
		    	   
			}
			
			
		}while(choice!=5);

	}

}
