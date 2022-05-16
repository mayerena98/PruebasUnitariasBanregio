package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table (name = "CUPROD")
public class CUPROD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long prod_id;
	
	private String prod_nombre;
	private int prod_cat;
	public Long getProd_id() {
		return prod_id;
	}
	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_nombre() {
		return prod_nombre;
	}
	public void setProd_nombre(String prod_nombre) {
		this.prod_nombre = prod_nombre;
	}
	public int getProd_cat() {
		return prod_cat;
	}
	public void setProd_cat(int prod_cat) {
		this.prod_cat = prod_cat;
	}

}
