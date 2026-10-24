class Zomatos
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
	Zomatos(long phno){
		this.phno=phno;
	}
	Zomatos(long phno,String name,String password){
		this.phno=phno;
		this.name=name;
		this.password=password;
	}
	Zomatos(long phno,
	String name,
	double Wallet,
	String password,
	int noOfOrders){
		this.phno=phno;
		this.name=name;
		this.Wallet=Wallet;
		this.password=password;
		this.noOfOrders=noOfOrders;
	}
	Zomatos(
	String name,
	long phno,
	String password,
	double Wallet,
	int noOfOrders){
		this.phno=phno;
		this.name=name;
		this.Wallet=Wallet;
		this.password=password;
		this.noOfOrders=noOfOrders;
	}
	
	public static void main(String[] args) 
	{
		Zomatos z1=new Zomatos(7538849594L);
		z1.details();
		Zomatos z2=new Zomatos(8538849594L,"Hani",3000,"hani1234",8);
		z2.details();
		Zomatos z3=new Zomatos(7453895345L,"Haniiii","hani1234444");
		z3.details();
		Zomatos z4=new Zomatos("haniii",7654321781L,"hani323",76666,10);
		z4.details();
	}
}
