package colass;
public class ExcepcionColaVacia extends Exception{
     public ExcepcionColaVacia(){
        super("La Cola ya esta llena");
    }
}
