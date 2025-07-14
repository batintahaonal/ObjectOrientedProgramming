/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author casper
 */
public class CreditCard {
private int creditCardNumber;
private String creditCardUser;
private int securityCode;
private int expirationDate;
public CreditCard(int creditCardNumber,String creditCardUser,int securityCode,int expirationDate) {
this.creditCardNumber=creditCardNumber;
this.creditCardUser=creditCardUser;
this.securityCode=securityCode;
this.expirationDate=expirationDate;
}
public void setCreditCardNumber(int creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public int getCreditCardNumber() {
	return creditCardNumber;
}
public void setCreditCardUser(String creditCardUser) {
	this.creditCardUser = creditCardUser;
}
public String getCreditCardUser() {
	return creditCardUser;
}
public void setExpirationDate(int expirationDate) {
	this.expirationDate = expirationDate;
}
public int getExpirationDate() {
	return expirationDate;
}
public void setSecurityCode(int securityCode) {
	this.securityCode = securityCode;
}
public int getSecurityCode() {
	return securityCode;
}
public void showInfos() {
System.out.println("Credit Card No:"+this.creditCardNumber);
System.out.println("Credit Card Holder:"+this.creditCardUser);
System.out.println("Expiration Date:"+this.expirationDate);
System.out.println("Security Code:"+this.securityCode);
}
}
