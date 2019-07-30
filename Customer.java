import java.util.ArrayList;

public class Customer {
	//properties of Customer Class
	private int customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private double totalAmount;
	ArrayList<Bill> bills = new ArrayList<Bill>();
	
	
	//constructor
	public Customer(int customerId, String firstName, String lastName, String emailId, double totalAmount, ArrayList<Bill> bills) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.totalAmount = totalAmount;
		this.bills = bills;
	}


	//getters and setters
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public ArrayList<Bill> getBills() {
		return bills;
	}


	public void setBills(ArrayList<Bill> bills) {
		this.bills = bills;
	}
	
}
