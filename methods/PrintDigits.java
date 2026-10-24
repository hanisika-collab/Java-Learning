import java.util.Scanner;
class PrintDigits 
{
	public static void printdigits(int n){
		for(;n!=0;n /=10){
			int last=n%10;
			System.out.println(last);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
	    printdigits(n);
	}
}
