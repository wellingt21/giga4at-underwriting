package org.demo.contoroller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.demo.entity.LoanOrder;
import org.demo.repository.LoanOrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loanOrder")
@RequiredArgsConstructor
public class LoanOrderController {

	private final LoanOrderRepository loanOrderRepository;

	@GetMapping
	public List<LoanOrder> getAllLoanOrder() {
		return loanOrderRepository.findAll();
	}
}
