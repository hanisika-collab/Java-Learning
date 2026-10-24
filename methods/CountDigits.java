import java.util.Scanner;
class CountDigits 
{
	public static void countdigits(int n){
		int count=0;
		for(;n!=0;n/=10){
			count++;
			
		}
		System.out.println("the count  is : "+count);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
	    countdigits(n);
	}
}
