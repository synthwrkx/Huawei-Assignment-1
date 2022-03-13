package com.huawei;

import java.io.IOException;

public class South extends Amount
  {
    int interest,monthlyAmt;
    float n;
    South()
      {
        monthlyAmt = 4000;
      }
    int loanDetail() throws IOException
      {
        LoanType lt = new LoanType();

        int loan = lt.loanType();
        int amount = amountReq();

        if(loan==1)
          {
            interest = 10;
          }
        else if(loan==2)
          {
            interest = 6;
          }
        else if(loan==3)
          {
            interest = 5;
          }
        else if(loan==4)
          {
            interest = 1;
          }
        else if(loan==-1)
          {
            interest = -1;
          }

        n = (amount * interest) / monthlyAmt;
        return (int)n;
      }
  }