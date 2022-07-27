/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Categoria;

/**
 *
 * @author User
 */
public interface ICategoriaServicio {
    public Categoria crear(Categoria categoria);
    public Categoria buscarPorCodigo(int codigoCategoria);
    public List<Categoria> listar();
}
