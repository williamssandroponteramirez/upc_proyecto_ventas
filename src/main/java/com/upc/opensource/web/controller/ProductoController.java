package com.upc.opensource.web.controller;

import com.upc.opensource.domain.service.ProductoService;
import com.upc.opensource.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("ConsultarListaProducto")
    public List<Producto> ConsultarListaProducto(){
        return productoService.getAll();
    }
}
