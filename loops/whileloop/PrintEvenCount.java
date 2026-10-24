import java.util.Scanner;
class PrintEvenCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
		int start=1,n=sc.nextInt(),count=0;
		while(start<=n){
			if(start %2==0)
			       count++;
			start++;
		}
		System.out.println("The count is: "+count);
	}
}
