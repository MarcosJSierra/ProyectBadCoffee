/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.service;

import gt.com.badcoffee.model.Order;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public interface OrderService {
    
    public Order getOrderById(Integer orderId);
    
    public ArrayList<Order> getAllOrders();
    
    public Order createOrder(Order order);
    
    public Order updateOrder(Order order);
    
    public void deleteOrder(Order order);
    
    
}
