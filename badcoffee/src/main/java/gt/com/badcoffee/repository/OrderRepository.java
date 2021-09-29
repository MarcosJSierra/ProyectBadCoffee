/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.repository;

import gt.com.badcoffee.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marcos
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
