import java.util.Scanner;
class Greatest

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 value");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		String res=a>b && a>c ? a+" is greatest" :b>c ?b+" is greatest" :c + " is greatest";
		System.out.println(res);
	}
}
