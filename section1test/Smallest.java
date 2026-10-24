import java.util.Scanner;
class Smallest

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 value");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a<b && a<c){
			System.out.println("The smallest number is "+a);
		}
		else if(b<c){
			System.out.println("The smallest number is "+b);
		}
		else{
			System.out.println("The smallest number is "+c);
		}
	}
}
