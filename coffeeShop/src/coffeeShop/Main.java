package coffeeShop;

import java.time.LocalDate;
import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.concretes.StarbucksCustomerManager;
import coffeeShop.abstracts.CustomerManager;
import coffeeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setDateOfBirth(LocalDate.of(1923, 4, 23));
		customer.setFirstName("Fu");
		customer.setLastName("Fu");
		customer.setNationalityIdentity("23041923");
		customer.setId(1);
		customerManager.save(customer);

	}

}