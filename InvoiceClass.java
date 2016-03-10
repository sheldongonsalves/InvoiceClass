
public class InvoiceClass {

	private double priceTaxable ,priceUntax;
	public InvoiceClass()
	{
		
	}
	
	public InvoiceClass(double price1 ,double price2) {
		price1 = price1 +(0.09 *price1);
		priceTaxable =price1;
		priceUntax = price2;
		
	}
	
	public void setPriceTax(double value)
	{
		this.priceTaxable =value;
	}
	public double getPriceTax()
	{
		return priceTaxable;
		
	}
	public void setPriceUntax(double value)
	{
		this.priceUntax =value;
	}
	public double getPriceUntax()
	{
		return priceUntax;
		
	}
	
	

}
