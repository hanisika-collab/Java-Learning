import java.util.Scanner;
class Greatest3 
{
	public static int greatest3(int a,int b,int c){
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter  3 numbers");
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
	    int res=greatest3(a,b,c);
		System.out.println("the greastest of "+res);
	}
}
