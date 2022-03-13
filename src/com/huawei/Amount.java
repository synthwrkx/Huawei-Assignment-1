package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amount
  {
    int amountReq() throws IOException
      {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the amount of loan required : ");
        int amt = Integer.parseInt(br.readLine());
        System.out.println("");
        return amt;
      }
  }