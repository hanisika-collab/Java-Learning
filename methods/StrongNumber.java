import java.util.Scanner;
class StrongNumber
{
	public static int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact *=i;
		}
		return fact;
	}
	public static boolean isStrong(int n){
		
        int sum=0;
		for(int temp=n;temp!=0 ;temp/=10){
			int last=temp%10;
			sum =sum+factorial(last);
		}
		return sum==n;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		System.out.println(isStrong(n) ? n+" is strong ":n+" is not strong");
		
	}
}
