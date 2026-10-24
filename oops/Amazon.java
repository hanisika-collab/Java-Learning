class Amazon 
{
	String userName;
	String email;
	boolean primeStatus;
	int noOfCartItems;
	
	public void details(){
		System.out.println("Username: "+userName);
		System.out.println("email: "+email);
		System.out.println("primeStatus: "+primeStatus);
		System.out.println("noOfCartItems: "+noOfCartItems);
		System.out.println("-------------------------");
	}
	
	Amazon(String userName){
		this.userName=userName;
	}
	Amazon(String userName,String email){
		this.userName=userName;
		this.email=email;
	}
	Amazon(String userName,String email,boolean primeStatus,int noOfCartItems){
		this.userName=userName;
		this.email=email;
		this.primeStatus=primeStatus;
		this.noOfCartItems=noOfCartItems;
	}
	Amazon(int noOfCartItems,String userName,String email,boolean primeStatus){
		this.userName=userName;
		this.email=email;
		this.primeStatus=primeStatus;
		this.noOfCartItems=noOfCartItems;
	}
	public static void main(String[] args) 
	{
		Amazon a1=new Amazon("hani");
		a1.details();
		Amazon a2=new Amazon("hanisika","hani@gmail.com");
		a2.details();
		Amazon a3=new Amazon("hanisika","hani@gmail.com",true,2);
		a3.details();
		Amazon a4=new Amazon(2,"hanisika","hani@gmail.com",false);
		a4.details();
		
	}
}
