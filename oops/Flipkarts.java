class Flipkarts
{
	long phno;
	int noOfOrders;
	int noOfCartProducts;
	int noOfWhishlistProducts;
	public void details(){
		System.out.println("Phone number is : "+phno);
		System.out.println("Number or orders : "+noOfOrders);
		System.out.println("Number of Cart Products: "+noOfCartProducts);
		System.out.println("Number of Whishlist Products: "+noOfWhishlistProducts);
		System.out.println("-----------------------");
	}
	Flipkarts(long phno){
		this.phno=phno;
	}
	Flipkarts(long phno,int noOfOrders,int noOfCartProducts){
		this.phno=phno;
		this.noOfOrders=noOfOrders;
		this.noOfCartProducts=noOfCartProducts;
	}
	
	Flipkarts(long phno,int noOfOrders,int noOfCartProducts,int noOfWhishlistProducts){
		this.phno=phno;
		this.noOfOrders=noOfOrders;
		this.noOfCartProducts=noOfCartProducts;
		this.noOfWhishlistProducts=noOfWhishlistProducts;
	}
	Flipkarts(int noOfOrders,long phno,int noOfCartProducts,int noOfWhishlistProducts){
		this.phno=phno;
		this.noOfOrders=noOfOrders;
		this.noOfCartProducts=noOfCartProducts;
		this.noOfWhishlistProducts=noOfWhishlistProducts;
	}
	public static void main(String[] args) 
	{
		Flipkarts p1=new Flipkarts(7538849594L);
		p1.details();
		Flipkarts p2=new Flipkarts(7538849394L,5,5);
		p2.details();
		Flipkarts p3=new Flipkarts(8538849594L,1,10,80);
		p3.details();	
		Flipkarts p4=new Flipkarts(1,8538849594L,10,80);
		p4.details();
		
	}
}
