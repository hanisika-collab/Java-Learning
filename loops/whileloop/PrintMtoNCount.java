import java.util.Scanner;
class PrintMtoNCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
		int s=sc.nextInt(),n=sc.nextInt(),EvenCount=0,OddCount=0;
		while(s<=n){
			if(s%2==0)
			       EvenCount++;
			else
				OddCount++;
			s++;
				}
		System.out.println("The count even is: "+EvenCount);
		System.out.println("The count odd is: "+OddCount);
	}
}
