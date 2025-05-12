package condtional;

public class Vip {

	public static void main(String[] args) {
		String membership="platinum";
		 String access = (membership.equals("Gold") || membership.equals("Platinum"))
                 ? "Access granted to VIP lounge"
                 : "Access denied";
	

        System.out.println(access);
    }
}

