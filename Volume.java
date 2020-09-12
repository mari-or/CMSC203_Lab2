import java.util.Scanner;
import java.lang.Math;

public class Volume {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("FINDING VOLUME OF A SPHERE");
		System.out.println("What is the diameter of the sphere (in inches)?");
		double diameter = sc.nextDouble();
		double radius = diameter/2;
		
		
		double volume = (radius * radius * radius)*Math.PI*4/3;
		
		if (radius < 0)
			System.out.println("Invalid input.");
		
		else
			System.out.println("The radius is " + radius + " in");
			System.out.println("The volume of the sphere is " + volume + " in^3");
		
		
	
	}

}
