package org.lanqiao.pojo;

import java.util.Objects;

//购物车
public class shoppingCart {
    private int carId;          //订单编号
    private int goodsId;        //商品id
    private double goodsprice;  //商品价格
    private int goodsCount;     //购买数量

    public shoppingCart(){

    }

    public shoppingCart(int goodsId, double goodsprice, int goodsCount) {
        this.goodsId = goodsId;
        this.goodsprice = goodsprice;
        this.goodsCount = goodsCount;
    }

    public shoppingCart(int carId, int goodsId, double goodsprice, int goodsCount) {
        this.carId = carId;
        this.goodsId = goodsId;
        this.goodsprice = goodsprice;
        this.goodsCount = goodsCount;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        shoppingCart that = (shoppingCart) o;
        return carId == that.carId &&
                goodsId == that.goodsId &&
                Double.compare(that.goodsprice, goodsprice) == 0 &&
                goodsCount == that.goodsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, goodsId, goodsprice, goodsCount);
    }
}
