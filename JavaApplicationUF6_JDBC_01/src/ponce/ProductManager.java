/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponce;

import ponce.dao.ProductDAO;
import ponce.dao.ProductDAOlmpl;
import ponce.model.Product;

/**
 *
 * @author alvaroponrod
 */
public class ProductManager {

    public static void main(String[] args) {
        ProductDAO product = new ProductDAOlmpl();

        //Agregar nuevo producto
        //product.insert(new Product(36, "Polloasw", 15.0));        

        //Update producto        
        //product.update(new Product(36, "Polloasw22", 152.0));        
        
        //Delete product        
        //product.delete(200);
        
        Product p = product.read(200);
        System.out.println(p);
    }

}
