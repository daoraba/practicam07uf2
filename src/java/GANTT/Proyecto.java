/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GANTT;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Daniel
 */
public class Proyecto implements Serializable {
    
    private static final AtomicInteger count = new AtomicInteger(0);
    private int codi;
    private String fecha_inicio;
    private String fecha_final;
    private String nom;

    
    public Proyecto(){
    
    }
    
    public Proyecto(String nom, String fecha_inicio, String fecha_final) {
        this.codi = count.incrementAndGet();
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.nom = nom;
    }
    
    
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + ", nom=" + nom + '}';
    }

    
}
