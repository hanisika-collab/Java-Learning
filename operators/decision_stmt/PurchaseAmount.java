import java.util.Scanner;
class PurchaseAmount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price");
		double amount=sc.nextDouble();
		double discount=0;
		if(amount>=5000){
		    discount=amount-(amount*0.10);//5000*0.10
		}
		else{
			discount=amount-(amount*0.05);
		}
		System.out.println("The Final Price is: "+discount);
	}
}
