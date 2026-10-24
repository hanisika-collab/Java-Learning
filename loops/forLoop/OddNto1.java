import java.util.Scanner;
class OddNto1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		    for(int start=n;start>=1; start-- ){
				if(start%2==1){
				   System.out.println(start);	
				}
				
		    }
		        
	}
}
