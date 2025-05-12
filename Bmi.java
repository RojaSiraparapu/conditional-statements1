package condtional;

public class Bmi {

	public static void main(String[] args) 
	{
		double weight=45;
		if(weight<18.5) {
			System.out.println("Undeweight");
			}
		else if(weight>=18.5&&weight<=24.9) {
			System.out.println("Normal weight");
		}
		else if(weight>=25.0&&weight<=29.9) {
			System.out.println("over weight");
		}
		else if(weight>=30) {
			System.out.println("Obese");
		}
		else {
			System.out.println("invalid");
		}
	}
	

}
