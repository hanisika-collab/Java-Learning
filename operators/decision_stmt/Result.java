import java.util.Scanner;
class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MARKS");
		double marks=sc.nextDouble();
		if(marks>=90){
			System.out.println("Excellent..");
		}
		else{
			System.out.println("Needs to Improvement..:)");
		}
		
		
	}
}
