import java.util.Scanner;
class StudentMarks
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Marks:");
		int marks=sc.nextInt();
		String res=marks>=35 && marks <=100?"Pass" :marks>100?"It is out of range of marks ,\n  Please give marks under the range.":"Fail";
		System.out.println(res);
	}
}
 