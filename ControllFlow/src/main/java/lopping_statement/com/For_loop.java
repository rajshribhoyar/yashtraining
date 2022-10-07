package lopping_statement.com;


import java.util.Scanner;

public class For_loop {
	public static void main(String[] args) {
		
		int num1;
		
		System.out.print("Enter The Table Number:");
		Scanner ss=new Scanner(System.in);
		num1=ss.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num1*i);
					
		}
		
	}

}
