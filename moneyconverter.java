package currencyconverter;

import java.util.Scanner;

public class Currencyconverter {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Choose one of the following option: ");
      System.out.println("1)USD to EUR");
      System.out.println("2)EUR to USD");
      System.out.println("3)USD to BDT");
      System.out.println("4)BDT to USD");
      System.out.println("5)USD to INR");
      System.out.println("6)INR to USD");
      System.out.println("7)EUR to BDT");
      System.out.println("8)EUR to INR");
      System.out.println("9)BDT to EUR");
      System.out.println("10)INR to EUR");
      System.out.println("11)USD to USD");
      System.out.println("12)EUR to EUR");
      System.out.println("13)BDT to BDT");
      System.out.println("14)INR to INR");

      
      
      int conv = sc.nextInt();
      switch(conv){
          
          case 1:{
              System.out.println("Enter the Amount of USD ");
          double usd = sc.nextDouble();
          if (usd>0){
              System.out.println(usd + "USD is "+ usd * 0.86 + " EURO" );
          }
          else {
              System.out.println("Please input Positive amount of usd");
          }
      }
       break;
      
      case 2:{
              System.out.println("Enter the Amount of Euro");
          double euro = sc.nextDouble();
          if (euro>0){
              System.out.println(euro + "EURO is "+ euro * 1.16 + " USD ");
          }
          else {
              System.out.println("Please input Positive amount of EURO");
          }
      }
     break ; 
     
      case 3:{
          System.out.println("Enter the Amount of USD ");
          double usd = sc.nextDouble();
          if (usd>0){
              System.out.println(usd + "USD is "+ usd * 85.61 + " BDT ");
          }
          else {
              System.out.println("Please input Positive amount of USD");
          }
      }
      break;
      
      case 4:{
          System.out.println("Enter the Amount of BDT ");
          double bdt = sc.nextDouble();
          if (bdt>0){
              System.out.println(bdt+ "BDT is "+ bdt * 0.012 + " USD ");
          }
          else {
              System.out.println("Please input Positive amount of BDT");
          }
      }
      break;
      
      case 5:{
          System.out.println("Enter the Amount of USD ");
          double usd = sc.nextDouble();
          if (usd>0){
              System.out.println(usd+ "USD is "+ usd * 75.02 + " INR ");
          }
          else {
              System.out.println("Please input Positive amount of USD");
          }
      }
      break;
      
      case 6:{
          System.out.println("Enter the Amount of INR ");
          double inr = sc.nextDouble();
          if (inr>0){
              System.out.println(inr+ "INR is "+ inr * 0.013 + " USD");
          }
          else {
              System.out.println("Please input Positive amount of INR");
          }
      }
      break;
      
       case 7:{
          System.out.println("Enter the Amount of EURO ");
          double euro = sc.nextDouble();
          if (euro>0){
              System.out.println(euro+ "EURO is "+ euro * 99.29 + " BDT ");
          }
          else {
              System.out.println("Please input Positive amount of EURO");
          }
      }
      break;
      
       case 8:{
          System.out.println("Enter the Amount of EURO ");
          double euro = sc.nextDouble();
          if (euro>0){
              System.out.println(euro+ "EURO is "+ euro * 87.01 + " INR ");
          }
          else {
              System.out.println("Please input Positive amount of EURO");
          }
      }
      break;
      
       case 9:{
          System.out.println("Enter the Amount of BDT ");
          double bdt = sc.nextDouble();
          if (bdt>0){
              System.out.println(bdt+ "BDT is "+ bdt * 0.010 + " EURO ");
          }
          else {
              System.out.println("Please input Positive amount of BDT");
          }
      }
      break;
      
       case 10:{
          System.out.println("Enter the Amount of INR ");
          double inr = sc.nextDouble();
          if (inr>0){
              System.out.println(inr+ "INR is "+ inr * 0.011 + " EURO ");
          }
          else {
              System.out.println("Please input Positive amount of INR");
          }
      }
      break;
      
       case 11:{
          System.out.println("Enter the Amount of USD ");
          double usd = sc.nextDouble();
          if (usd>0){
              System.out.println(usd+ "USD is "+ usd * 1 + " USD ");
          }
          else {
              System.out.println("Please input Positive amount of USD");
          }
      }
      break;
      
      case 12:{
          System.out.println("Enter the Amount of EURO ");
          double euro = sc.nextDouble();
          if (euro>0){
              System.out.println(euro + "EURO is "+ euro * 1 + " EURO ");
          }
          else {
              System.out.println("Please input Positive amount of EURO");
          }
      }
      break;
      
      case 13:{
          System.out.println("Enter the Amount of BDT ");
          double bdt = sc.nextDouble();
          if (bdt>0){
              System.out.println(bdt+ "BDT is "+ bdt * 1 + " BDT");
          }
          else {
              System.out.println("Please input Positive amount of BDT");
          }
      }
      break;
      
      case 14:{
          System.out.println("Enter the Amount of INR ");
          double inr = sc.nextDouble();
          if (inr>0){
              System.out.println(inr+ "INR is "+ inr * 1 + " INR ");
          }
          else {
              System.out.println("Please input Positive amount of INR");
          }
      }
      break;
      
    } 
     sc.close();
              
    }
    
}
