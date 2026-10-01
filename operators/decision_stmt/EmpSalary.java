import java.util.Scanner;
class EmpSalary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Salary:");
		double salary=sc.nextDouble(); 
		if(salary>=50000){
			System.out.println("High Salary");
		}
		else{
		System.out.println("Standard Salary");
		}
	}
}
