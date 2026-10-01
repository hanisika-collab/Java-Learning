import java.util.Scanner;
class NumberCheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Dear User..\n Please Enter a number :)");
		int num=sc.nextInt();
		String res=num >100? num +" is greater than 100" : num<100?num +" is less than 100":num+" is equal to 100";
		System.out.println(res);
	}
}
