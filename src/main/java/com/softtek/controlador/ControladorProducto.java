package com.softtek.controlador;

import com.softtek.modelo.Producto;
import com.softtek.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    @Autowired
    private IProductoServicio productoServicio;

    @GetMapping
    public List<Producto> obtenerProcuto() throws SQLException, ClassNotFoundException {
        return productoServicio.obtenerProducto();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto p) throws SQLException, ClassNotFoundException {
        return productoServicio.crearProducto(p);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        productoServicio.deleteProducto(id);
    }
}
