import java.util.Scanner;
class Subtraction 
{
	public static void sub(int a, int b){
		
		System.out.println(a + " - "+ b+" = " + (a+b));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt(),b=sc.nextInt();
		sub(a,b);
	}
}
