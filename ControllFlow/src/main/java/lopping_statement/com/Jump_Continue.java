package lopping_statement.com;

public class Jump_Continue {
	public static void main(String[] args) {
		for(int i=0;i<=10;++i) {
			if(i==5)
				continue;  //  skip 5.
			{
				System.out.println(i+"");
			}
		}
	}
}
// Out - 1,2,3,4,6,7,8,9,10.