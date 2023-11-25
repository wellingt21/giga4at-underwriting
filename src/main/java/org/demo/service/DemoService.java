package org.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.demo.entity.LoanOrder;
import org.demo.repository.LoanOrderRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoService {

	private final LoanOrderRepository loanOrderRepository;

	public DemoService(LoanOrderRepository loanOrderRepository) {
		this.loanOrderRepository = loanOrderRepository;
	}

	public String hello() {
		return "Hello world!";
	}

	public void showLoanOrder() {
		log.info("showLoanOrder");
		LoanOrder loan = loanOrderRepository.findByUserId(1).orElse(null);
		log.info(String.valueOf(loan));
	}
}
