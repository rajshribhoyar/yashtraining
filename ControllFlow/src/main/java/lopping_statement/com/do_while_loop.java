package lopping_statement.com;

import java.util.Scanner;

public class do_while_loop {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter Any Number:");
		Scanner ss=new Scanner(System.in);
		num=ss.nextInt();
		do {
			System.out.println(num);
			++num;
		} while (num<=10);
	}

}

// output- 1,2,3,4,5,6,7,8,9,10.
