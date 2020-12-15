package com.example.spring03.model.order.dto;

import java.util.Date;

public class OrderListDTO {
	private String orderId;
	private String userId;
	private String orderRec;
	private String address;
	private String detailAddress;
	private String extraAddress;
	private String orderPhon;
	private Date orderDate;
	
	private int orderDetailsNum;
	private int gdsNum;
	private int cartStock;
	
	private int product_num;
	private int product_price;//가격
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderRec() {
		return orderRec;
	}
	public void setOrderRec(String orderRec) {
		this.orderRec = orderRec;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getExtraAddress() {
		return extraAddress;
	}
	public void setExtraAddress(String extraAddress) {
		this.extraAddress = extraAddress;
	}
	public String getOrderPhon() {
		return orderPhon;
	}
	public void setOrderPhon(String orderPhon) {
		this.orderPhon = orderPhon;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderDetailsNum() {
		return orderDetailsNum;
	}
	public void setOrderDetailsNum(int orderDetailsNum) {
		this.orderDetailsNum = orderDetailsNum;
	}
	public int getGdsNum() {
		return gdsNum;
	}
	public void setGdsNum(int gdsNum) {
		this.gdsNum = gdsNum;
	}
	public int getCartStock() {
		return cartStock;
	}
	public void setCartStock(int cartStock) {
		this.cartStock = cartStock;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "OrderListDTO [orderId=" + orderId + ", userId=" + userId + ", orderRec=" + orderRec + ", address="
				+ address + ", detailAddress=" + detailAddress + ", extraAddress=" + extraAddress + ", orderPhon="
				+ orderPhon + ", orderDate=" + orderDate + ", orderDetailsNum=" + orderDetailsNum + ", gdsNum=" + gdsNum
				+ ", cartStock=" + cartStock + ", product_num=" + product_num + ", product_price=" + product_price
				+ "]";
	}

}
