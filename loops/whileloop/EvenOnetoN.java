import java.util.Scanner;
class EvenOnetoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int start=1 , end=sc.nextInt();
		while(start <= end){
			if(start %2 ==0){
				System.out.println(start);
			}
			start++;
		}
	}
}
