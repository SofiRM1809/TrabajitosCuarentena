package pilas;
import java.util.Random;
public class Pilas {
    protected int Esquina[];
    private int indice;
    int length;
    //Constructor completo
    public Pilas (int n){
        //n es la cantidad de elementos que puede guardad la pila.
        Esquina = new int [n];
        indice = 0;
    }
    
    public int cantidad(){
        return indice-1;
    }
    
    public void apilar (int num)throws DesbordamientoPila{
        if (this.llena()){
            throw new DesbordamientoPila();
        }
        
        //Random num = new Random();
        
        Esquina[indice] = num;
        indice++;
        
    }
    
    public int sacar() throws SubdesbordamientoPila{
        if (this.vacia()){
            throw new SubdesbordamientoPila();
        }
        int esacar;
        esacar = Esquina[indice-1];
        indice--;
        //indice--;
        //esacar = Esquina[indice]; 
        //las ultimas 2 lineas sustituyen a las dos ultimas.
        return esacar; 
    }
    
    //Evaluar cuando la pila esta vacia
    public boolean vacia(){
        if (indice == 0){
            return true;
        }
        return false;
    }
    
    //Evaluar cuando la pila esta llena
    public boolean llena(){
        if (indice == Esquina.length){
            return true;
        }
        return false;
    }
    
    public int capacidad (){
        return Esquina.length;
    }
}
