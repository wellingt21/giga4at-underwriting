package org.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Objects;
import java.util.StringJoiner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loan_order")
public class LoanOrder {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "summ")
	private Double summ;

	@Column(name = "salary")
	private Double salary;

	@Column(name = "term_months")
	private Integer termMonths;

	@Column(name = "interest_rate")
	private Double interestRate;

	@Column(name = "has_job")
	private Byte hasJob;

	@Column(name = "status_id")
	private Integer statusId;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "loan_date")
	private Date loanDate;

	@Column(name = "column_name")
	private Integer columnName;


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		LoanOrder loanOrder = (LoanOrder) o;

		if (!Objects.equals(id, loanOrder.id)) {
			return false;
		}
		if (!Objects.equals(summ, loanOrder.summ)) {
			return false;
		}
		if (!Objects.equals(salary, loanOrder.salary)) {
			return false;
		}
		if (!Objects.equals(termMonths, loanOrder.termMonths)) {
			return false;
		}
		if (!Objects.equals(interestRate, loanOrder.interestRate)) {
			return false;
		}
		if (!Objects.equals(hasJob, loanOrder.hasJob)) {
			return false;
		}
		if (!Objects.equals(statusId, loanOrder.statusId)) {
			return false;
		}
		if (!Objects.equals(userId, loanOrder.userId)) {
			return false;
		}
		if (!Objects.equals(loanDate, loanOrder.loanDate)) {
			return false;
		}
		return Objects.equals(columnName, loanOrder.columnName);
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (summ != null ? summ.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		result = 31 * result + (termMonths != null ? termMonths.hashCode() : 0);
		result = 31 * result + (interestRate != null ? interestRate.hashCode() : 0);
		result = 31 * result + (hasJob != null ? hasJob.hashCode() : 0);
		result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (loanDate != null ? loanDate.hashCode() : 0);
		result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", LoanOrder.class.getSimpleName() + "[", "]")
			.add("id=" + id)
			.add("summ=" + summ)
			.add("salary=" + salary)
			.add("termMonths=" + termMonths)
			.add("interestRate=" + interestRate)
			.add("hasJob=" + hasJob)
			.add("statusId=" + statusId)
			.add("userId=" + userId)
			.add("loanDate=" + loanDate)
			.add("columnName=" + columnName)
			.toString();
	}
}
