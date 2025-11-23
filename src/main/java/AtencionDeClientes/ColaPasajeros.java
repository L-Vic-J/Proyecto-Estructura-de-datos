/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtencionDeClientes;

import CompraTiquetes.Pasajero;

public class ColaPasajeros {
    private Nodo inicio;
    private Nodo fin;

    private static class Nodo {
        Pasajero dato;
        Nodo siguiente;

        Nodo(Pasajero p) {
            dato = p;
        }
    }

    public void encolar(Pasajero p) {
        Nodo nuevo = new Nodo(p);

        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Pasajero desencolar() {
        if (inicio == null) return null;
        Pasajero p = inicio.dato;
        inicio = inicio.siguiente;
        if (inicio == null) fin = null;
        return p;
    }

    public boolean estaVacia() {
        return inicio == null;
    }
    
}
