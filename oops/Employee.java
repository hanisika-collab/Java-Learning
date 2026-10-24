class Employee 
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
	
	Employee(int id,String name,double salary,String role){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.role=role;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,"smith",200000,"Tester");
		e1.details();
		Employee e2=new Employee(102,"Leo",300000,"QA Tester");
		e2.details();
		Employee e3=new Employee(103,"Harry",300000,"Automation Tester");
		e3.details();
		
	}
}
