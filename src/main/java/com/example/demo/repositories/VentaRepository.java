package com.example.demo.repositories;

import com.example.demo.models.CUPROD;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "List-Productos", url = "http://localhost:8080/productos")

public interface VentaRepository {
	@RequestMapping(method = RequestMethod.GET)
	public List<CUPROD> obtenerProductos();
	}

