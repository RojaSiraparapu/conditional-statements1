package condtional;

public class Shipping {

	public static void main(String[] args) {
	double cost=55.0;
	if(cost>50.0) {
		System.out.println("free shipping for orders$50+");
	}
	else if(cost>50.0) {
		System.out.println("free shipping for orders$49.99");
	}
	else if(cost>20.0&&cost<=49.9) {
		System.out.println("free shipping for orders$20-$49.99");
	}
	else if(cost<20.0){
		System.out.println("free shipping for under$20");
	}
	else {
		System.out.println("invalid");
		
	}
		
	}
}
