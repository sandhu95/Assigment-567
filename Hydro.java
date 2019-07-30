
public class Hydro extends Bill{
	
	//properties of Hydro class
	private String agencyName;
	private int unitConsumed;
	
	
	//constructor
	public Hydro(String agencyName, int unitConsumed, int billId, String billDate, String billType, double totalBillAmount) {
		super(billId, billDate, billType, totalBillAmount);
		this.agencyName = agencyName;
		this.unitConsumed = unitConsumed;
	}


	//getters and setters
	public String getAgencyName() {
		return agencyName;
	}


	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}


	public int getUnitConsumed() {
		return unitConsumed;
	}


	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}
	
	
	

}
