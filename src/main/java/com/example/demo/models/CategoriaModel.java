package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "CUCAT")

public class CategoriaModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(unique = true, nullable = false)
private Long cat_id;

private String cat_nombre;
private String cat_descripcion;
private int cat_tipocat;
public Long getCat_id() {
	return cat_id;
}
public void setCat_id(Long cat_id) {
	this.cat_id = cat_id;
}
public String getCat_nombre() {
	return cat_nombre;
}
public void setCat_nombre(String cat_nombre) {
	this.cat_nombre = cat_nombre;
}
public String getCat_descripcion() {
	return cat_descripcion;
}
public void setCat_descripcion(String cat_descripcion) {
	this.cat_descripcion = cat_descripcion;
}
public int getCat_tipocat() {
	return cat_tipocat;
}
public void setCat_tipocat(int cat_tipocat) {
	this.cat_tipocat = cat_tipocat;
}

}
