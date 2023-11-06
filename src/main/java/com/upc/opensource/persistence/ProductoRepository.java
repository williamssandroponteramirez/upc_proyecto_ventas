package com.upc.opensource.persistence;

import com.upc.opensource.persistence.crud.ProductoCrudRepository;
import com.upc.opensource.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
