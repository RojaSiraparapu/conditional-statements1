package condtional;

public class Leap {

	public static void main(String[] args)
	{
		
		
		        int year = 2025; 

		        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		        String result = isLeap ? "Leap year" : "Not a leap year";

		        System.out.println(year + " is " + result + ".");
		    }
		


	}


