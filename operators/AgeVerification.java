import java.util.Scanner;
class AgeVerification 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Dear user...\nPlease Enter Your Age :)");
		
	    int age=sc.nextInt();
		String res=age>=18?" You age is 18 years and more,\nUser accepted... ":"Your age is less than  18 years";
		System.out.println(res);
	}
}
