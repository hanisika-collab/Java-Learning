class PostIncrement4 
{
	public static void main(String[] args) 
	{
		int a=4;
		int b=a++;
		int c=b++;
		int d=c++;
		int e=c++;
		int f=d++;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
	}
}