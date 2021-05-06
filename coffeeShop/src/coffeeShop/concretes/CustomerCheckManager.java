package coffeeShop.concretes;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
