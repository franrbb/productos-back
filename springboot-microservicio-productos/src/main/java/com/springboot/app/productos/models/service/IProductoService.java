package com.springboot.app.productos.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.app.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Optional<Producto> findById(Long id);

}
