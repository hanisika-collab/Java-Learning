import java.util.Scanner;
class Count1Digits 
{
	public static int count1digits(int n){
		int count=0;
		for(;n!=0;n/=10){
			count++;
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
	    int res=count1digits(n);
		System.out.println("the count  is : "+res);
		
	}
}
