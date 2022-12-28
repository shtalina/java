package lab_7;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
		System.out.print("enter y: ");
		 
        int y = in.nextInt();
		
        if(y > 0) {
		    x = 1;
		}
		System.out.print("x: " + x);
	}
    }

