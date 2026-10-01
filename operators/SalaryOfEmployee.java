import java.util.Scanner;
class SalaryOfEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Please Enter Your Salary......");
		double salary=sc.nextDouble();
		
		String res=salary>30000? salary + " is more than 30000" :salary<30000?salary+ " is less than 30000":salary+" it is equal to 30000";
		
		System.out.println(res);
		
	}
}
