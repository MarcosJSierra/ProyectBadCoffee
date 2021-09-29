/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name = "Order")
public class Order implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;
    
    @NotNull
    @Min(value = 0)
    private Double total;
    
    @NotEmpty
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    @NotNull
    private Long initialTime;
    
    @NotNull
    private Long finalTime;
    
    @NotNull
    private Integer orderState;
    
    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;
    
}
