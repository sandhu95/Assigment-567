
public class Bill {

	// properties of Bill class
	private int billId;
	private String billDate;
	private String billType;
	private double totalBillAmount;

	// constructors
	public Bill(int billId, String billDate, String billType, double totalBillAmount) {
		this.billId = billId;
		this.billDate = billDate;
		this.billType = billType;
		this.totalBillAmount = totalBillAmount;
	}

	// getters and setters of the properties
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public double getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

}
