import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
		int n=sc.nextInt(),evencount=0,oddcount=0;
		while(n!=0){
			if(n%2==0)
			    evencount++;
			else
				oddcount++;
			n/=10;
				}
		System.out.println("The count even is: "+evencount);
		System.out.println("The count odd is: "+oddcount);
	
	}}