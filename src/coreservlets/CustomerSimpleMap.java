package coreservlets;

import java.util.*;

/** A small table of banking customers for testing. */

public class CustomerSimpleMap 
       implements CustomerLookupService {
  private Map<String,Customer> customers;

  public CustomerSimpleMap() {
    customers = new HashMap<>();
    addCustomer(new Customer("id001", "Harry", 
                             "Hacker", -3456.78));
    addCustomer(new Customer("id002", "Codie",
                             "Coder", 1234.56));
    addCustomer(new Customer("yogagrmy99", "Yoga",
                             "Student", 100));
  }

  /** Finds the customer with the given ID.
   *  Returns null if there is no match.
   */
  
  @Override
  public Customer findCustomer(String id) {
    if (id!=null) {
      return(customers.get(id.toLowerCase()));
    } else {
      return(null);
    }
  }

  private void addCustomer(Customer customer) {
    customers.put(customer.getId(), customer);
  }
}
