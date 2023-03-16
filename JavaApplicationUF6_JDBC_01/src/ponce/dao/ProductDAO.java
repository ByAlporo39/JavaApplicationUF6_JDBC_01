/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ponce.dao;

import ponce.model.Product;

/**
 *
 * @author alvaroponrod
 */
public interface ProductDAO {

    public void insert(Product product);

    public void update(Product product);

    public void delete(Integer id);

    public Product read(Integer id);

}
