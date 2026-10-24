class Test4 
{
	static int a;
	static{
		System.out.println(a);
		int a=20;
		System.out.println(a);
		System.out.println(Test4.a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
	}
}
