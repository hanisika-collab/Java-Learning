import java.util.Scanner;
class NtoOne 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int start=1 , end=sc.nextInt();
		while(start <= end){
			System.out.println(start);
			start++;
		}
	}
}
