class Flipkart 
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
	
	Flipkart(long phno,int noOfOrders,int noOfCartProducts,int noOfWhishlistProducts){
		this.phno=phno;
		this.noOfOrders=noOfOrders;
		this.noOfCartProducts=noOfCartProducts;
		this.noOfWhishlistProducts=noOfWhishlistProducts;
	}
	public static void main(String[] args) 
	{
		Flipkart p1=new Flipkart(7538849594L,2,10,20);
		p1.details();
		Flipkart p2=new Flipkart(7538849394L,5,5,70);
		p2.details();
		Flipkart p3=new Flipkart(8538849594L,1,10,80);
		p3.details();
		
	}
}
