class Mobiles
{
	String brand;
	double price;
	String RAM;
	String ROM;
	String battery;
	public void details(){
		System.out.println("Brand name is: "+brand);
		System.out.println("price  is: "+price);
		System.out.println("RAM is: "+RAM);
		System.out.println("ROM is: "+ROM);
		System.out.println("battery is: "+battery);
		System.out.println("-----------------------");
	}
	Mobiles(String brand){
		this.brand=brand;
	}
	Mobiles(String brand,double price,String RAM){
		this.brand=brand;
		this.price=price;
		this.RAM=RAM;
	}
	Mobiles(String ROM,String battery,double price){
		this.ROM=ROM;
		this.battery=battery;
		this.price=price;
	}
	Mobiles(String brand,double price,
	String RAM,
	String ROM,
	String battery){
		this.brand=brand;
		this.price=price;
		this.RAM=RAM;
		this.ROM=ROM;
		this.battery=battery;
	}
	Mobiles(double price,
	String RAM,
	String ROM,
	String battery,String brand){
		this.brand=brand;
		this.price=price;
		this.RAM=RAM;
		this.ROM=ROM;
		this.battery=battery;
	}
	public static void main(String[] args) 
	{
		Mobiles m1=new Mobiles("vivo y27");
		m1.details();
		Mobiles m2=new Mobiles("vivo y300",29000,"16GB","512GB","5600mAh");
		m2.details();
		Mobiles m3=new Mobiles("vivo y80",300000,"16gb");
		m3.details();
		Mobiles m4=new Mobiles("512GB","5600mAh",700000);
		m4.details();
		Mobiles m5=new Mobiles(29000,"16GB","512GB","5600mAh","vivo y300");
		m5.details();
	}
}
