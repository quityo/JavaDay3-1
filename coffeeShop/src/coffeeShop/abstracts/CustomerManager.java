package coffeeShop.abstracts;

import coffeeShop.entities.Customer;

public abstract class CustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Peace n Love");
	}
}
