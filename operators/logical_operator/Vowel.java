import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter charecters");
		char c=s.next().charAt(0);
		String res=c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A'  ||c=='E'  || c=='I'  || c=='O'  || c=='U' ? c +" is vowel":c+" is not vowel ";
					   
		System.out.println(res);
	}
}
