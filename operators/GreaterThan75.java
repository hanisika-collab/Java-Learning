import java.util.Scanner;
class GreaterThan75 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		String res=n>75? n+ " is Greater than 75":n+" is less than 75";
		System.out.println(res);
	}
}
