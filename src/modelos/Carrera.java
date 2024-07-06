/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 * @Autor Justin Steven Detrinidad Sandigo
 * @author WINTERBOX400 <--Este es mi NickName
 */
public class Carrera {//InicioClaseCarrera
    //Inicio variables de instancia
    private int id;
    private String name;
    private String descripcion;
    private double precio;
    //Fin variables de instancia
    
    public Carrera() {//Contructor vacio
    }

    //Constructor con todas las instancias
    public Carrera(int id, String name, String descripcion, double precio) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Getter and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodo para mostrar los valores
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(" || ").append(name);
        sb.append(" || ").append(descripcion);
        sb.append(" || ").append(precio);
        sb.append('.');
        return sb.toString();
    }
}

