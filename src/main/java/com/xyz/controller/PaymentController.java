package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.service.PaymentService;

/**
 * @author jason
 *
 */
@RestController
public class PaymentController {
	
	
	@Autowired
	PaymentService paymentService;
	
	/**
	 * @param account 
	 * @return String
	 * @throws Exception 
	 */
	@GetMapping("/pay/{account}")
	public String pay(@PathVariable("account") String account) throws Exception {
		return paymentService.callHncbPay(account, 35000);
	}

}
