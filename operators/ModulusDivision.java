import java.util.Scanner;
class ModulusDivision 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a=sc.nextInt(),b=sc.nextInt();
		int c=a%b;
		System.out.println(a+" % "+b+" = "+c);
	}
}
