import java.util.Scanner;
class PrintCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
		int start=1,n=sc.nextInt(),count=0;
		while(start<=n){
			count++;
			start++;
		}
		System.out.println("The count is: "+count);
	}
}
