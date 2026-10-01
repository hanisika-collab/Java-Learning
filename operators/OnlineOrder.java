class OnlineOrder 
{
	public static void main(String[] args) 
	{
		int noOfShirts=3;
		int ShirtPrice=800;
		int totalShirtPrice=noOfShirts*ShirtPrice;
		int noOfJeans=2;
		int jeansPrice=1500;
		int totalJeansPrice=noOfJeans*jeansPrice;
		int totalPriceOfCloths=totalShirtPrice+totalJeansPrice;
		double discountAmt=totalPriceOfCloths*0.15;
		double PricetoPay=totalPriceOfCloths-discountAmt;
		double Gst=PricetoPay*0.18;
		double actualPrice=PricetoPay-Gst;
		System.out.println("The Total amount of Shirts: "+totalShirtPrice);
		System.out.println("The Total amount of Jeans: "+totalJeansPrice);
		System.out.println("The Discounted Amount: "+PricetoPay);
		System.out.println("The Actual amount to Pay , After deducting GST: "+actualPrice);
	}
}