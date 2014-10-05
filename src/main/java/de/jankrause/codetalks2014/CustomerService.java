package de.jankrause.codetalks2014;

import java.util.List;

import de.jankrause.codetalks2014.entities.Customer;
import de.jankrause.codetalks2014.entities.Order;
import de.jankrause.codetalks2014.exceptions.BooksellerException;
import de.jankrause.codetalks2014.exceptions.SystemNotAvailableException;

/**
 * |   |   |   |   |   |
 * |---|---|---|---|---|
 * |   |   |   |   |   |
 * |   |   |   |   |   |
 * |   |   |   |   |   |
 */
public interface CustomerService {

	public List<Customer> findCustomersByName(String lastname)
			throws SystemNotAvailableException;

	public Customer findCustomerById(int id) throws SystemNotAvailableException;

	public int createCustomer(Customer newCustomer)
			throws SystemNotAvailableException;

	public double computeCustomersDiscount(Customer customer);
	
	/**
	 * Rejects the given order by e-mail. The e-mail is send to the mail-address of the order's 
	 * {@link Customer} by using the configured SMTP-Server  
	 * 
	 * **Requirements:**
	 * 
	 * * The SMTP-server is configured in config-file **systems.properties**. 
	 * * The contents of the e-mail are defined in the template **rejection.tpl**. 
	 * 
	 * @param order What is rejected. Must not be null and contain a valid {@link Customer}  
	 * 	with a valid mail-address.
	 * 
	 * @throws BooksellerException If one of the following conditions is met:
	 * 
	 * | Code | Condition, which causes the exception                                | 
	 * | -----| ---------------------------------------------------------------------| 
     * | 01   | If given order is null.                                              |
     * | 02   | If the volume providing the template-files is not available.         |
     * | 12   | If the given customer or his or her mail-address is null or invalid. |
     * | 17   | If the configured SMTP-Server is not available.                      |
     * | 18   | If the template rejection.tpl is not available.                      |  
	 */
	public void sendOrderRejection(Order order) throws BooksellerException;
	
}