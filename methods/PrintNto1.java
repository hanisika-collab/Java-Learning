import java.util.Scanner;
class PrintNto1 
{
	public static void print(int n){
		for(int s=1;s<=n;s++)
			System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
	    print(n);
	}
}
