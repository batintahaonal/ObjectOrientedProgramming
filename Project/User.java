/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author casper
 */
public class User{
private int productStock;
private String username;
private String name;
private String surname;
private String dateOfBirth;
private int password;
private String emailAddress;
private String homeAddress;
private String workAddress;
private String orderedProduct;
private String favoriteProduct;
public User(String username,String name,String surname,String dateOfBirth,int password,String emailAddress,String homeAddress, String workAddress,
		String orderedProduct,String favoriteProduct) {
this.productStock=100;
this.username=username;
this.name=name;
this.surname=surname;
this.dateOfBirth=dateOfBirth;
this.password=password;
this.emailAddress=emailAddress;
this.homeAddress=homeAddress;
this.workAddress=workAddress;
this.orderedProduct=orderedProduct;
this.favoriteProduct=favoriteProduct;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUsername() {
	return username;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getSurname() {
	return surname;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setFavoriteProduct(String favoriteProduct) {
	this.favoriteProduct = favoriteProduct;
}
public String getFavoriteProduct() {
	return favoriteProduct;
}
public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
}
public String getHomeAddress() {
	return homeAddress;
}
public void setOrderedProduct(String orderedProduct) {
	this.orderedProduct = orderedProduct;
}
public String getOrderedProduct() {
	return orderedProduct;
}
public void setPassword(int password) {
	this.password = password;
}
public int getPassword() {
	return password;
}
public void setWorkAddress(String workAddress) {
	this.workAddress = workAddress;
}
public String getWorkAddress() {
	return workAddress;
}
public int OrderProduct(int n) {
System.out.println("You ordered "+n+" product");
this.productStock=this.productStock-n;
return this.productStock;
}
public void displayFavoriteProduct() {
System.out.println("The product which user liked:"+this.getFavoriteProduct());
}
public void displayRemainProduct() {
System.out.println("Product Stock:"+this.productStock); }
	public void showInfos() {
	System.out.println("Birthday:"+this.dateOfBirth);
	System.out.println("e-mail:"+this.emailAddress);
	System.out.println("Favorite Product:"+this.favoriteProduct);
	System.out.println("Home Address:"+this.homeAddress);
	System.out.println("Name:"+this.name);
	System.out.println("Ordered Product:"+this.orderedProduct);
	System.out.println("Password:"+this.password);
	System.out.println("Surname:"+this.surname);
	System.out.println("Username:"+this.username);
	System.out.println("Work Address:"+this.workAddress);
	}
}
