package pilas;

//Esta clase define la excepcion de cuando la pila quiere
//agregar mas elementos de los que puede.
public class DesbordamientoPila extends Exception{
    //Constructor por defecto, no lleva ningun parametro por se defecto
    public DesbordamientoPila(){
        super("No puedo apilar más elementos");
        
    }
    
}
