package Listas_enlazadas;
public class Nodos {
    public Nodos Siguiente;
    private String Data;
    
   public Nodos (Nodos Sig, String Data){
     this.Siguiente=Sig;
     this.Data=Data;
}
    public String obtenerData (){
        return Data;
    }
    public void colocarData(String Data){
        this.Data=Data;
    }
    public String toString(){
        return "Data= "+Data; 
    }
}
