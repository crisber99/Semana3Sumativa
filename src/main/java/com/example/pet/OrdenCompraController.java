package com.example.pet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrdenCompraController {
    private List<OrdenCompra> OC = new ArrayList<>();

    public OrdenCompraController(){
        OC.add(new OrdenCompra(1, "empresa 1", "Proveedor 1", "Dirección 1", Arrays.asList(new Productos("A001","prod 1", 5, 50000)), llenarListaEstadoMap("A001", "Entregado")));
        OC.add(new OrdenCompra(2, "empresa 2", "Proveedor 2", "Dirección 2", Arrays.asList(new Productos("A002","prod 2", 2, 5000)), llenarListaEstadoMap("A002", "En Camino")));
        OC.add(new OrdenCompra(3, "empresa 3", "Proveedor 3", "Dirección 3", Arrays.asList(new Productos("A003","prod 3", 6, 4000)), llenarListaEstadoMap("A003", "Pendiente")));
        OC.add(new OrdenCompra(4, "empresa 4", "Proveedor 4", "Dirección 4", Arrays.asList(new Productos("A004","prod 4", 1, 1000)), llenarListaEstadoMap("A004", "Entregado")));
        OC.add(new OrdenCompra(5, "empresa 5", "Proveedor 5", "Dirección 5", Arrays.asList(new Productos("A005","prod 5", 8, 500)), llenarListaEstadoMap("A005", "En Camino")));

    }

    private Map<String, List<String>> llenarListaEstadoMap(String codigo, String estado){
        Map<String, List<String>> retorno = new HashMap<String, List<String>>();

        List<String> dipoList = Arrays.asList(estado);

        retorno.put(estado, dipoList);

        return retorno;
    }

    @GetMapping("/pett/{id}")
    public OrdenCompra getOcByID(@PathVariable int id){
        for (OrdenCompra res : OC){
            if(res.getIdOC() == id){
                return res;
            }
        }
        return null;
    }

    @GetMapping("/pett")
    public List<OrdenCompra> peliculas(){
        return OC;
    }

    @GetMapping("/pett/{idOc}/estados/{estado}")
    public String MostrarEstado(@PathVariable("idOc") Integer idOc, @PathVariable("estado") String estados) {
        String retorno = "";
        for(OrdenCompra res : OC){
            if(res.getIdOC() == idOc){
                List<String> estado = res.getEstadoOrden().get(estados); 
                if(estado != null){
                    retorno = estado.toString();    
                }
                else{
                    retorno = "Sin resultado";
                }
                
            }
            
        }
        return retorno;
    }
}
