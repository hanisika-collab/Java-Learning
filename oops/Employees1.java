class Employees1
{
	int id;
	String name;
	double salary;
	String role;
	public void details(){
		System.out.println("id is : "+id);
		System.out.println("name is: "+name);
		System.out.println("Salary is: "+salary);
		System.out.println("Role is: "+role);
		System.out.println("-----------------------");
	}
	Employees1(int id){
		this.id=id;
	}
	Employees1(int id,String name){
		this(id);
		this.name=name;
	}
	Employees1(int id,String name,String role){
		this(id,name);
		this.role=role;
	}
	Employees1(int id,String name,double salary,String role){
		this(id,name);
		this.salary=salary;
		this.role=role;
	}
	Employees1(String name,int id,String role,double salary){
		this(id,name,salary,role);
	}
	public static void main(String[] args) 
	{
		
		Employees1 e=new Employees1("hani",105,"Manual tester",2500000);
		e.details();
	}
}
