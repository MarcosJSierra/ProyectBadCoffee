/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.badcoffee.service;

import gt.com.badcoffee.model.Menu;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public interface ManuService {
    
    public Menu getMenuById(Integer menuId);
    
    public ArrayList<Menu> getAllMenu();
    
    public Menu createMenu(Menu menu);
    
    public Menu updateMenu(Menu menu);
    
    public void deleteMenu(Menu menu);
    
}
