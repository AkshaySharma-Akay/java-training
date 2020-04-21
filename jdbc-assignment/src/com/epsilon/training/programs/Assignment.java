package com.epsilon.training.programs;

import com.epsilon.training.dao.ProductDao;
import com.epsilon.training.dao.ProductDaoImpl;
import com.epsilon.training.model.Product;
import com.epsilon.training.util.KeyBoardUtil;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Assignment {
    public static void main(String args[]){
        ProductDao productDao = new ProductDaoImpl();
        boolean flag = true;
        int counter = KeyBoardUtil.getInt("Set Counter = ");
        int basePrice = 100;
        while(flag){
            counter++;
            System.out.println("1. Insert \n 2. Get Product \n 3. Update Product \n 4. Delete Product" +
                    "\n 5. Get All Products \n 6. Get Product By Price Range.");
            System.out.println("\n Press 0 to exit");
            int ch = KeyBoardUtil.getInt("\n Your Choice : ");
            System.out.println("ch = " + ch);
            switch(ch){
                case 0:
                    flag = false;
                    break;
                case 1:
                    Product p = new Product(counter, "Test" + counter, "Description" + counter,
                             new Date() , (basePrice*counter+counter)%1000);
                    try {
                        productDao.addProduct(p);
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    Product productById = productDao.getProduct(KeyBoardUtil.getInt("Enter Id = "));
                    if(productById != null){
                        System.out.println(productById.toString());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    List<Product> products = productDao.getAll();
                    if(products == null){
                        System.out.println("Empty Table");
                    }
                    for(Product product:products){
                        System.out.println(product.toString());
                    }
                    break;
                case 6:
                    List<Product> productsByPrice = productDao.getProductByPriceRange(KeyBoardUtil.getDouble("min : "),
                            KeyBoardUtil.getDouble("max : "));
                    if(productsByPrice == null){
                        System.out.println("Empty Table");
                    }
                    for(Product product:productsByPrice){
                        System.out.println(product.toString());
                    }
                    break;
                default:
                    System.out.println("Invalid Input, Try Again");
            }
        }
        System.out.println("Closing The Application!");
    }
}
