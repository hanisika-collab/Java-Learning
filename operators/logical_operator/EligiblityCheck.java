import java.util.Scanner;
class EligiblityCheck 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter salary");
		int salary=s.nextInt();
		System.out.println("Enter years of Experience");
		int experience=s.nextInt();
		String res=salary<50000 && experience>5 ?"Eligible for bonus.. :)" :"Not Eligible for Bonus";
		System.out.println(res);
	}
}
