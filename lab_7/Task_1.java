package lab_7;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        double radius, area;
        Scanner rad = new Scanner(System.in);
		
        System.out.print("Enter radius: ");
		radius = rad.nextDouble();
		
        if(radius < 0) {
            System.out.println("error");
		   
		}
		else {
		    area = 3.14159 * radius * radius;
		    System.out.println("Area for radius: " + radius+ " equal  " + area); 
		}
	}
}    
    

