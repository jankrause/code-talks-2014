package de.jankrause.codetalks2014;

import de.jankrause.codetalks2014.entities.Customer;
import de.jankrause.codetalks2014.entities.Order;
import de.jankrause.codetalks2014.exceptions.SystemException;

public interface OrderService {

	/**
	 * Accepts the given order by e-mail. The e-mail is send to the mail-address
	 * of the order's {@link Customer} by using the configured SMTP-Server
	 * 
	 * <h3>Requirements:</h3>
	 * 
	 * <ul>
	 * <li>The SMTP-server is configured in config-file
	 * <b>systems.properties</b>.</li>
	 * <li>The contents of the e-mail are defined in the template
	 * <b>rejection.tpl</b>.</li>
	 * </ul>
	 * 
	 * @param order
	 *            What is rejected. Must not be null and contain a valid
	 *            {@link Customer} with a valid mail-address.
	 * 
	 * @throws SystemException
	 *             If one of the following conditions is met:
	 *             <table>
	 *             <tr>
	 *             <td><b>Code</b></td>
	 *             <td><b>Condition, which causes the exception</b></td>
	 *             </tr>
	 *             <tr>
	 *             <td>01</td>
	 *             <td>If given order is null.</td>
	 *             </tr>
	 *             <tr>
	 *             <td>02</td>
	 *             <td>If the volume providing the template-files is not
	 *             available.</td>
	 *             </tr>
	 *             <tr>
	 *             <td>12</td>
	 *             <td>If the given customer or his or her mail-address is null
	 *             or invalid.</td>
	 *             </tr>
	 *             <tr>
	 *             <td>17</td>
	 *             <td>If the configured SMTP-Server is not available.</td>
	 *             </tr>
	 *             <tr>
	 *             <td>18</td>
	 *             <td>If the template rejection.tpl is not available.</td>
	 *             </tr>
	 *             </table>
	 */
	public void sendOrderAcceptance(Order order) throws SystemException;

}
