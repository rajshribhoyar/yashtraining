
public class Test3 {
	public static void main(String[] args) {
		String arr[]={"JavaCoding","tsfd","fytry"};
		String str="Happy Birthday dear";
		String str1="nikhil strivastaw";
		
		int max=0;
		String maxLenght="";
		for(String s:arr) {
			if(max<s.length()) {
				max=s.length();
				maxLenght=s;
			}
		}
		System.out.println(maxLenght);
		String[] arr1=str.split("");
		for(String s:arr1)
			System.out.println(s.charAt(0));
		
		System.out.println(str1.toUpperCase().charAt(0)+". "+str1.toUpperCase().charAt(str1.indexOf(" ")+1)+str1.substring(str1.indexOf(" ")+2,str1.length()));
		
	}

}
