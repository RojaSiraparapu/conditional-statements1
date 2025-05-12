package condtional;

public class Premiumcard {

	public static void main(String[] args) {
		int age=35;
		double income=35000;
		String eligibility=(age>=21&&income>=40000)?"Elgible for premiumcard":"Not elgible for premiumcard";
		System.out.println(eligibility);
		
	}

}
