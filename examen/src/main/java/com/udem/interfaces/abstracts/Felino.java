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
public abstract class Felino implements Animal {
    public int garras;
    public String cazar;

    public Felino(int garras, String cazar) {
        this.garras = garras;
        this.cazar = cazar;
    
    
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }

    public String getCazar() {
        return cazar;
    }

    public void setCazar(String cazar) {
        this.cazar = cazar;
    }
    
    
}
