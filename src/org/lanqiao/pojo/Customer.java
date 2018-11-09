package org.lanqiao.pojo;

import java.util.Objects;

//顾客信息
public class Customer {
    private int customerId;       //顾客id
    private String username;      //顾客名
    private String tel;          //联系方式
    private String address;      //收货地址
    private String shoppingCarId;//购物车id
    public  Customer(){

    }

    public Customer(int customerId, String username, String tel, String address, String shoppingCarId) {
        this.customerId = customerId;
        this.username = username;
        this.tel = tel;
        this.address = address;
        this.shoppingCarId = shoppingCarId;
    }

    public Customer(String username, String tel, String address, String shoppingCarId) {
        this.username = username;
        this.tel = tel;
        this.address = address;
        this.shoppingCarId = shoppingCarId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(String shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId &&
                Objects.equals(username, customer.username) &&
                Objects.equals(tel, customer.tel) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(shoppingCarId, customer.shoppingCarId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, username, tel, address, shoppingCarId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", shoppingCarId='" + shoppingCarId + '\'' +
                '}';
    }
}
