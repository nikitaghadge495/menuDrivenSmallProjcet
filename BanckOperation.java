package smallprogram.java;

import java.util.Scanner;

public class BanckOperation 
{
    static Scanner sc =new Scanner(System.in);
    static int choice;
    static int balance = 0,amount;
    
    private static void checkBalance() //to check the amount have in your account
    {
	  sc.nextLine();
	  System.out.println("your balance is :"+balance);
		
	}
    private static void Depositamount() //to add money in account
    {
    	sc.nextLine();
		System.out.println("enetr the amount ");
		amount = sc.nextInt();
		
		if(amount>0)
		{
			balance += amount;
			System.out.println("the "+amount+" successufuly add and total is :"+balance);

		}
		else
		{
			System.out.println("please enter valid amount");
		}
		
	}
    private static void withdrawamount() //to get money from account
    {
    	sc.nextLine();
		System.out.println("Enter the amount to withDraw : ");
		amount = sc.nextInt();
		if(amount < balance && amount > 0)
		{
			balance -= amount;
			System.out.println("the "+amount+" successufuly withdraw and total is :"+balance);
		}
		else
		{
			System.out.println("balance is not aviable");
		}
		
	}
	public static void main(String[] args) 
	{
		do
		{
			System.out.println("");
			System.out.println("Welcome to simple bank operations");
	    	System.out.println("----------------------------------");
	    	System.out.println("1.Check Balance");
	    	System.out.println("2.Deposit amount");
	    	System.out.println("3.withdraw amount");
	    	System.out.println("4.Exit");
	    	System.out.println();
	    	
	    	System.out.println("Enter your choice : ");
	    	choice = sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	   case 1: checkBalance();
	    	           break;
	    	           
	    	   case 2: Depositamount();
	                    break;
	           
	    	   case 3: withdrawamount();
	                   break;
	           
	    	   case 4: System.out.println("Exiting from operation........");
	                    return;
	           
	    	   default: System.out.println("this is an Invalid choice !!!!!!Please enter valid choice");
	                     break;
	    	           
	    	}
		}while(choice!=4);
	    	
	    	
	    	
	}

}
