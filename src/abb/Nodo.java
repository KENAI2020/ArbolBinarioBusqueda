package abb;

public class Nodo {
    private Nodo izquierdo;
    private int datos;
    private Nodo derecho;

    public Nodo(Nodo izquierdo, int datos, Nodo derecho) {
        this.setIzquierdo(izquierdo);
        this.setDatos(datos);
        this.setDerecho(derecho);
    }


    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
