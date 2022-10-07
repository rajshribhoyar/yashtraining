package conditions.com;

import java.util.Scanner;

public class Statament_elseIf {
	public static void main(String[] args) {
		
		int marks;
		
		System.out.print("Enter Marks:");
		Scanner ss =new Scanner(System.in);
		marks=ss.nextInt();
		
		if (marks>=60 && marks<100) {
			System.out.println("First Division");
			
		}
		else if (marks>=45 && marks<60) {
			System.out.println("Second Devision");
			
		}
		else if (marks>=35 && marks<45) {
			System.out.println("Pass");
			
		}
		
		else {
			System.out.println("Fail!!!");
			
		}
		
	}

}
