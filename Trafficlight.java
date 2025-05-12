package condtional;

public class Trafficlight {

	public static void main(String[] args) {
		String lightcolor="blue";
		switch(lightcolor) {
		case "green":
			System.out.println("Go");
		break;
		case "yellow":
			System.out.println("slow down");
		break;
		case "red":
			System.out.println("stop");
		break;
		default:
			System.out.println("Invalid traffic light");
		}
		
		

	}

}
