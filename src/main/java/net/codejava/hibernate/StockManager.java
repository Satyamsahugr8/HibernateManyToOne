package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StockManager {
	
	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Activa");
		product1.setPrice(86000);
		product1.setDescription("Scooty for city ride, best for male/female");
		
		Product product2 = new Product();
		product2.setName("Shine");
		product2.setPrice(90000);
		product2.setDescription("Nice engine sound soft and clear feels good");
		
		Category category = new Category("Bike");
		
		product1.setCategory(category);
		product2.setCategory(category);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(product1);
		session.save(product2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
