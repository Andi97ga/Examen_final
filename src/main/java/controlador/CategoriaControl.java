/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Categoria;
import servicio.CategoriaServicio;

/**
 *
 * @author User
 */
public class CategoriaControl {
    private final CategoriaServicio categoriaServicio = new CategoriaServicio();
    
    public Categoria crear(String [] args){
        var categoria= new Categoria(Integer.valueOf(args[0]),args[1]);
        this.categoriaServicio.crear(categoria);
        return categoria;
    }
    
    public List<Categoria> listar(){
        return this.categoriaServicio.listar();
    }
}
