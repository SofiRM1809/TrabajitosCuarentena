package colass;

public class ColasGenericas <T>{
    private T Esquina[];
    private int Frente;
    private int Siguiente;
    
    @SuppressWarnings("uncheked")
    
    public ColasGenericas(int N){
        Esquina = (T[])new Object [N];
        //Posicion inicial de Siguiente
        Siguiente = 0;
        //Posicion inicial de Frente
        Frente = -1;
    }
    
    public boolean colaLlena(){
        if(Siguiente == Esquina.length){
            return true;
        }else{
            return false;
        }
    }
    
    public void encolar(T Num) throws ExcepcionColaLlena{
        //Si la cola esta vacia
        //reset
        if (colaVacia()){
            // System.out.println("Reset");
            Frente = -1;
            Siguiente = 0;
        }
        if (colaLlena()){
            throw new ExcepcionColaLlena();
        }
        Esquina[Siguiente] = Num;
        Siguiente++;
        //Cuando apenas agregue un elemento
        if(Siguiente == 1){
            Frente = 0;
        }
    }
    
    public boolean colaVacia(){
        if (Frente == Siguiente){
            return true;
        }else if (Frente == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public T sacar() throws ExcepcionColaVacia{
        if (colaVacia()){
            throw new ExcepcionColaVacia();
        }
        T valor = Esquina[Frente];
        Frente++;
        return valor;
    }
}
