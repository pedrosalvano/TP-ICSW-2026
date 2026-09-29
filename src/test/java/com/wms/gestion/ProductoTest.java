package com.wms.gestion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductoTest {

    @Test
    public void retirarCantidadValidaDescuentaStock() {
        Producto producto = new Producto(1, "Notebook", 10);

        producto.retirarStock(3);

        assertEquals(7, producto.getStock());
    }

    @Test
    public void retirarTodoElStockDejaCero() {
        Producto producto = new Producto(1, "Notebook", 10);

        producto.retirarStock(10);

        assertEquals(0, producto.getStock());
    }

    @Test
    public void retirarMasDeLoDisponibleNoModificaStock() {
        Producto producto = new Producto(1, "Notebook", 10);

        producto.retirarStock(15);

        assertEquals(10, producto.getStock());
    }

    @Test
    public void retirarCeroNoModificaStock() {
        Producto producto = new Producto(1, "Notebook", 10);

        producto.retirarStock(0);

        assertEquals(10, producto.getStock());
    }

    @Test
    public void retirarCantidadNegativaNoModificaStock() {
        Producto producto = new Producto(1, "Notebook", 10);

        producto.retirarStock(-3);

        assertEquals(10, producto.getStock());
    }
}