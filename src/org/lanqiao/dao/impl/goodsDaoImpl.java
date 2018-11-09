package org.lanqiao.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.dao.goodsDao;
import org.lanqiao.pojo.Goods;
import org.lanqiao.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

public class goodsDaoImpl implements goodsDao {

    //创建queryRunner对象
    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    @Override
    public List<Goods> findAllGoods() throws SQLException {
        List<Goods> goodsList = null;
        String sql = "select * from shoppingCart_goods";
        goodsList = queryRunner.query(sql,new BeanListHandler<>(Goods.class));
        return goodsList;
    }
}
