import java.util.Scanner;
class PrintOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
		int n=sc.nextInt();
		while(n!=0){
			int last=n%10;
			if(last % 2==1)
			   System.out.println(last);
			n /=10;
		}
	}
}
