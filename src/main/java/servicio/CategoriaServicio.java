/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author User
 */
public class CategoriaServicio implements ICategoriaServicio {
    private final List<Categoria> categoriaList = new ArrayList<>();
    
    @Override
    public Categoria crear(Categoria categoria) {
        this.categoriaList.add(categoria);
        return categoria;
    }

    @Override
    public List<Categoria> listar() {
        return this.categoriaList;
    }

    @Override
    public Categoria buscarPorCodigo(int codigoCategoria) {
        Categoria categoria=null;
        for(var c:this.categoriaList){
            if(codigoCategoria==c.getCodigo()){
                categoria=c;
                break;
            }
        }
        return categoria; 
    }
}
