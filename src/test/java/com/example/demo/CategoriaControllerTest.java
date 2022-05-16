package com.example.demo;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controllers.CategoriaController;
import com.example.demo.models.CategoriaModel;


@SpringBootTest
public class CategoriaControllerTest {

	@Autowired
	CategoriaController categoriaController;
	
	
	@Test
	public void testObtenerCategoria() {
		List<CategoriaModel> categorias = categoriaController.obtenerCategorias();
				assertThat(categorias).size().isGreaterThan(0);
		System.out.println("Funciona");		
	}
	
	
	@Test
	public void testGuardarCategoria() {
		CategoriaModel categoria = new CategoriaModel();
		categoria.setCat_descripcion("Pruebas Unitarias");
		categoria.setCat_nombre("Pruebas");
		categoria.setCat_tipocat(1);
		categoriaController.guardarCategoria(categoria);
		assertNotNull(categoria.getCat_id().toString());
	}
	
	@Test
	public void testEliminarId() {
		categoriaController.eliminarId((long) 5);
		assertEquals(Optional.empty(), categoriaController.ObtenerId(5));
		
	}
	
}
