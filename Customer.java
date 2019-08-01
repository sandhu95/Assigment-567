import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements IDisplay {
	// creating object of scanner class
	Scanner input = new Scanner(System.in);
	Scanner displayInput = new Scanner(System.in);
	// properties of Customer Class
	private int customerId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String emailId;
	private double totalAmount;
	ArrayList<Bill> bills = new ArrayList<Bill>();

	// constructor
	public Customer(int customerId, String firstName, String lastName, String emailId, double totalAmount,
			ArrayList<Bill> bills) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.emailId = emailId;
		this.totalAmount = totalAmount;
		this.bills = bills;
	}

	// getters and setters
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

	// Methods of Customer class

	// Creating the method to get customer by id
	public void getCustomerById(Customer[] C) {
		System.out.println("Enter the id of Customer you want to search for");
		// getting the id from the user
		int newId = displayInput.nextInt();
		boolean found = true;
		for (int i = 0; i < C.length; i++) {
			if (newId == C[i].customerId) {
				// displaying the info
				System.out.println("The customer found is: " + C[i].fullName);
				found = false;
			}
		}
		// displaying the error
		if (found)
			System.out.println("Sorry, the Id you enetered does not belong to any customer!");
	}

	// defining method of interface
	public void Display(Customer[] CustomerList) {
		System.out.println("Enter Y to display information of all customers or Enter N to exit: ");
		String userInput = input.nextLine();
		if (userInput.equalsIgnoreCase("y")) {
			// calling fucntion to sort the customers according to their id's
			Customer[] C = sortCustomers(CustomerList);

			// running for loop to get to each and every customer in the list
			for (int i = 0; i < C.length; i++) {

				// Calling method to sort bills of a particular customer
				C[i].bills = sortBills(C[i].bills);
				System.out.println("");
				System.out.println("");
				System.out.println("Customer Id: " + C[i].customerId);
				System.out.println("Customer FullName: " + C[i].fullName);
				System.out.println("Customer Email Id: " + C[i].emailId);
				System.out.println("-----Bill information-----");
				try {
					System.out.println(
							"****************************************************************************************");

					// running for loop to get all the bills of each customer
					for (int j = 0; j < C[i].bills.size(); j++) {
						System.out.println("");
						System.out.println("Bill Id: " + C[i].bills.get(j).getBillId());
						System.out.println("Bill Date: " + C[i].bills.get(j).getBillDate());
						System.out.println("Bill Type: " + C[i].bills.get(j).getBillType());
						System.out.println("Bill Amount: $" + C[i].bills.get(j).getTotalBillAmount());

						// handling cases related to particular type of child classes of bill by object
						// casting
						if (C[i].bills.get(j).getBillType() == "Hydro") {
							Hydro h = (Hydro) C[i].bills.get(j);
							System.out.println("Company Name: " + h.getAgencyName());
							System.out.println("Unit Consumed: " + h.getUnitConsumed());
						}
						if (C[i].bills.get(j).getBillType() == "Internet") {
							Internet it = (Internet) C[i].bills.get(j);
							System.out.println("Provider Name: " + it.getProviderName());
							System.out.println("Internet Usage: " + it.getGbUsed());
						}

						if (C[i].bills.get(j).getBillType() == "Mobile") {
							Mobile m = (Mobile) C[i].bills.get(j);
							System.out.println("Manufacturer Name: " + m.getMobileManufacturerName());
							System.out.println("Plan Name: " + m.getPlanName());
							System.out.println("Mobile Number: " + m.getMobileNumber());
							System.out.println("Internet Usage: " + m.getInternetGbUsed());
							System.out.println("Minutes Usage: " + m.getMinutesUsed());
						}
					}

					double totalBill = 0.0;
					int k = 0;
					// getting the sum of the bills
					while (k < C[i].bills.size()) {
						totalBill += C[i].bills.get(k).getTotalBillAmount();
						k++;
					}

					if (C[i].bills.size() > 0) {
						System.out.println(
								"****************************************************************************************");
						System.out.println("Total Bill Amount to Pay: $" + totalBill);
						System.out.println(
								"****************************************************************************************");
					} else
						System.out.println(C[i].fullName + " has no more bills to pay!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else if (userInput.equalsIgnoreCase("n"))
			System.out.println("Thanks");
		else {
			System.out.println("Please enter the correct value!");

		}

	}

	public Customer[] sortCustomers(Customer[] unsortedCustomerList) {
		int tempId = 0;
		for (int j = 0; j < unsortedCustomerList.length; j++) {

			for (int i = 0; i < unsortedCustomerList.length - 1; i++) {
				if (unsortedCustomerList[i + 1].getCustomerId() < unsortedCustomerList[i].getCustomerId()) {
					tempId = unsortedCustomerList[i].getCustomerId();
					unsortedCustomerList[i].setCustomerId(unsortedCustomerList[i + 1].getCustomerId());
					unsortedCustomerList[i + 1].setCustomerId(tempId);
				}
			}
		}
		return unsortedCustomerList;
	}

	public ArrayList<Bill> sortBills(ArrayList<Bill> List) {
		for (int j = 0; j < List.size(); j++) {
			int tempBillId = 0;
			for (int i = 0; i < List.size() - 1; i++) {
				if (List.get(i + 1).getBillId() < List.get(i).getBillId()) {
					tempBillId = List.get(i).getBillId();
					List.get(i).setBillId(List.get(i + 1).getBillId());
					List.get(i + 1).setBillId(tempBillId);
				}
			}
		}
		return List;

	}

}
