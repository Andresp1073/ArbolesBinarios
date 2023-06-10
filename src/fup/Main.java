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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        Nodo n1 = new Nodo(2);
        Nodo n2 = new Nodo(5);
        Nodo n3 = new Nodo(8);
        Nodo n4 = new Nodo(1);
        Nodo n5 = new Nodo(4);
        Nodo n6 = new Nodo(7);
        Nodo n7 = new Nodo(10);
        Nodo n8 = new Nodo(12);

        ab.setRaiz(n1);
        n1.setHijoizq(n2);
        n1.setHijoder(n3);
        n2.setHijoizq(n4);
        n2.setHijoder(n5);
        n4.setHijoder(n6);
        n3.setHijoder(n7);
        n7.setHijoizq(n8);

        System.out.println("Preorden");
        ab.preorden();
        System.out.println("\nPostorden");
        ab.postorden();
        System.out.println("\nInorden");
        ab.inorden();

        System.out.println("\n Resultado de busqueda del numero 4: " + ab.buscar(4));
        System.out.println("Resultado de busqueda del numero 9: " + ab.buscar(9));

        System.out.println(ab.contar());
        System.out.println(ab.calcularAltura());

        System.out.println(ab.buscarMayor());
    }

}
