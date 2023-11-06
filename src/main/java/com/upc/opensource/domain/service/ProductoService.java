package com.upc.opensource.domain.service;

import com.upc.opensource.persistence.ProductoRepository;
import com.upc.opensource.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAll(){
        return productoRepository.getAll();
    }
}
