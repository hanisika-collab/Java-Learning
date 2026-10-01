
import java.util.Scanner;
class StudentMarkAndPercent 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark:");
		int mark=s.nextInt();
		System.out.println("Enter attendance percentage:");
		double attendance_Percentage=s.nextDouble(); 
		String res=mark >=35 && attendance_Percentage >=75 ?"Eligible to attend exams":"Not Eligible to attend exams" ;
		System.out.println(res);
	}
}
