import java.util.Scanner;
class Attendance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Attendance Percentage");
		double attendancePercent=sc.nextDouble();
		if(attendancePercent>=75){
		System.out.println("Eligible for examination");	
		}
		else{
			System.out.println("Not Eligible for examination");
		}
		
	}
}
