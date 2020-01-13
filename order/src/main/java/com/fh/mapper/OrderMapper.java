package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.ProductSearchParm.ProductSearchParm;
import com.fh.common.ServerResponse;
import com.fh.model.Order;
import com.fh.model.Orders;
import com.fh.model.Product;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {
    List<Order> queryOrderList(Orders Orders);

    List<Product> queryTypeList();

    Long queryCount(ProductSearchParm productSearchParm);

    Product queryTypeById(Integer productId);

    List<Order> queryOrder(ProductSearchParm productSearchParm);

    void addOrder(Order order);

    void updateStatusDown(Integer id);

    void deleteBatch(List list);
}
