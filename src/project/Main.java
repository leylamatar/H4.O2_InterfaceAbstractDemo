package project;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setFirstName("Leyla");
        customer.setLastName("Matar");
        customer.setId(99);
        customer.setDateOfBirth(LocalDate.of(2001,10,25));
        customer.setNationalityId("999");

        customerManager.Save(customer);


    }
}
