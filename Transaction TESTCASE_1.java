package com.grt.driver;
import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noofTrans, target;
		
		System.out.println("Enter the number of transactions in array:");
		noofTrans = sc.nextInt();
		
		int [] transArray = new int [noofTrans];
		
		System.out.println("Enter the transactions:");
		
		for (int i= 0; i<noofTrans; i++)
		{
			transArray[i] = sc.nextInt();
		}
		System.out.println("What is the target needed to be achived?");
		target = sc.nextInt();
		
		int checkVar = 0;
		int idx = 1;
		boolean checkCond = false;
		
		for (int i=0; i < noofTrans; i++)
		{
			checkVar += transArray[i];
			idx +=i;
			if (checkVar < target) break;
			{
				checkCond = true;
				break;
			}
		}
		if (checkCond == true)
		{
			System.out.println("Target is achieved after" + idx + "transactions");
		}
		else
		{
			System.out.println("Target is not achieved "); 
		}
	}
}
