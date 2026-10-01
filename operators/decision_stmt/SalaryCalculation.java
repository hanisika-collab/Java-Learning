import java.util.Scanner;
class SalaryCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee salary");
		double sal=sc.nextDouble(),bonus=0,allownse=0;
		System.out.println("Enter Years of Experience");
		double experience=sc.nextDouble();
		System.out.println("Enter preformance rating");
		double perfoRanting=sc.nextDouble();
		System.out.println("Enter employee department");
		String dept=sc.next();
		if(experience > 5){
			if(perfoRanting >=4){
				bonus=sal*0.20;
				System.out.println("20%-bonus awarded "+(sal+bonus));
			}
			else{
				bonus=sal*0.10;
				System.out.println("10%-bonus awarded "+(sal+bonus));
			}
			
		}
		else{
			System.out.println("5%-bonus awarded "+(sal+bonus));
		}
		
		if(dept.equals("IT")){
			allownse=sal*0.15;
		}
		else if(dept.equals("HR")){
			allownse=sal*0.10;
		}
		else {
			allownse=sal*0.08;
		}
		
		double total_salary=sal+bonus+ allownse;
		
		System.out.println("Bonus : "+bonus);
		System.out.println("Allownse: "+allownse);
		System.out.println("TOTAL SALARY: "+total_salary);
	}
}
