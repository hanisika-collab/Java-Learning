import java.util.Scanner;
class Switch

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		switch(n%2){
			case 0:
				System.out.println("Even Number");
				break;
			case 1:
				System.out.println("Odd number");
				break;
			default:
				System.out.println("invalid number");
		}
	}
}
