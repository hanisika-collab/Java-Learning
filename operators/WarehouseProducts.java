class WarehouseProducts 
{
	public static void main(String[] args) 
	{
		int noOfProducts=1275;
		int EachBoxHold=24;
		double FilledBoxes=noOfProducts/EachBoxHold;
		double LeftOverBoxes=noOfProducts%EachBoxHold;
		System.out.println("The FilledBoxes are: "+FilledBoxes);
        System.out.println("The LeftOverBoxes are: "+LeftOverBoxes);
	}
}
