import java.util.Scanner;
class ElectricityUnits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ELECTRICITY UNITS");
		double units=sc.nextDouble();
		if(units >=0 && units <=100){
			System.out.println("LOW USAGE :)");
		}
		else if(units>=101 && units <=300){
			System.out.println("MEDIUM USAGE :)");
			
		}
		
		else{
			System.out.println("HIGH USAGE :(");
		}
	}
}
