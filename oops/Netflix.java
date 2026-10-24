class Netflix 
{
	int id;
	String plan;
	int watchingHrs;
	
	public void details(){
		System.out.println("User ID: "+id);
		System.out.println("Plan: "+plan);
		System.out.println("Watching Hours: "+watchingHrs);
		System.out.println("-------------------------");
	}
	Netflix(int id){
		this.id=id;
	}
	Netflix(int id,String plan){
		this.id=id;
		this.plan=plan;
	}
	Netflix(int id,String plan,int watchingHrs){
		this.id=id;
		this.plan=plan;
		this.watchingHrs=watchingHrs;
	}
	Netflix(String plan,int watchingHrs,int id){
		this.id=id;
		this.plan=plan;
		this.watchingHrs=watchingHrs;
	}
	public static void main(String[] args) 
	{
		Netflix a1=new Netflix(12);
		a1.details();
		Netflix a2=new Netflix(14,"yearly");
		a2.details();
		Netflix a3=new Netflix(15,"Monthly",12);
		a3.details();
		Netflix a4=new Netflix("Annualy",13,16);
		a4.details();
	}
}
