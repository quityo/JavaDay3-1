package coffeeShop.adapters;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		  try {
	            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityIdentity()),
	                    customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
	                    customer.getDateOfBirth().getYear());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return false;
	}

}
