/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GANTT;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Tarea implements Serializable {
    private String nom_tasca;
    private String descripcion;
    private int dias;
    
    public Tarea(){
    
    }

    public Tarea(String nom_tasca, String descripcion, int dias) {
        this.nom_tasca = nom_tasca;
        this.descripcion = descripcion;
        this.dias = dias;
    }
    
    
    
    public String getNom() {
        return nom_tasca;
    }

    public void setNom(String nom_tasca) {
        this.nom_tasca = nom_tasca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }


    @Override
    public String toString() {
        return "Tarea{" + "nom_tasca=" + nom_tasca + ", descripcion=" + descripcion + ", dias=" + dias + '}';
    }
    
    
}
