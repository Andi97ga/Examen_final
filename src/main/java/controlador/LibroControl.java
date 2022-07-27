/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Categoria;
import modelo.Libro;
import servicio.CategoriaServicio;
import servicio.LibroServicio;

/**
 *
 * @author User
 */
public class LibroControl {
 
    private final LibroServicio libroServicio = new LibroServicio();
    private final CategoriaServicio categoriaServicio = new CategoriaServicio();
    
    public Libro crear(String [] args){
        Categoria categoria = this.categoriaServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Libro libro = new Libro(Integer.valueOf(args[0]),Integer.valueOf(args[1]),args[2],categoria);
        this.libroServicio.crear(libro);
        return libro;
    }
    
    public Libro buscarBarco(String arg){
        return this.libroServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
      public List<Libro> listar(){
        return this.libroServicio.listar();
    }
}
