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
stock += cantidad;
}
public void retirarStock(int cantidad) {
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