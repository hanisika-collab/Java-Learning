class PostIncrement6 
{
	public static void main(String[] args) 
	{
		int a=6;
		int b=a++ + a++;
		int c=b++ + a++ + b++;
		int d=a++ +b++ - c++ + c++;
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
