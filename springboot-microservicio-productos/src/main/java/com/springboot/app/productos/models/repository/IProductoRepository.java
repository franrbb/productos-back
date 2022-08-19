package com.springboot.app.productos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.productos.models.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
