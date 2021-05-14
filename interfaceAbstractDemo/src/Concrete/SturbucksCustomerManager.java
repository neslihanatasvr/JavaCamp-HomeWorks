package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager  extends BaseCustomerManager {

	
	private CustomerCheckService customerCheckService;

	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	


	@Override
		public void save(Customer customer)throws Exception{
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
			}else {
				System.out.println("Not a valid person"); 
			}
	
	}

	
		
	}


