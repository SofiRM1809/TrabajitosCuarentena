package Listas_enlazadas;

public class SubdesbordamientoPila extends Exception {
    public SubdesbordamientoPila (){
        super("No puedo sacar elementos de una pila vacia");
    }
}
