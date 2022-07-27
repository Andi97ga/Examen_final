/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

/**
 *
 * @author User
 */
public class LibroServicio implements ILibroServicio{
     private final List<Libro> libroList = new ArrayList<>();
    
    @Override
    public Libro crear(Libro libro) {
        this.libroList.add(libro);
        return libro;
    }

    @Override
    public List<Libro> listar() {
        return this.libroList;
    }

    @Override
    public Libro buscarPorCodigo(int codigoLibro) {
        Libro libro=null;
        for(var l:this.libroList){
            if(codigoLibro==l.getCodigo()){
                libro=l;
                break;
            }
        }
        return libro;
    }

    @Override
    public int buscarPosicion(Libro libro) {
        int posicion=-1;
        for(var l:this.libroList){
            posicion++;
            if(l.getCodigo()==libro.getCodigo()){
                break;
            }
        }
        return posicion;
    }
}
