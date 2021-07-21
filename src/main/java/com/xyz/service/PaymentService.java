package com.xyz.service;

/**
 * @author jason
 *
 */
public interface PaymentService {
	
	
	/**
	 * @param account
	 * @param amount
	 * @return String
	 * @throws NullPointerException 
	 */
	public String callHncbPay(String account ,int amount) throws NullPointerException;

}
