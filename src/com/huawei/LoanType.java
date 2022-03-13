package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoanType
  {
    int loanType() throws IOException
      {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1 for personal loan.");
        System.out.println("Enter 2 for housing loan.");
        System.out.println("Enter 3 for educational loan.");
        System.out.println("Enter 4 for gold loan.");

        System.out.print("\nEnter your loan type : ");
        int ch = Integer.parseInt(br.readLine());
        int loan;

        switch(ch)
          {
            case 1 :
              System.out.println("\nYou selected personal loan.\n");
              loan = 1;
              break;
            case 2 :
              System.out.println("\nYou selected housing loan.\n");
              loan = 2;
              break;
            case 3 :
              System.out.println("\nYou selected educational loan.\n");
              loan = 3;
              break;
            case 4 :
              System.out.println("\nYou selected gold loan.\n");
              loan = 4;
              break;
            default :
              System.out.println("\nInvalid choice.\n");
              loan = -1;
              break;
          }

        return loan;
      }
  }