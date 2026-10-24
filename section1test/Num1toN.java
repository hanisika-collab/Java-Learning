import java.util.Scanner;
class Num1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		for(int s=1;s<=n;s++)
			System.out.println(s);
	}
}
