class Zomatos1
{
	long phno;
	String name;
	double Wallet;
	String password;
	int noOfOrders;
	
	public void details(){
		System.out.println(" Phone number is: "+phno);
		System.out.println("Username is: "+name);
		System.out.println("Wallet cash: "+Wallet);
		System.out.println("Password: "+password);
		System.out.println("Number of Orders: "+noOfOrders);
		System.out.println("-----------------------");
	}
	Zomatos1(long phno){
		this.phno=phno;
	}
	Zomatos1(long phno,String name,String password){
		this(phno);
		this.name=name;
		this.password=password;
	}
	Zomatos1(long phno,String name,double Wallet,String password,int noOfOrders){
		this(phno,name,password);
		this.Wallet=Wallet;
		this.noOfOrders=noOfOrders;
	}
	 Zomatos1(
	String name,
	long phno,
	String password,
	double Wallet,
	int noOfOrders){
		this(phno,name,Wallet,password,noOfOrders);
	}
	 
	public static void main(String[] args) 
	{
		Zomatos z=new Zomatos("haniii",7654321781L,"hani323",76666,10);
		z.details();
	}
}
