package lopping_statement.com;

public class Jump_Break {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;++i) {
			if (i==5) 
			break;     //does not print the 5.
			{
			System.out.println(i+" ");	
			}
		}
	}

}
// output- 1,2,3,4.
