package com.softtek.servicio;

import com.softtek.modelo.Producto;
import com.softtek.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private IProductoRepo productoRepo;

    @Override
    public List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException {
        return productoRepo.obtenerProducto();
    }

    @Override
    public Producto crearProducto(Producto p) throws SQLException, ClassNotFoundException {
        productoRepo.crearProducto(p);
        return p;
    }

    @Override
    public Producto actualizarProducto(int id, int stock) {
        return null;
    }

    @Override
    public void deleteProducto(int id) throws SQLException, ClassNotFoundException {
        productoRepo.eliminarProducto(id);
    }
}
