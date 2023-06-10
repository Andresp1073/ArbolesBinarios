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
public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void preorden() {
        preorden(this.raiz);

    }

    private void preorden(Nodo n) {
        if (n != null) {
            System.out.print("  " + n.getDato());
            preorden(n.getHijoizq());
            preorden(n.getHijoder());
        }

    }

    public void postorden() {
        postorden(this.raiz);

    }

    private void postorden(Nodo n) {
        if (n != null) {

            postorden(n.getHijoizq());
            postorden(n.getHijoder());
            System.out.print("  " + n.getDato());
        }

    }

    public void inorden() {
        inorden(this.raiz);

    }

    private void inorden(Nodo n) {
        if (n != null) {

            inorden(n.getHijoizq());
            System.out.print("  " + n.getDato());
            inorden(n.getHijoder());

        }

    }

    public String buscar(int nro) {
        if (buscar(this.raiz, nro)) {
            return "Encontrado";
        }
        return "No encontrado";
    }

    private boolean buscar(Nodo n, int nro) {
        if (n != null) {
            if (n.getDato() == nro) {
                return true;
            }
            boolean ok1 = buscar(n.getHijoizq(), nro);
            boolean ok2 = buscar(n.getHijoder(), nro);
            if (ok1 || ok2) {
                return true;
            }
        }
        return false;
    }

    //contar los nodos de un arbol
    public String contar() {
        int cant = contar(this.raiz);
        return "El arbol tiene " + cant + " Nodos";
    }

    private int contar(Nodo n) {
        if (n == null) {
            return 0;
        }
        int c1 = contar(n.getHijoizq());
        int c2 = contar(n.getHijoder());
        int c3 = c1 + c2 + 1;
        return c3;
    }

    public String calcularAltura() {
        int alt = calcularAltura(this.raiz);
        return "La alatura del arbol es " + alt;
    }

    private int calcularAltura(Nodo n) {
        if (n == null) {
            return 0;
        }
        int h1 = calcularAltura(n.getHijoizq());
        int h2 = calcularAltura(n.getHijoder());
        if (h1 > h2) {
            return h1 + 1;
        }
        return h2 + 1;

    }

    public String buscarMayor() {
        int may = buscarMayor(this.raiz);
        return "El mayor valor es " + may;
    }

    private int buscarMayor(Nodo n) {
        if (n == null) {
            return 0;
        }
        int m1 = buscarMayor(n.getHijoizq());
        int m2 = buscarMayor(n.getHijoder());
        int m3 = n.getDato();
        if (m1 >= m2 && m1 >= m3) {
            return m1;
        }
        if (m2 >= m2 && m2 >= m3) {
            return m2;
        }
        return m3;

    }

}
