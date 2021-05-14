package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	public void save(Customer customer) throws Exception {
		
		System.out.println("Saved to db :" + customer.getFirstName() );
	}

}
