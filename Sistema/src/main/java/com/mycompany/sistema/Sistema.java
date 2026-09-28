/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema;

/**
 *
 * @author franc
 */
public class Sistema {

    public static void main(String[] args) {
System.out.println(
"Sistema de Gestion de Depositos WMS"
);
Inventario inventario = new Inventario();
Producto notebook =
new Producto(1, "Notebook", 10);
Producto mouse =
new Producto(2, "Mouse", 25);
Producto teclado =
new Producto(3, "Teclado", 15);
inventario.agregarProducto(notebook);
inventario.agregarProducto(mouse);
inventario.agregarProducto(teclado);
inventario.mostrarInventario();
System.out.println(
"\nRecepcion de 5 notebooks"
);
notebook.agregarStock(5);
inventario.mostrarInventario();
System.out.println(
"\nRetiro de 3 notebooks"
);
notebook.retirarStock(3);
inventario.mostrarInventario();
    }
}
