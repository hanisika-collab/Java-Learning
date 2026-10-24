class Flipkarts1
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
	Flipkarts1(long phno){
		this.phno=phno;
	}
	Flipkarts1(long phno,int noOfOrders,int noOfCartProducts){
		this(phno);
		this.noOfOrders=noOfOrders;
		this.noOfCartProducts=noOfCartProducts;
	}
	
	Flipkarts1(long phno,int noOfOrders,int noOfCartProducts,int noOfWhishlistProducts){
		this(phno,noOfOrders,noOfCartProducts);
		this.noOfWhishlistProducts=noOfWhishlistProducts;
	}
	Flipkarts1(int noOfOrders,long phno,int noOfCartProducts,int noOfWhishlistProducts){
		this(phno,noOfOrders,noOfCartProducts,noOfWhishlistProducts);
	}
	public static void main(String[] args) 
	{			
		Flipkarts1 p=new Flipkarts1(1,8538849594L,10,80);
		p.details();
		
	}
}
