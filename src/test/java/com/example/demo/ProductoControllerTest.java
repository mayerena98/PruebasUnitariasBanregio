package com.example.demo;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controllers.ProductoController;
import com.example.demo.models.CUPROD;



@SpringBootTest
public class ProductoControllerTest {

	@Autowired
	ProductoController productoController;
	
	@Test
	public void testObtenerProducto() {
		List<CUPROD> Producto = productoController.obtenerProductos();
				assertThat(Producto).size().isGreaterThan(0);
		System.out.println("Funciona");		
	}
	
	@Test
	public void testGuardarProducto() {
		CUPROD Producto = new CUPROD();
		Producto.setProd_nombre("Producto de Prueba");
		Producto.setProd_cat(1);
		productoController.guardarProducto(Producto);
		assertNotNull(Producto.getProd_id().toString());
	}
	
	@Test
	public void testEliminarId() {
		productoController.eliminarId((long) 1);
		assertEquals(Optional.empty(),productoController.ObtenerId((long) 5));
	}
	
}
