package com.epsilon.training.dao;

import com.epsilon.training.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    public void addProduct(Product p) throws SQLException;
	public Product getProduct(int id);
	public void updateProduct(Product p);
	public void deleteProduct(int id);
	public List<Product> getAll();
	public List<Product> getProductByPriceRange(double min, double max);
}
