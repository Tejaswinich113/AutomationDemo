package com.javapractice.conditionalstatements;

public class SwitchCase {
	
	public static void main(String[] args) {
		String degree="Btech";
		
		switch(degree) {
			case "Btech":
				System.out.println("Eligible for M.tech");
				break;
			case "Mtech":
				System.out.println("Eligible for PHD");
				break;
			case "BBA":
				System.out.println("Eligible for MBA");
				break;
			default:
				System.out.println("Not eligible for any course");
				break;
				
		}
		
		String board="Fridge";
		
		switch(board) {
		case "TV":
			System.out.println("Turn on TV");
			break;
		case "Ac":
			System.out.println("Turn on Ac");
			break;
		case "Fridge":
			System.out.println("Turn on Fridge");
			break;
		default:
			System.out.println("This switch do not have any connection");
			break;
		}
		
	   int classnumber=4;
	   
	   switch(classnumber) {
	   case 1:
		   System.out.println("This is MBA classroom");
		   break;
	   case 2:
		   System.out.println("Thhis is BBA classroom");
		   break;
	   case 3:
		   System.out.println("This is Btech classroom");
		   break;
	   case 4:
		   System.out.println("This is Mtech classroom");
		   break;
	   default:
		   System.out.println("There is no classroom matching to this number");
		   break;
	   }
	  
	  int sessiontime=2;
	  
	  switch (sessiontime) {
	case 1:
		System.out.println("java class");
		break;
	case 2:
		System.out.println("Selenium class");
		break;
	case 3:
		System.out.println("Manual testing class");
		break;

	default:
		System.out.println("No class at that particular time");
		break;
	}
				
	}

}
