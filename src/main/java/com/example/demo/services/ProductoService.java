package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CUPROD;
import com.example.demo.repositories.ProductoRepository;

@Service
public class ProductoService {
@Autowired
ProductoRepository productoRepository;


public ArrayList<CUPROD> obtenerProductos(){
	return (ArrayList<CUPROD>) productoRepository.findAll(); 
}

public CUPROD guardarProducto(CUPROD producto) {
	return productoRepository.save(producto);
}

public Optional<CUPROD> ObtenerId(Long prod_id){
	return productoRepository.findById(prod_id);
}

public boolean eliminarProducto(Long prod_id) {
	try {
		productoRepository.deleteById(prod_id);
		return true;
	}catch (Exception err) {
		return false;
	}
}

}
