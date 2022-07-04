package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    private void insertar(Nodo padre, Nodo hijo, int dato){
        if (hijo == null){
            Nodo nuevo = new Nodo ( null, dato, null);
            if (dato >= padre.getDatos()){
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }
        }else {
            if (dato >= padre.getDatos()){
                insertar(hijo, hijo.getDerecho(), dato);
            } else {
                insertar(hijo, hijo.getIzquierdo(), dato);
            }

        }
    }

    public void insertar( int dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null, dato, null);
            raiz = nuevo;
        }else {
            if (dato >= raiz.getDatos()){
                insertar(raiz, raiz.getDerecho(), dato);
            }else {
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }

    }

    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){

        }else {
           mostrarInOrden(nodo.getIzquierdo());
           System.out.print(nodo.getDatos() + "  ");
           mostrarInOrden(nodo.getDerecho());
        }
    }

    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
