/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Libro {
    private int codigo;
    private int year;
    private String nombre;
    private Categoria catecogria;

    public Libro(int codigo, int year, String nombre, Categoria catecogria) {
        this.codigo = codigo;
        this.year = year;
        this.nombre = nombre;
        this.catecogria = catecogria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCatecogria() {
        return catecogria;
    }

    public void setCatecogria(Categoria catecogria) {
        this.catecogria = catecogria;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", year=" + year + ", nombre=" + nombre + ", catecogria=" + catecogria + '}';
    }
    
    
    
}
