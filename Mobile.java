
public class Mobile extends Bill{
	
	//properties of Mobile class
	private String mobileManufacturerName;
	private String planName;
	private int mobileNumber;
	private float internetGbUsed;
	private float minutesUsed;
	
	
	//constructor
	public Mobile(String mobileManufacturerName, String planName, int mobileNumber, float internetGbUsed, float minutesUsed, int billId, String billDate, String billType, double totalBillAmount) {
		super(billId, billDate, billType, totalBillAmount);
		this.mobileManufacturerName= mobileManufacturerName;
		this.planName= planName;
		this.mobileNumber= mobileNumber;
		this.internetGbUsed= internetGbUsed;
		this.minutesUsed= minutesUsed;
	}


	//getters and setters
	public String getMobileManufacturerName() {
		return mobileManufacturerName;
	}


	public void setMobileManufacturerName(String mobileManufacturerName) {
		this.mobileManufacturerName = mobileManufacturerName;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public float getInternetGbUsed() {
		return internetGbUsed;
	}


	public void setInternetGbUsed(float internetGbUsed) {
		this.internetGbUsed = internetGbUsed;
	}


	public float getMinutesUsed() {
		return minutesUsed;
	}


	public void setMinutesUsed(float minutesUsed) {
		this.minutesUsed = minutesUsed;
	}
	
	

}
