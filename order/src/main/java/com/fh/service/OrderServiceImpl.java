package com.fh.service;

import com.fh.ProductSearchParm.ProductSearchParm;
import com.fh.common.ServerResponse;
import com.fh.mapper.OrderMapper;
import com.fh.model.Order;
import com.fh.model.Orders;
import com.fh.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;//


    @Override
    public List<Order> queryOrderList(Orders orders) {
        return orderMapper.queryOrderList(orders);
    }

    @Override
    public List<Product> queryTypeList() {
        return orderMapper.queryTypeList();
    }


    @Override
    public ServerResponse addOrder(Order order) {
        orderMapper.addOrder(order);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse updateOrder(Order order) {
        orderMapper.updateById(order);
        return ServerResponse.success();
    }

    @Override
    public Long queryCount(ProductSearchParm productSearchParm) {
        return orderMapper.queryCount(productSearchParm);
    }

    @Override
    public List<Order> queryOrder(ProductSearchParm productSearchParm) {
        return orderMapper.queryOrder(productSearchParm);
    }

    @Override
    public ServerResponse getOrderById(Integer id) {
        Order order = orderMapper.selectById(id);
        return ServerResponse.success(order);
    }

    @Override
    public ServerResponse queryTypeById(Integer productId) {
        Product product = orderMapper.queryTypeById(productId);
        return ServerResponse.success(product);
    }

    @Override
    public ServerResponse deleteOrder(Integer id) {
        orderMapper.updateStatusDown(id);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse updateStatusDown(Integer id) {
        orderMapper.updateStatusDown(id);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse deleteBatch(List list) {
        orderMapper.deleteBatch(list);
        return ServerResponse.success();
    }
}
