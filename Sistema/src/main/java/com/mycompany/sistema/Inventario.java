/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author franc
 */
public class Inventario {
    private List<Producto> productos =
new ArrayList<>();
public void agregarProducto(Producto producto) {
productos.add(producto);
}
public void mostrarInventario() {
System.out.println(
"=== INVENTARIO DEL DEPOSITO ==="
);
for (Producto producto : productos) {
System.out.println(producto);
}
}
}
