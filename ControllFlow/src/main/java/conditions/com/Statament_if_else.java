package conditions.com;

import java.util.Scanner;

public class Statament_if_else {
	public static void main(String[] args) {
		
		int pws;
		System.out.print("Enter Pws:");
		Scanner ss=new Scanner(System.in);
		pws=ss.nextInt();
		
		if (pws==1612) {
			System.out.println("My name: Rajshri");
			System.out.println("My Age: 27");
			System.out.println("My Contact Number: 9373928319");
			System.out.println("My Address: O-403, Pritine Prolife-II, Wakad,Pune");
			
		}else {
			System.out.println("Sorry!!!! Wrong Password");
		}
		
	}

}
