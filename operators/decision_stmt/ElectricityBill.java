import java.util.Scanner;
class ElectricityBill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Electricity bill amount..");
		double electricityBill=sc.nextDouble();
		if(electricityBill>2000){
			System.out.println("High Usage");
		}
		else{
			System.out.println("Normal Usage");
		}
		
	}
}
