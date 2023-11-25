package org.demo.repository;

import java.util.Optional;
import org.demo.entity.LoanOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanOrderRepository extends JpaRepository<LoanOrder, Integer> {
	Optional<LoanOrder> findById(Integer id);
	Optional<LoanOrder> findByUserId(Integer userId);
}