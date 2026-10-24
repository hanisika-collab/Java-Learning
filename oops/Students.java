class Students 
{
	int id;
	String name;
	int age;
	public void details(){
		System.out.println("id is : "+id);
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("-----------------------");
	}
	Students(int id){
		this.id=id;
	}
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
	Students(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Students(String name,int id,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) 
	{
		Students s1=new Students(101);
		s1.details();
		Students s2=new Students(325,"shakila");
		s2.details();
		Students s3=new Students(57,"laila",24);
		s3.details();
		Students s4=new Students("hani",234,21);
		s4.details();
		
	}
}
