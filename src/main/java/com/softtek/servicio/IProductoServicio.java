package com.softtek.servicio;

import com.softtek.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductoServicio {
    List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException;
    Producto crearProducto(Producto p) throws SQLException, ClassNotFoundException;
    Producto actualizarProducto(int id, int stock);
    void deleteProducto(int id) throws SQLException, ClassNotFoundException;
}
