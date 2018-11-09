package org.lanqiao.service;

import org.lanqiao.pojo.Goods;

import java.util.List;

public interface goodsService {
    //查询所有商品信息
    public List<Goods> findAllGoods();
}
