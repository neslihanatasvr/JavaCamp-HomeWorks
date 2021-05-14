package Adapters;

import java.rmi.RemoteException;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result;
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
        try { 
            result = kpsPublicSoapProxy.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getDateOfBirths().getYear()); 
        }
        catch (RemoteException e) { 
            result = false; 
            e.printStackTrace(); 
        }

        return result;
		
	}
	
	

}
