package condtional;

public class Validuser20 {

	public static void main(String[] args) {
		String password = "2537548";
		
		if(password == null)
			System.out.println("Null not allowed");
		else if(password.isEmpty())
			System.out.println("Empty password is not allowed");
		else if(password.length()<3||password.length()>20)
			System.out.println("Password must between 3 and 20 characters");
		else 
			System.out.println("print appropriate error messages");
			


	}

}
