/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.wms.gestion;
/**
 *
 * @author franc
 */
public class Producto {
    private int id;
private String nombre;
private int stock;
public Producto(int id, String nombre, int stock) {
this.id = id;
this.nombre = nombre;
this.stock = stock;
}
public int getId() {
return id;
}
public String getNombre() {
return nombre;
}
public int getStock() {
return stock;
}
public void agregarStock(int cantidad) {
if (cantidad <= 0) {
System.out.println("La cantidad debe ser mayor a cero");
return;
}
stock += cantidad;
}

    public void retirarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a cero");
            return;
        }

        if (cantidad > stock) {
            System.out.println("No hay stock suficiente");
            return;
        }

        stock -= cantidad;
    }

@Override
public String toString() {
return "Producto{" +
"id=" + id +
", nombre='" + nombre + '\'' +
", stock=" + stock +
'}';
}

        
}