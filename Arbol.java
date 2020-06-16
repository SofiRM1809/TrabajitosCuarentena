package arboles;
public class Arbol {
    private Nodo raiz;
    private String Recorrido;
    
    public Arbol(){
        raiz = null;
        Recorrido = "";
    }
    //Metodo a envolver
    private void insertarDesde(Nodo noda, Nodo Desde){
       
        if(Desde.obtenerData() == noda.obtenerData()){
            return;
        }
        if(noda.obtenerData() > Desde.obtenerData()){
            //colocar a la derecha
            if(Desde.Der == null){
                Desde.Der = noda;
                return;
            }else{
                //11
                insertarDesde(noda, Desde.Der);
                return;
            }
        }else{
            //Colocar a la izquierda
            if(Desde.Izq == null){
                Desde.Izq = noda;
                return;
            }else{
                //La primera vez vale el nodo con 5
                insertarDesde(noda, Desde.Izq);
                return;
            }
        }
    }
    
    //Metodo que envuelve (wrapper)
    public void insertar(Nodo noda){
         //Esto pasa cuando la raiz es nula, es decir es el primer elemento
        if (raiz == null){
            raiz = noda;
            return; //termina el metodo
        }
        ////////////////////
        //Si llegó aqui la raiz no es nula
        insertarDesde(noda, raiz);
        
    }
    
    public boolean buscar(Nodo noba){
        return buscarDesde(noba, raiz);
    }
    
    private boolean buscarDesde (Nodo noba, Nodo Desde){
        if(Desde == null){
            return false;
        }
        //Este caso es cuando el nodo es el encontrado
         if(Desde.obtenerData() == noba.obtenerData()){
            return true;
        }
        
        if(noba.obtenerData() > Desde.obtenerData()){
            //derecha
            return buscarDesde(noba, Desde.Der);
        }else{
            //izquierda
            return buscarDesde(noba, Desde.Izq);
        }
    }
    
    public String toStringPreOrder(){
        Recorrido = "";
        ////////////////////////////////////////.
        preOrderDesde(raiz);
        ////////////////////////////////////////
        return Recorrido;
    }
    
    //VID
    private void preOrderDesde(Nodo Desde){
        if (Desde == null){
            return;
        }
        //Valor
        Recorrido = Recorrido + " "+Desde;
        //Recorrido = Recorrido + " "+Desde.obtenerData();
        //IZQ
        preOrderDesde(Desde.Izq);
        //DER
        preOrderDesde(Desde.Der);
    }
    
    public String toStringinOrder(){
        Recorrido = "";
        ////////////////////////////////////////.
        inOrderDesde(raiz);
        ////////////////////////////////////////
        return Recorrido;
    }
    //IVD
    private void inOrderDesde(Nodo Desde){
        if (Desde == null){
            return;
        }
        //IZQ
        inOrderDesde(Desde.Izq);
        //Valor
        Recorrido = Recorrido + " "+ Desde;
        //DER
        inOrderDesde(Desde.Der);
    }
    
    public String toStringpostOrder(){
        Recorrido = "";
        ////////////////////////////////////////.
        postOrderDesde(raiz);
        ////////////////////////////////////////
        return Recorrido;
    }
    
    //IDV
    private void postOrderDesde(Nodo Desde){
        if (Desde == null){
            return;
        }
        //IZQ
        postOrderDesde(Desde.Izq);
        //DER
        postOrderDesde(Desde.Der);
        //Valor
        Recorrido = Recorrido + " "+ Desde;
    }
}
