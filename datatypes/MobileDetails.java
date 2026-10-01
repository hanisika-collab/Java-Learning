
import java.util.Scanner;
class MobileDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile name: ");
		String mobilename=sc.nextLine();
		System.out.println("Enter price:");
		int price=sc.nextInt();
		System.out.println("Enter RAM VALUE");
		String RAM=sc.nextLine();
		System.out.println("Enter ROM VALUE ");
		String ROM=sc.nextLine();
		System.out.println("Enter colour ");
		String colour=sc.nextLine();
		System.out.println("Enter Frontcamera");
		String Frontcamera="55pixel";
		String Backcamera="65pixel";
		String version="16.0.0";
		String StorageCompersion="10GB";
		String BatteryCapacity="5000 mAh";
		
		System.out.println(mobilename);
		System.out.println(price);
		System.out.println(RAM);
		System.out.println(ROM);
		System.out.println(colour);
		System.out.println(Frontcamera);
		System.out.println(Backcamera);
		System.out.println(version);
		System.out.println(StorageCompersion);
		System.out.println(BatteryCapacity);
	}
}
