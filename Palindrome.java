package week1.day2.HomeAssignments;

public class Palindrome {

	public static void main(String[] args) 
	{
		        int input = 124;  
		        int output = 0;  
		        int originalInput = input;

		        for (int i = input; i != 0; i /= 10) 
		        {
		            int digit = i % 10;  
		            output = output * 10 + digit;  
		        }

		        if (input == output) 
		        {
		            System.out.println(input + " is a palindrome.");
		        } else 
		        {
		            System.out.println(input + " is not a palindrome.");
		        }
		    }
	}