import java.util.Scanner;
public class InvoiceApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String response;
		double price;
		int i=0;
		double []taxablelist= new double[10];
		double []untaxablelist = new double [10];
		double taxsum =0,untaxsum=0;
		//InvoiceClass ic =new InvoiceClass();
		System.out.println("Do you have precious items");
		response = sc.next();
		if(response.equalsIgnoreCase("yes"))
		{
			   do
			   {
			
				System.out.println("Enter the item price");
				price=sc.nextDouble();
				taxablelist[i]=price;
				System.out.println("Do you have another precious item");
				response = sc.next();
				taxsum+=taxablelist[i];
				i++;
			   }while(response.equalsIgnoreCase("yes"));
			
		}
		
		System.out.println("Do you have non precious items");
		response = sc.next();
		if(response.equalsIgnoreCase("yes"))
		{
			   do
			   {
			
				System.out.println("Enter the item price");
				price=sc.nextDouble();
				untaxablelist[i]=price;
				System.out.println("Do you have another non-precious item");
				response = sc.next();
				untaxsum+=untaxablelist[i];
				i++;
			   }while(response.equalsIgnoreCase("yes"));
			
		}
		InvoiceClass ic =new InvoiceClass(taxsum,untaxsum);
		double sumuntax =ic.getPriceUntax();
		double sumtax=ic.getPriceTax();
	
		System.out.println(sumtax+" "+sumuntax);
     
	}
	

}
