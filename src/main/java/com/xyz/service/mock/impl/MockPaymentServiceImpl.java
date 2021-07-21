package com.xyz.service.mock.impl;

import com.xyz.service.PaymentService;

/**
 * @author jason
 *
 */
public class MockPaymentServiceImpl implements PaymentService {

	@Override
	public String callHncbPay(String account, int amount) throws NullPointerException{
		
		if("0001".equals(account)) {
			return "Mock";
		}else if("0056".equals(account)) {
			throw new NullPointerException();
		}else {
			return "Mock3";
		}
	}

}
