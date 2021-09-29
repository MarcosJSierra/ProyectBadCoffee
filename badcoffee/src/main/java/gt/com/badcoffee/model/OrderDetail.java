/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Data
@Entity
@Table(name = "OrderDetail")
public class OrderDetail implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderDetail;
    
    @NotNull
    @Min(value = 0)
    private Double subTotal;
    
    @ManyToOne
    @JoinColumn(name="idProveedor")
    private Order idOrder;
    
    @ManyToOne
    @JoinColumn(name="idMenu")
    private Menu menu;
    
    
    
}
