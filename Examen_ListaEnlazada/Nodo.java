package Listas_enlazadas;

public class Nodo {
    public Nodo Siguiente;
    private int Data;
    
    //constructor completo
    public Nodo(Nodo Sig, int Data){
        this.Siguiente = Sig;
        this.Data = Data;        
    }
    
    //Metodo de get
    public int obtenerData(){
        return Data;
    }
    //Metodo set
    public void colocarData(int Data){
        this.Data = Data;
    }
    public String toString(){
        return "Data:  "+Data;
    }
}
