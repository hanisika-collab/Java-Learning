import java.util.Scanner;
class PersonsAge 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE...");
		int age=sc.nextInt();
		if(age<=14){
			System.out.println("You are a child");
		}
		else if(age<18){
			System.out.println("You are a Teenager");
		}
		else{
			System.out.println("You are a Adult... :)");
		}
	}
}


//System.out.println(""); 90 or above:A,75-89:B,50-74:C,<50:FAIL