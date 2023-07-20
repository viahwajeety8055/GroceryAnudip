package com.springcore.GroceryHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * create a Grocery Store Management System using Hibernate, you would need to
 * define the necessary tables/entities to represent products, orders, and other
 * relevant information.
 */

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Order.class).addAnnotatedClass(Product.class);
        SessionFactory sFactory = configuration.buildSessionFactory();
        Session session = sFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Order order1 = new Order();
        order1.setUserid(500);
        
        Product product1 = new Product();
        product1.setProduct_name("Shampooo");
        product1.setProduct_price(5000L);
        product1.setOrder(order1);
        
        Product product2 = new Product();
        product2.setProduct_name("Watermelon");
        product2.setProduct_price(2000L);
        product2.setOrder(order1);
        
        Product product3 = new Product();
        product3.setProduct_name("Rice");
        product3.setProduct_price(1000L);
        product3.setOrder(order1);
        
        order1.getProducts().add(product1);
        order1.getProducts().add(product2);
        order1.getProducts().add(product3);
        
        session.save(order1);
        transaction.commit();
        
        System.out.println("Done");
        
        session.close();
        sFactory.close();
	}
}


























