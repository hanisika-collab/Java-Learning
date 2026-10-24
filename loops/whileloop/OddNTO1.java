import java.util.Scanner;
class OddNTO1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value ");
		int start=sc.nextInt(), end=1;
		while(start >= end){
			if(start %2 ==1){
				System.out.println(start);
			}
			
			start--;
		}
	}
}