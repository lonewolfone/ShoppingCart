package org.lanqiao.test;

import org.junit.Test;

import org.lanqiao.dao.goodsDao;
import org.lanqiao.dao.impl.goodsDaoImpl;
import org.lanqiao.pojo.Goods;
import org.lanqiao.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class test {

   goodsDao goodsDao = new goodsDaoImpl();

    @Test
    //获取链接的测试
    public void  jdbcUtilsTest() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        System.out.println("======================="+ connection);
    }

    @Test
    //查询所有商品信息
    public  void findAllGoodsTest() throws SQLException {
        List<Goods> goodsList = goodsDao.findAllGoods();
        for (Goods goods:goodsList){
            System.out.println(goods);
        }
    }
}
