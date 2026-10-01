import java.util.Scanner;
class ProductPrice
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price");
		double price=sc.nextDouble();
		double discount=0;
		if(price>=1000){
			discount=price-100;//1000-100=900
		}
		else{
			discount=price-50;//900-50=850
		}
		System.out.println("The Final price : "+ discount);
	}
}
