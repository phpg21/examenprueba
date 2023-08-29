/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udem.interfaces.abstracts;

import com.udem.interfaces.Animal;

/**
 *
 * @author b12s309
 */
public abstract class Canino implements Animal {
    public int colmillos;

    public Canino(int colmillos) {
        this.colmillos = colmillos;
    }

    public int getColmillos() {
        return colmillos;
    }

    public void setColmillos(int colmillos) {
        this.colmillos = colmillos;
    }
    
    
    
}
