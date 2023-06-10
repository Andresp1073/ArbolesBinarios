/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fup;

/**
 *
 * @author pc
 */
public class Nodo {
    int dato;
    Nodo hijoizq;
    Nodo hijoder;

    public Nodo(int dato) {
        this.dato = dato;
        this.hijoizq = null;
        this.hijoder = null;
    }

    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(Nodo hijoizq) {
        this.hijoizq = hijoizq;
    }

    public Nodo getHijoder() {
        return hijoder;
    }

    public void setHijoder(Nodo hijoder) {
        this.hijoder = hijoder;
    }
    
    
}
