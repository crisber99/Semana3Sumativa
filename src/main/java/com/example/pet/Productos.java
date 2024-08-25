package com.example.pet;

public class Productos {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private int precioUnidad;

    public Productos(String codigo, String descripcion, int cantidad, int precioUnidad){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getCantidad(){
        return cantidad;
    }

    public int getPrecioUnidad(){
        return precioUnidad;
    }
}
