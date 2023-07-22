package com.dev.company.yext;

import java.io.*;
import java.util.*;

class CurrencyToPhraseConverter {
    private static final String[] UNITS = { "","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
    private static final String[] TENS = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
  
    
    public static String convertCurrency(String numStr) {
    // TODO: Implement this method and any helper methods you would like
    int dollars=0;
    int cents=0;
    String digits = numStr.substring(1);
    if(numStr.contains(".")){
    String[] dollarvalue = digits.split("\\.");
      dollars = Integer.parseInt(dollarvalue[0]);
      cents = Integer.parseInt(dollarvalue[1]);
    }else{
      dollars = Integer.parseInt(digits);
    }
    String dollarsPhrase = covertToEnglishPhrase(dollars);
    String centsPhrase = covertToEnglishPhrase(cents);

    String englishPhrase = dollarsPhrase + "dollars and "+ centsPhrase + "cents";
    return englishPhrase.trim();
  }
  public static String covertToEnglishPhrase(int num){
    if(num == 0){
      return "";
    }else if(num < 20){
      return UNITS[num] + " ";
    }else if(num < 100){
      int tens = num/10;
      int units = num%10;
      return TENS[tens]+ " "+covertToEnglishPhrase(units);
    }else{
      int hundreds = num/100;
      int remainder = num%100;
      return UNITS[hundreds]+ " hundred "+covertToEnglishPhrase(remainder);
    }

  }
  
  public static void main(String[] args) {
    // Do not modify the test cases
    System.out.println(new TestCase("$4", "four dollars").validate());
    System.out.println(new TestCase("$0", "zero dollars").validate());
    System.out.println(new TestCase("$1", "one dollar").validate());
    System.out.println(new TestCase("$4", "four dollars").validate());
    System.out.println(new TestCase("$12.01", "twelve dollars and one cent").validate());
    System.out.println(new TestCase("$30", "thirty dollars").validate());
    System.out.println(new TestCase("$71", "seventy one dollars").validate());
    System.out.println(new TestCase("$56", "fifty six dollars").validate());
    System.out.println(new TestCase("$90.00", "ninety dollars").validate());
    System.out.println(new TestCase("$100", "one hundred dollars").validate());
    System.out.println(new TestCase("$217.84", "two hundred seventeen dollars and eighty four cents").validate());
    System.out.println(new TestCase("$320", "three hundred twenty dollars").validate());
    System.out.println(new TestCase("$350.21", "three hundred fifty dollars and twenty one cents").validate());
    System.out.println(new TestCase("$701.82", "seven hundred one dollars and eighty two cents").validate());
  }
  
  static class TestCase {
    String numStr;
    String expectedString;
    
    TestCase(String numStr, String expectedString) {
      this.numStr = numStr;
      this.expectedString = expectedString;
    }
    
    public String validate() {
      String result = CurrencyToPhraseConverter.convertCurrency(numStr);
      return expectedString.equals(result)
        ? "SUCCESS"
        : String.format("FAILED:\n  Expected: %s\n  Actual:   %s", expectedString, result);
    }
  }
}
