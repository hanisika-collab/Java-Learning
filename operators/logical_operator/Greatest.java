import java.util.Scanner;
class Greatest 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		int res=a>b && a>c ?a:b>c?b:c;
		System.out.println(res +" is greatest");
	}
}
