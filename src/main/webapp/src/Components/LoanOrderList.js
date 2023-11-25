import React, { useState, useEffect } from "react";
import axios  from "axios";

function LoanOrderList() {
  const [loanOrders, setLoanOrders] = useState([]);

  useEffect(() => {
    axios.get("/loanOrder")
  .then(response => {
        setLoanOrders(response.data);
      })
      .catch(error => console.log(error));
  }, []);

  return (
      <div>
        <h1>Loan Orders</h1>
        <ul>
          {
            loanOrders.map(loanOrder => (
                <li key={loanOrder.id}>
                  Id: {loanOrder.id} <br/>
                  Summ: {loanOrder.summ} <br/>
                  Name: {loanOrder.columnName} <br/>
                  hasJob: {loanOrder.hasJob} <br/>
                  interestRate: {loanOrder.interestRate} <br/>
                  loanDate: {loanOrder.loanDate} <br/>
                  salary: {loanOrder.salary} <br/>
                  statusId: {loanOrder.statusId} <br/>
                  termMonths: {loanOrder.termMonths} <br/>
                  UserId: {loanOrder.userId}
                </li>
            ))
          }
        </ul>
      </div>
  );
}

export default LoanOrderList;
