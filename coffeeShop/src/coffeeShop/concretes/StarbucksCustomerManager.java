package coffeeShop.concretes;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.abstracts.CustomerManager;
import coffeeShop.entities.Customer;

public class StarbucksCustomerManager extends CustomerManager{

private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			this.save(customer);
		} else {
			System.out.println("Not a valid person");
		}

	}
}