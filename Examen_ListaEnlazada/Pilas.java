package Listas_enlazadas;
import java.util.Random;
public class Pilas {
    private ListaEnlazada Esquina;
    private int indice;
    private Nodo Inicio;
    private Nodo Fin;
    private int NoElementos;
    int length;
    //Constructor completo
    public Pilas (int n){
        //n es la cantidad de elementos que puede guardad la pila.
        //Esquina = new int [n];
        NoElementos = 0;
        Esquina = new ListaEnlazada();
    }
    
    public int cantidad(){
        return NoElementos;
    }
    
    public void apilar (int num)throws DesbordamientoPila{
        /*if (this.llena()){
            throw new DesbordamientoPila();
        }*/
        //Random num = new Random();
        Esquina.agregarAlFin(new Nodo(null, num));
        //Esquina = numero;
        NoElementos++;
        
    }
    
    public int sacar() throws SubdesbordamientoPila{
        if (this.vacia()){
            throw new SubdesbordamientoPila();
        }
        int esacar;
        esacar = NoElementos-1;
        NoElementos--;
        //indice--;
        //esacar = Esquina[indice]; 
        //las ultimas 2 lineas sustituyen a las dos ultimas.
        return esacar; 
    }
    
    //Evaluar cuando la pila esta vacia
    public boolean vacia(){
        if (NoElementos == 0){
            return true;
        }
        return false;
    }
    /*
    //Evaluar cuando la pila esta llena
    public boolean llena(){
        if (NoElementos == Esquina.length){
            return true;
        }
        return false;
    }
    
    public int capacidad (){
        return Esquina.length;
    }
*/

}
