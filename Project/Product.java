/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author casper
 */
public class Product{
private String productName;
private String productColor;
private String productCategory;
private int productStock;
private int productWeight;
private String productInfo;
public Product(String productName,String productColor,String productCategory,int productStock,int productWeight,String productInfo) {
this.productName=productName;
this.productColor=productColor;
this.productCategory=productCategory;
this.productStock=productStock;
this.productWeight=productWeight;
this.productInfo=productInfo;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductColor(String productColor) {
	this.productColor = productColor;
}
public String getProductColor() {
	return productColor;
}
public void setProductInfo(String productInfo) {
	this.productInfo = productInfo;
}
public String getProductInfo() {
	return productInfo;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductName() {
	return productName;
}
public void setProductStock(int productStock) {
	this.productStock = productStock;
}
public int getProductStock() {
	return productStock;
}
public void setProductWeight(int productWeight) {
	this.productWeight = productWeight;
}
public int getProductWeight() {
	return productWeight;
}
public void showInfos() {
System.out.println("Product Category:"+this.productCategory);
System.out.println("Product Color:"+this.productColor);
System.out.println("Product Info:"+this.productInfo);
System.out.println("Product Name:"+this.productName);
System.out.println("Product Stock:"+this.productStock);
System.out.println("Product Weight:"+this.productWeight);
}
}
