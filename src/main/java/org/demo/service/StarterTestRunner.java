package org.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.repository.LoanOrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class StarterTestRunner implements CommandLineRunner {
	private final LoanOrderRepository loanOrderRepository;

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello world!");
		loanOrderRepository.findAll().forEach(loanOrder -> log.info(String.valueOf(loanOrder)));
	}
}
