/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.service;

import gt.com.badcoffee.model.User;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public interface UserService {
    
     public User getUserByID(Integer userId);
     
     public ArrayList<User> getAllUsers();
     
     public User createUser(User user);
     
     public User updateUser(User user);
     
     public void deleteUser(User user);
     
}
