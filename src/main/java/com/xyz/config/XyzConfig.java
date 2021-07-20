package com.xyz.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.xyz.service.impl.PaymentServiceImpl;
import com.xyz.service.mock.impl.MockPaymentServiceImpl;

/**
 * 依照env回傳不同的java bean
 * @author jason
 */
@Configuration
public class XyzConfig {

	private final  Logger logger = LoggerFactory.getLogger(XyzConfig.class);

	/**
	 * 回傳Mock Bean
	 * @return MockPaymentServiceImpl
	 */
	@Profile("test")
	@Bean
	public MockPaymentServiceImpl getMockUserAcctBalaceService() {
		logger.info("===MockPaymentService====");
		return new MockPaymentServiceImpl();

	}

	/**
	 * 回傳實際上的Bean
	 * @return PaymentServiceImpl
	 */
	@Profile("dev")
	@Bean
	public PaymentServiceImpl getUserAcctBalaceService() {
		logger.info("===PaymentService====");
		return new PaymentServiceImpl();

	}

}
