package colass;


public class ExcepcionColaLlena extends Exception {
    public ExcepcionColaLlena(){
        super("La Cola ya esta llena");
    }
}
