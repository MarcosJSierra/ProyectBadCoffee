/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.service;

import gt.com.badcoffee.model.OrderDetail;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public interface OrderDetailService {
    
    public OrderDetail getOrderDetailById();
    
    public ArrayList<OrderDetail> gerAllOrderDetail();
    
    public ArrayList<OrderDetail> getOrderDetailByOrder();
    
    public OrderDetail createOrderDetail();
    
    public OrderDetail updateOrderDitail();
    
    public void deleteOprderDetail();
}
