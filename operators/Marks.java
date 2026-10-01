import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark: ");
		int marks=s.nextInt();
		String res=marks>=35 ? "Pass" : "Fail";
		System.out.println(res);
	}
}
