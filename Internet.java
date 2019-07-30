
public class Internet extends Bill
{

	private String providerName;
	private float gbUsed;
	
	//constructors of Internet Class
	public Internet(String providerName, float gbUsed,int billId, String billDate, String billType, double totalBillAmount)
	{
		super(billId, billDate, billType, totalBillAmount);
		this.providerName = providerName;
		this.gbUsed = gbUsed;
	}
	
	
	
	//getters and setters
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public float getGbUsed() {
		return gbUsed;
	}

	public void setGbUsed(float gbUsed) {
		this.gbUsed = gbUsed;
	}
	
		
}
	


