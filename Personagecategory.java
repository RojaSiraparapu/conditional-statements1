
package condtional;

public class Personagecategory {

	public static void main(String[] args)
	{
		
				int  age=45;
				if(age<13) {
					System.out.println("adult");
					}
				else if(age>=13&&age<=17) {
					System.out.println("Teenager");
				}
				else if(age>=18&&age<=64) {
					System.out.println("over weight");
				}
				else if(age>=65) {
					System.out.println("Senior");
				}
				else {
					System.out.println("invalid");
				}
			}
			
	

	}


