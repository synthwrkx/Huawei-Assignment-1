package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
  {
    public static void main(String[] args) throws IOException
      {
        int n;
        do
          {
            System.out.println("Enter 1 for Federal Bank.");
            System.out.println("Enter 2 for State Bank Of India.");
            System.out.println("Enter 3 for South Indian Bank.");
            System.out.println("Enter 4 for Canara Bank.");

            System.out.print("\nEnter your choice : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ch = Integer.parseInt(br.readLine());

            switch(ch)
              {
                case 1 :
                  System.out.println("\nYou selected Federal Bank.\n");
                  Federal fed = new Federal();
                  n = fed.loanDetail();
                  if(fed.interest==-1)
                    {
                      break;
                    }
                  else
                    {
                      System.out.println("Interest : " + fed.interest + "%");
                      System.out.println("Period of repayment : " + n + " Months");
                    }
                  break;
                case 2 :
                  System.out.println("\nYou selected State Bank Of India.\n");
                  State sta = new State();
                  n = sta.loanDetail();
                  if(sta.interest==-1)
                    {
                      break;
                    }
                  else
                    {
                      System.out.println("Interest : " + sta.interest + "%");
                      System.out.println("Period of repayment : " + n + " Months");
                    }
                  break;
                case 3 :
                  System.out.println("\nYou selected South Indian Bank.\n");
                  South sou = new South();
                  n = sou.loanDetail();
                  if(sou.interest==-1)
                    {
                      break;
                    }
                  else
                    {
                      System.out.println("Interest : " + sou.interest + "%");
                      System.out.println("Period of repayment : " + n + " Months");
                    }
                  break;
                case 4 :
                  System.out.println("\nYou selected Canara Bank.\n");
                  Canara can = new Canara();
                  n = can.loanDetail();
                  if(can.interest==-1)
                    {
                      break;
                    }
                  else
                    {
                      System.out.println("Interest : " + can.interest + "%");
                      System.out.println("Period of repayment : " + n + " Months");
                    }
                  break;
                default :
                  System.out.println("\nInvalid choice.\n");
                  break;
              }

            System.out.print("\nEnter 1 to continue or enter 0 to exit : ");
            int y = Integer.parseInt(br.readLine());
            System.out.println("");
            if(y==0)
              {
                break;
              }
          }while(true);
      }
  }