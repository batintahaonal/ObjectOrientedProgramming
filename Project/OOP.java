/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author casper
 */
public class OOP {
public static void main(String[] args) {
Product product=new Product("calculator","white","office product",100,300,"scientific calculator");
CreditCard creditcard=new CreditCard(2353,"Bâtın",123,2023);
User user=new User("FrewelDivison","Bâtın Taha","Önal","22/12/2000",1234,
		"turani16@hotmail.com","Erbilir sitesi","Turkey-Freelancer","calculator","backpack");
Order order=new Order("calculator","white","office product",100,300,"scientific calculator",400,1000);
System.out.println("Welcome please enter your information about yourself");
System.out.println();
user.showInfos();
System.out.println();
System.out.println("please enter your credit card information:");
System.out.println();
creditcard.showInfos();
System.out.println();
System.out.println("select product that you want to buy and press like button for love product:");
System.out.println();
product.showInfos();
System.out.println();
user.OrderProduct(2);
user.displayRemainProduct();
user.displayFavoriteProduct();
System.out.println();
System.out.println("wait a second... infos about the ordered product is displaying");
System.out.println();
order.showInfos();
System.out.println();
System.out.println("wait a second... purchase transactions are displaying");
System.out.println();
order.productPrice();
System.out.println("Do you want to buy?");
order.purchase();
order.displayBalance();
System.out.println("Purchase transaction is successful, feel happy while using it :)");
}
}
