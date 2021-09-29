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
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="User")
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    
    @NotEmpty
    private String name;
    
    @NotEmpty
    @Email
    private String mail;
    
    @NotEmpty
    private String password;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String phoneNumber;
    
}
