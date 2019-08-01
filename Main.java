import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// creating object of scanner class
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// creating three objects of Internet class
		Internet I1 = new Internet("Rogers", 100.5f, 3, "4 july, 2019", "Internet", 114);
		Internet I2 = new Internet("Freedom", 90.5f, 3, "5 september, 2019", "Internet", 99.0);
		Internet I3 = new Internet("Chatr", 132.5f, 3, "5 august, 2019", "Internet", 150.6);

		// creating two objects of Hydro class
		Hydro H1 = new Hydro("HydroOne", 155, 2, "1 September,2019", "Hydro", 300.5);
		Hydro H2 = new Hydro("HydroLit", 200, 2, "5 September,2019", "Hydro", 386.5);

		// creating one object of Mobile class
		Mobile M1 = new Mobile("Nokia", "onePlus", 7054654656L, 100.5f, 155.0f, 1, "5 february, 2019", "Mobile", 100.0);

		// creating four array Lists and adding bills to them
		ArrayList<Bill> B1 = new ArrayList<Bill>();
		B1.add(I1);
		B1.add(H1);

		ArrayList<Bill> B2 = new ArrayList<Bill>();
		B2.add(I2);
		B2.add(H2);
		B2.add(M1);

		ArrayList<Bill> B3 = new ArrayList<Bill>();
		B3.add(I3);
		// creating empty array list for a customer with no bills
		ArrayList<Bill> B4 = new ArrayList<Bill>();

		// creating three customers
		Customer C1 = new Customer(13, "Zina", "Tenser", "TenserZina@gamil.com", 414.5, B1);
		Customer C2 = new Customer(12, "Neema", "Viewr", "Neema@yahoo.com", 585.5, B2);
		Customer C3 = new Customer(11, "Helen", "Olsu", "OlsuHelen7@hotmail.com", 414.5, B3);
		Customer C4 = new Customer(14, "Nisha", "Palekar", "Palekar1995@orkut.com", 0.0, B4);

		// creating customer array
		Customer customers[] = new Customer[4];

		// adding customers to newly created "customers" array
		customers[0] = C1;
		customers[1] = C2;
		customers[2] = C3;
		customers[3] = C4;

		// calling the finding customer function from customer id
		C1.getCustomerById(customers);

		// calling fucntion to display the whole data of customers
		C1.Display(customers);

	}

}