package com.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.productos.models.entity.Producto;
import com.springboot.app.productos.models.repository.IProductoRepository;

@Service
public class ProductoRepositoryImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository repository;

	@Override
	public List<Producto> findAll() {
		return repository.findAll();
	}

}
