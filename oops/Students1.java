class Students1
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
	Students1(int id){
		this.id=id;
	}
	Students1(int id,String name){
		this(id);
		this.name=name;
	}
	Students1(int id,String name,int age){
		this(id,name);
		this.age=age;
	}
	Students1(String name,int id,int age){
		this(id,name,age);
	}
	public static void main(String[] args) 
	{
		Students1 s=new Students1("hani",234,21);
		s.details();
	}
}
