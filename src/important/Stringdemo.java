package important;

public class Stringdemo {
	
	public static void main(String[] args) {
		
		String s= "Hello";
		String s1="Hello";
		String s5= s.concat(s);
		String s3= new String ("Hello");
		String s4= new String ("Hello");
		System.out.println(s==s1);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s.concat("java"));
		System.out.println(s);
		System.out.println(s1);
	}

}
