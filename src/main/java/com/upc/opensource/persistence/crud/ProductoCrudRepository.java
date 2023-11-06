package com.upc.opensource.persistence.crud;

import com.upc.opensource.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    List<Producto> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
