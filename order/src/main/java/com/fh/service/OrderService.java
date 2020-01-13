package com.fh.service;

import com.fh.ProductSearchParm.ProductSearchParm;
import com.fh.common.ServerResponse;
import com.fh.model.Order;
import com.fh.model.Orders;
import com.fh.model.Product;

import java.util.List;

public interface OrderService {
    List<Order> queryOrderList(Orders orders);

    List<Product> queryTypeList();

    ServerResponse addOrder(Order order);

    ServerResponse updateOrder(Order order);

    Long queryCount(ProductSearchParm productSearchParm);

    List<Order> queryOrder(ProductSearchParm productSearchParm);

    ServerResponse getOrderById(Integer orderId);

    ServerResponse queryTypeById(Integer productId);

    ServerResponse deleteOrder(Integer id);

    ServerResponse updateStatusDown(Integer id);

    ServerResponse deleteBatch(List list);
}
