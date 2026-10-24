import java.util.Scanner;
class Sum1Digits 
{
	public static int sum1digits(int n){
		int sum=0;
		for(;n!=0;n/=10){
			int last=n%10;
			sum +=last;	
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
	    int res=sum1digits(n);
		System.out.println("the sum  is : "+res);
	}
}
