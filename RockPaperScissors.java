package day5;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[]args)
	{
		System.out.println("It's Rock, Paper,Scissors! ");
	
	
	 Scanner scanner = new Scanner(System.in);
	 
		 System.out.println("Enter your choice");
		System.out.println("0:Rock, 1:Paper, 2:Scissors");
		
		int userChoice = scanner.nextInt();
		
		if (userChoice<0 || userChoice>2)
		{
		System.out.println("Invalid Input,Please run program again using 0,1, or 2");
		return;
	}
		int computerChoice =  (int) (Math.random()*3);
		System.out.println(computerChoice);
		
		 if (userChoice==computerChoice)
			 System.out.println("It's a Tie!~");
		 else if
		 ((userChoice==0 && computerChoice==2)||
			 (userChoice==1 && computerChoice==0)||
			 (userChoice==2 && computerChoice==1))
			 
			 System.out.println("You Win!~");
		 else
			 System.out.println("You Lose~ :( ");
		
		 scanner.close();
	
	}
}
