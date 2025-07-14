/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author casper
 */
public class Order extends Product {
private int price;
private int balance;
public Order(String productName,String productColor,String productCategory,int productStock,int productWeight,String productInfo,int price,
		int balance) {
	super(productName,productColor,productCategory,productStock,productWeight,productInfo);
	this.price=price;
	this.balance=balance;
}
@Override
	public void showInfos() {
		super.showInfos();
	}
    public void productPrice() {
        System.out.println("Product price is:"+this.price);
    }
    public int purchase() {
     return this.balance=this.balance-this.price;
    }
    public void displayBalance() {
    System.out.println("balance:"+this.balance);
    }
}
