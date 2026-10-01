import java.util.Scanner;
class EvenOdd

{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num=s.nextInt();
		switch(num%2){
			case 0:
				System.out.println(num+ " is even");
			break;
			case 1:
				System.out.println(num+" is odd");
			break;
		}
	}
}
