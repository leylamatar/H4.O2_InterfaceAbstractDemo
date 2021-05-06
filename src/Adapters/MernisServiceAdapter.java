package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

import MernisService.ICWKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        ICWKPSPublicSoap client = new ICWKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase()
                ,customer.getDateOfBirth().getYear());
    }
}
