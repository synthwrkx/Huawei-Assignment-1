package com.huawei;

import java.io.IOException;

public class Canara
  {
    int interest,monthlyAmt;
    float n;
    Canara()
      {
        monthlyAmt = 7000;
      }
    int loanDetail() throws IOException
      {
        LoanType lt = new LoanType();
        Amount amt = new Amount();

        int loan = lt.loanType();
        int amount = amt.amountReq();

        if(loan==1)
          {
            interest = 6;
          }
        else if(loan==2)
          {
            interest = 5;
          }
        else if(loan==3)
          {
            interest = 4;
          }
        else if(loan==4)
          {
            interest = 2;
          }
        else if(loan==-1)
          {
            interest = -1;
          }

        n = (amount * interest) / monthlyAmt;
        return (int)n;
      }
  }