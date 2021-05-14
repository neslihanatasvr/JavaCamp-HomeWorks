

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main  {
	
public static void main(String[] args)throws Exception {
	
	BaseCustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(new Customer(1, "Neslihan", "Atasever", LocalDate.of(2000,01,15), "12345678915"));
		
	
	}
	 
	

}
