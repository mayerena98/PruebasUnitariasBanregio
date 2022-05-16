package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.CategoriaModel;
import com.example.demo.services.CategoriaService;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
@Autowired
CategoriaService categoriaService;
	
@ApiOperation (value = "Trae la informacion de categorias", notes= "Regresa toda la información de los categorias desde la BD.")
@GetMapping()
public ArrayList<CategoriaModel> obtenerCategorias(){
	return this.categoriaService.obtenerCategoria();
}

@ApiOperation (value = "Inserta y guarda informacion", notes= "Inserta información y este metodo mismo puede ser utilizado para modificar informacion.")
@PostMapping()
public CategoriaModel guardarCategoria(@RequestBody CategoriaModel categoria) {
	return this.categoriaService.guardarCategoria(categoria);
}

@ApiOperation (value = "Trae los productos por su ID", notes= "Consulta la base de datos y asi trae la informacion por su ID.")
@GetMapping( path = "/{cat_id}")
	public Optional<CategoriaModel> ObtenerId(@PathVariable("cat_id") int id){
	return this.categoriaService.ObtenerId(id);
}

@ApiOperation (value = "Elimina Registros", notes= "Este metodo es utilizado para eliminar registro en base a su ID.")
@DeleteMapping (path = "/{cat_id}")
public String eliminarId(@PathVariable("cat_id") Long cat_id) {
	boolean ok = this.categoriaService.eliminarCategoria(cat_id);
	if(ok){
		return "Se elimino correctamente";
	}else {
		return "No se pudo eliminar";
	}
}
}
