import java.util.Scanner;
class PersonAge 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE..");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Adult");
		}
		else{
		System.out.println("Minor");
		}
	}
}
