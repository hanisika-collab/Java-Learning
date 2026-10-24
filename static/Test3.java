class Test3 
{
	static int a;
	static {
		System.out.println(a);
		a=20;
	}
	static{
		System.out.println(a);
		a++;
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
	}
}
