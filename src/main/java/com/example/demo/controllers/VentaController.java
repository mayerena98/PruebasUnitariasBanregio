package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.VentaRepository;
import com.example.demo.models.CUPROD;

@RestController
@RequestMapping("/Ventas")
public class VentaController {

	private VentaRepository ventaRepository;
	
	@GetMapping
	private ResponseEntity<List<CUPROD>> obtenerProductos(){
		return ResponseEntity.ok(ventaRepository.obtenerProductos());
	}
	
}
