import java.util.Scanner;
class Temprature 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER Temprature");
		int temp=sc.nextInt();
		if(temp<20){
			System.out.println("COLD");
		}
		else if(temp>=20 && temp<=35){
			System.out.println("Normal");
		}
		else{
			System.out.println("HOT");
		}
	}
}