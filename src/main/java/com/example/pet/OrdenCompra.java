package com.example.pet;

import java.util.List;
import java.util.Map;

public class OrdenCompra {
    private int idOC;
    private String empresa;
    private String proveedor;
    private String direccion;
    private List<Productos> productos;
    private Map<String, List<String>> estadoOrden;

    public OrdenCompra(int idOC, String empresa, String proveedor, String direccion, List<Productos> productos, Map<String, List<String>> estadoOrden){
        this.idOC = idOC;
        this.empresa = empresa;
        this.proveedor = proveedor;
        this.direccion = direccion;
        this.productos = productos;
        this.estadoOrden = estadoOrden;
    }

    public int getIdOC(){
        return idOC;
    }

    public String getEmpresa(){
        return empresa;
    }

    public String getProveedor(){
        return proveedor;
    
    }

    public String getDireccion(){
        return direccion;
    }

    public List<Productos> getProductos(){
        return productos;
    }

    public Map<String, List<String>> getEstadoOrden(){
        return estadoOrden;
    }

}
