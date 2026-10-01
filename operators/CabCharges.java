class CabCharges 
{
	public static void main(String[] args) 
	{
		int BaseFare=50,PricePerKilometer=20;
		double customerTravels=10;
		double TravelCost=customerTravels*PricePerKilometer;
		
		double totalFare=TravelCost+BaseFare;
		System.out.println("Total fare is "+totalFare);
	}
}
