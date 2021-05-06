package coffeeShop.abstracts;

import coffeeShop.entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
