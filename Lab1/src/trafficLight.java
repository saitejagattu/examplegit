import java.lang.*;
import java.util.Scanner;
public class trafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String light=sc.nextLine();
		switch (light)
		{
			case "red":
				System.out.println("stop");
				break;
			case "green":
				System.out.println("go");
				break;
			case "orange":
				System.out.println("ready");
				break;
		}

	}

}
