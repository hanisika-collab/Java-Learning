import java.util.Scanner;
class SumEvenOddSum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter m and n value");
		int m=s.nextInt(),n=s.nextInt(),EvenSum=0,OddSum=0;
		for(;m<=n;m++){
			if(m % 2==0){
				EvenSum +=m;
				
			}
			else{
				OddSum +=m;
			}
					
		}
		System.out.println("The event count  is : "+EvenSum);
		System.out.println("The odd count  is : "+OddSum);
	}
}
