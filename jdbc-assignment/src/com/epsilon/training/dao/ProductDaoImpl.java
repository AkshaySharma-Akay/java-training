package com.epsilon.training.dao;

import com.epsilon.training.model.Product;
import com.epsilon.training.util.DbUtil;
import com.epsilon.training.util.KeyBoardUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class ProductDaoImpl implements ProductDao {
    //CRUD
    //Create
    public void addProduct(Product p) {
        // get the product object as an input
        System.out.println("\n Inserting Product " + p.toString());
        String sql = "insert into products(id, name, description, dateadded, price) values(?,?,?,?,?)";

        try(
            Connection conn = DbUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            stmt.setString(1, String.valueOf(p.getId()));
            stmt.setString(2, p.getName());
            stmt.setString(3, p.getDescription());
            stmt.setString(4, (new java.sql.Date(p.getDateAdded().getTime())).toString());
            stmt.setString(5, String.valueOf(p.getPrice()));
            stmt.executeUpdate();
            System.out.println("Product Inserted : " + p.toString() );
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //Read
    public Product getProduct(int id){
        String sql = "select * from products where id = ?";
        Product product = null;
        try(
            Connection conn = DbUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            stmt.setString(1,String.valueOf(id));
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    product = new Product();
                    product.setId(Integer.parseInt(rs.getString("id")));
                    product.setName(rs.getString("name"));
                    product.setDescription(rs.getString("description"));
                    product.setDateAdded(Date.valueOf(rs.getString("dateadded")));
                    product.setPrice(Double.parseDouble(rs.getString("price")));
                }else{
                    System.out.println("No Data Found For Product with id = " + id);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return product;
    }

    //Update
    public void updateProduct(Product p){
        //TODO
    }

    //Delete
    public void deleteProduct(int id){
        //TODO
    }

    public List<Product> getAll(){
        List pList = new ArrayList();
        String sql = "select * from products";
        try(
                Connection conn = DbUtil.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()) {
                    Product product = new Product();
                    product.setId(Integer.parseInt(rs.getString("id")));
                    product.setName(rs.getString("name"));
                    product.setDescription(rs.getString("description"));
                    product.setDateAdded(Date.valueOf(rs.getString("dateadded")));
                    product.setPrice(Double.parseDouble(rs.getString("price")));
                    pList.add(product);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return pList;
    }
    public List<Product> getProductByPriceRange(double min, double max){
        List pList = new ArrayList();
        String sql = "select * from products where products.price >= ? and products.price <= ?";
        Product p = null;
        try(
                Connection conn = DbUtil.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            stmt.setString(1,String.valueOf(min));
            stmt.setString(2,String.valueOf(max));
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()) {
                    Product product = new Product();
                    product.setId(Integer.parseInt(rs.getString("id")));
                    product.setName(rs.getString("name"));
                    product.setDescription(rs.getString("description"));
                    product.setDateAdded(Date.valueOf(rs.getString("dateadded")));
                    product.setPrice(Double.parseDouble(rs.getString("price")));
                    pList.add(product);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return pList;
    }
}
