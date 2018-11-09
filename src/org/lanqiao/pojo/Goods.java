package org.lanqiao.pojo;

import java.util.Objects;
//商品信息
public class Goods {
    private int id;           //商品编号
    private String goodsName; //商品名
    private double price;     //商品价格
    private int goodsNum;     //商品储存数量
    public Goods(){

    }

    public Goods(int id, String goodsName, double price, int goodsNum) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsNum = goodsNum;
    }

    public Goods(String goodsName, double price, int goodsNum) {
        this.goodsName = goodsName;
        this.price = price;
        this.goodsNum = goodsNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id &&
                Double.compare(goods.price, price) == 0 &&
                goodsNum == goods.goodsNum &&
                Objects.equals(goodsName, goods.goodsName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, goodsName, price, goodsNum);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", goodsNum=" + goodsNum +
                '}';
    }
}
