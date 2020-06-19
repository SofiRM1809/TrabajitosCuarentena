
package suertesy;

public class NodoLD <T> {
    public NodoLD Anterior;
    public NodoLD Siguiente;
    private int Tipo; 
    private T Data; 
    /*
        * Si tipo = 1 entonces es un entero
        * Si Tipo = 2 entonces es un double
        * Si Tipo = 3 entonces es un String
        * Si Tipo = 4 entonces es un float
        * Si Tipo = 5 entonces es un boolesn
        * Si Tipo = 6 entonces es un char
        * Si Tipo = 7 entonces es un short
        * Si Tipo = 8 entonces es un long
        * Si Tipo > 10 entonces es personalizado
        
    */
   public NodoLD (T Data, int Tipo){
     this.Tipo = Tipo;
     this.Data=Data;
     Anterior = null;
     Siguiente = null;
}
    public T obtenerData (){
        return Data;
    }
    public void colocarData(T Data){
        this.Data=Data;
    }
    public String toString(){
        return ""+Data; 
    }
    public int obtenerTipo(){
        return Tipo;
    }
}
