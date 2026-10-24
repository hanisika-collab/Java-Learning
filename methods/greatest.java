import java.util.Scanner;
class greatest 
{
	public static void gretest(int a, int b){
		if(a>b)
			System.out.println("The greatest is "+a);
		else
			System.out.println("The Greatest is "+b);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt(),b=sc.nextInt();
		gretest(a,b);
	}
}
