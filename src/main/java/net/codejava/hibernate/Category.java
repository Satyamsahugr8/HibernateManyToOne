package net.codejava.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// Parent

@Entity
@Table(name = "CATEGORY")
public class Category {
	
	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue
	private long id;
	
    private String name;
    
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<Product>();   

    
    
	public Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
     

}
