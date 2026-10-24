import java.util.Scanner;
class Addition 
{
	public static void addition(int a, int b, int c){
		
		System.out.println(a + " + "+ b+" + "+c+" = " + (a+b+c));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		addition(a,b,c);
	}
}
