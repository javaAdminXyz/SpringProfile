package com.xyz.service.impl;

import com.xyz.service.PaymentService;

/**
 * @author jason
 *
 */
public class PaymentServiceImpl implements PaymentService {

	@Override
	public String callHncbPay(String account, int amount) throws NullPointerException{
		return "real";
	}

}
