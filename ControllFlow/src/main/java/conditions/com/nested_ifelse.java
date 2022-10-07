package conditions.com;

import java.util.Scanner;

public class nested_ifelse {
	public static void main(String[] args) {
		
		int x,y,z;
		
		System.out.println("Enter Miximum Number:");
		Scanner ss=new Scanner(System.in);
		x=ss.nextInt();
		y=ss.nextInt();
		z=ss.nextInt();
		
		if (x>y) {
			
			if (x>z) {
				System.out.print("Miximum Number:"+x);
				
			}else {System.out.print("Miximum Number:"+y);
				
			}
		}else {
			System.out.print("Miximum Number:"+z);
			
		}
		
	}

}
