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

import com.example.demo.models.CUPROD;
import com.example.demo.services.ProductoService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/Producto")
public class ProductoController {
@Autowired
ProductoService productoService;

@ApiOperation (value = "Trae la informacion de productos", notes= "Regresa toda la información de los productos desde la BD.")
@GetMapping()
public ArrayList<CUPROD> obtenerProductos(){
	return this.productoService.obtenerProductos();
}


@ApiOperation (value = "Inserta y guarda informacion", notes= "Inserta información y este metodo mismo puede ser utilizado para modificar informacion.")
@PostMapping()
public CUPROD guardarProducto(@RequestBody CUPROD producto) {
	return this.productoService.guardarProducto(producto);
}


@ApiOperation (value = "Trae los productos por su ID", notes= "Consulta la base de datos y asi trae la informacion por su ID.")
@GetMapping( path = "/{prod_id}")
	public Optional<CUPROD> ObtenerId(@PathVariable("prod_id") Long prod_id){
	return this.productoService.ObtenerId(prod_id);
}

@ApiOperation (value = "Elimina Registros", notes= "Este metodo es utilizado para eliminar registro en base a su ID.")
@DeleteMapping (path = "/{prod_id}")
public String eliminarId(@PathVariable("prod_id") Long prod_id) {
	boolean ok = this.productoService.eliminarProducto(prod_id);
	if(ok){
		return "Se elimino correctamente";
	}else {
		return "No se pudo eliminar";
	}
}
}
