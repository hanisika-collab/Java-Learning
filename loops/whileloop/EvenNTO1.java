import java.util.Scanner;
class EvenNTO1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int start=sc.nextInt(), end=1;
		while(start >= end){
			if(start %2 ==0){
				System.out.println(start);
			}
			
			start--;
		}
	}
}