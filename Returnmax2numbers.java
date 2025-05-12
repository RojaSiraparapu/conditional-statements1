package condtional;

public class Returnmax2numbers {

	public static void main(String[] args) {
	
		        int n1 = 5; 
		        int n2=10;
		        int max = getMax(n1, n2);

		       System.out.println("The maximum number is: " + max);
		       }

		 
 public static int getMax(int a, int b) {
		        if (a > b)
		        {
		            return a;
		        } else 
		        {
		            return b;
		        }
		    }
		

	}

