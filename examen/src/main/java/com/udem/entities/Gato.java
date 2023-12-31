/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udem.interfaces.entities;

import com.udem.interfaces.abstracts.Felino;

/**
 *
 * @author b12s309
 */
public class Gato extends Felino {
    private int id;
    private String nombre;
    private int edad;
    private String dueño;

    public Gato(int id, String nombre, int edad, String dueño, int garras, String cazar) {
        super(garras, cazar);
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String mover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
