package org.crazyit.cloud.contract;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class MyConfig {

	@Bean
	public Contract feignmdddContract() {
		return new MyContract();
	}
}
