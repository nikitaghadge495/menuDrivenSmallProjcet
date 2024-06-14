package smallprogram.java;

import java.util.Scanner;

public class StringOperations
{ 
	static Scanner sc = new Scanner(System.in);
	static int choice;
	static String str,str1,str2;
	static Boolean str3;
	static int length;
	
	public static void length()
	{
		sc.nextLine();
        System.out.println("Enter string: ");
        str=sc.nextLine();
        length = str.length();
        System.out.println("Length of string: " + length);
        
	}
	public static void Concatination()
	{
		sc.nextLine();
	    System.out.println("Enter the 1st String : ");
        str = sc.nextLine();
        System.out.println("Enter the 2nd String : ");
        str1 = sc.nextLine();
        
        str2 = str.concat(str1);
        System.out.println("String one is :"+str);
        System.out.println("String second is :"+str1);
        System.out.println("concatination of String is : "+str2);
		
	}
    public static void Comparision()
    {
    	sc.nextLine(); 
 	    System.out.println("Enter the 1st String : ");
         str = sc.nextLine();
         System.out.println("Enter the 2nd String : ");
         str1 = sc.nextLine();
         str3 = str.equals(str1);
         System.out.println("String one is :"+str);
         System.out.println("String second is :"+str1);
         System.out.println("concatination of String is : "+str3);
    }
    public static void trimming()
    {
    	sc.nextLine();
	    System.out.println("Enter the String : ");
        str = sc.nextLine();
        str1 = str.trim();
        System.out.println("trime of String is : "+str1);
    	
    }
	public static void main(String[] args)
	{ 
		
		do {
			
			System.out.println();//operation do u want to perform
			System.out.println("--------------------------------");
			System.out.println("String operations!!!!!!!! ");
			System.out.println();
			System.out.println("1.Length Of String");
			System.out.println("2.Concatination Of String");
			System.out.println("3.Comparision Of String");
			System.out.println("4.Trimming Of String");
			System.out.println("5.Exit");
			
			System.out.println("Enter you choice : ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			    case 1:  length();// for length of string
		                 break;
			    case 2: Concatination();//for concatination of string
			             break;
			            
			    case 3:Comparision();//for comparision of two string
			            break;
			            
			    case 4: trimming();//for to trime the string
			            break;
			    case 5: System.out.println("Exiting from operation........");//to get exit from string operation
			            return;
			   default: System.out.println("PLease enter valid choice !!!!!!");//when choice is envslid
			}
		}while(choice!=5);
		
		
		

	}

}
