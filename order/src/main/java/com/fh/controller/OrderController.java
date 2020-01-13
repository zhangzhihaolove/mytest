package com.fh.controller;

import com.fh.ProductSearchParm.ProductSearchParm;
import com.fh.common.ServerResponse;
import com.fh.model.Order;
import com.fh.model.Orders;
import com.fh.model.Product;
import com.fh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("order/")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;//

    @RequestMapping("queryMapGoodsList")
    public ServerResponse queryMapGoodsList(ProductSearchParm productSearchParm){
        Long totalCount = orderService.queryCount(productSearchParm);
        List<Order> list =  orderService.queryOrder(productSearchParm);

        Map map = new HashMap();
        map.put("draw",productSearchParm.getDraw());
        map.put("recordsTotal",totalCount);
        map.put("recordsFiltered",totalCount);
        map.put("data",list);
        return ServerResponse.success(map);
    }

    @RequestMapping("queryOrderList")
    public ServerResponse queryOrderList(Orders orders){
      List<Order> list =  orderService.queryOrderList(orders);
        return ServerResponse.success(list);
    }

    @RequestMapping("queryTypeList")
    public ServerResponse queryTypeList(){
        List<Product> list =  orderService.queryTypeList();
        return ServerResponse.success(list);
    }

    @RequestMapping("addOrder")
    public ServerResponse addOrder(Order order){
        return orderService.addOrder(order);
    }

    @RequestMapping("updateOrder")
    public ServerResponse updateOrder(Order order){
        return orderService.updateOrder(order);
    }

    @RequestMapping("getOrderById")
    public ServerResponse getOrderById(Integer id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("deleteOrder")
    public ServerResponse deleteOrder(Integer id){
        return orderService.deleteOrder(id);
    }

    @RequestMapping("updateStatusDown")
    public ServerResponse updateStatusDown(Integer id){
        return orderService.updateStatusDown(id);
    }

    @RequestMapping("deleteBatch")
    public ServerResponse deleteBatch(@RequestParam("idsList[]")List list){
        return orderService.deleteBatch(list);
    }

}
