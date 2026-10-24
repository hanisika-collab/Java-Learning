import java.util.Scanner;
class NTO1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int start=sc.nextInt(), end=1;
		while(start >= end){
			System.out.println(start);
			start--;
		}
	}
}
