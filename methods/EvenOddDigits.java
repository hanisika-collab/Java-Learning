import java.util.Scanner;
class EvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt(),Evencount=0,Oddcount=0;
		for(;n!=0;n /=10){
			int last=n%10;
			if(last % 2==0){
				Evencount++;
			}
			else{
				Oddcount++;
			}
					
		}
		System.out.println("The event count  is : "+Evencount);
		System.out.println("The odd count  is : "+Oddcount);
	}
}
