
package suertesy;

public class LDE {
    private NodoLD Inicio ;
    private NodoLD Fin;
    private int NEl;
 public  LDE() {
    Inicio =null;
    Fin=null;
    NEl=0;
}
  public int obtenerNoEl(){
     return NEl;   
 }
 public void agregarInicio(NodoLD AG){
     if (Inicio == null){
         Inicio = AG;
         Fin= AG;
         NEl++;
     }else{
         AG.Siguiente = Inicio;
         Inicio.Anterior = AG;
         Inicio = AG;
         NEl++;
     }
 }

public void agregarFinal(NodoLD AG){
    //Caso cuando no tengo nodos
    if( Fin == null){
        Fin =AG;
        Inicio = AG;
        NEl++;
    }
    else{
        //Mi lista al menos tiene un nodo
        Fin.Siguiente = AG;
        AG.Anterior = Fin;
        Fin =AG;
        NEl++;
    }    
}
 
public boolean Buscar( NodoLD AB){
    //Nodo no es nulo
    if(AB != null){
        if(Inicio != null){
            if(Inicio.obtenerData() == AB.obtenerData()){
                return true;
            }
        }
        if(Fin != null){
            if(Fin.obtenerData() == AB.obtenerData()){
                return true;
            }
        }
        //Si elemento a busacar no esta en el inicio ni en el fin
        NodoLD ref = Inicio;
        boolean Encontrado =false;
        while (ref != null && !Encontrado ){
            //Si esto es cierto el nodo fue encontrado
            if( ref.obtenerData() == AB.obtenerData()){             
                Encontrado = true;
            }
            ref = ref.Siguiente;
        }
        return Encontrado; //Si AB es nulo no tengo nada que buscar
    }
    return false;
}

public NodoLD eliminarIn(){
    if(Inicio == null){
        return null;
    }else{
        NodoLD Ret = Inicio;
        Inicio = Inicio.Siguiente;
        Inicio.Anterior =null;
        Ret.Siguiente = null;
        Ret.Anterior = null;
        NEl--;
        return Ret;
    }
}

public NodoLD eliminarFn(){
    if ( Fin == null){
        return null;
    }else{             
        NodoLD eliminar = Fin;
        Fin = Fin.Anterior;
        Fin.Siguiente=null;
        
        eliminar.Siguiente = null;
        eliminar.Anterior = null;
        
        NEl--;
        return eliminar;
    }
}

public NodoLD eliminarPNodo(NodoLD AB ){
    if(AB == null){
        return null;
    }
    if ( Fin == null){
        return null;
    }else{
        if(Inicio.obtenerData() ==AB.obtenerData()){   
            return this.eliminarIn();
        }
         if(Fin.obtenerData() ==AB.obtenerData()){   
            return this.eliminarFn();
        }
        NodoLD refR = Inicio;
        NodoLD refA = null;
        NodoLD refEl = null;
        boolean Encontrado = false;
        while(refR != null && !Encontrado){
            if(refR.obtenerData() == AB.obtenerData()){            
                Encontrado = true;
                refEl = refR; 
                NEl--;
            }
            refR = refR.Siguiente;
         }
        if(Encontrado){
            refR = refEl.Anterior;
            refA = refEl.Siguiente;
            refR.Siguiente =refA;
            refA.Anterior = refR;
            refEl.Siguiente = null;
            refEl.Anterior = null;
        }
        return refEl;
   }  
} 
 public NodoLD porIndice(int p){
      if (Inicio == null){
          return null;
      }
      if (p >= NEl){
          return null;
      }
      if (p < 0){
          return null;
      }
      int i = 0;
      NodoLD ref = Inicio;
      for(; i < p; i++){
          ref = ref.Siguiente;
      }
      switch(ref.obtenerTipo()){
          case 1:
              ref = new NodoLD<Integer>((int)ref.obtenerData(),1);
          break;
          case 2:
              ref = new NodoLD<Double>((double)ref.obtenerData(),2);
          break;
          case 3:
              ref = new NodoLD<String>("" + ref.obtenerData(),3);
          break;
          case 4:
              ref = new NodoLD<Float>((float)ref.obtenerData(),4);
          break;
          case 5:
              ref = new NodoLD<Boolean>((boolean)ref.obtenerData(),5);
          break;
          case 6:
              ref = new NodoLD<Character>((char)ref.obtenerData(),6);
          break;
          case 7:
              ref = new NodoLD<Short>((short)ref.obtenerData(),1);
          break;
          case 8:
              ref = new NodoLD<Long>((long)ref.obtenerData(),1);
          break;
          default:
             // ref = new NodoLD(ref.obtenerData(),ref.obtenerTipo());
      }
      
      return ref;
 }

  public String toString(){
     String tmp = "";
     if(Inicio == null){
         return "";
     }
     NodoLD ref = Inicio;
     while(ref != null){
         tmp = tmp +" "+ ref.toString();
         ref = ref.Siguiente;
     }
     return tmp;
 }
   public String toStringReverse(){
     String tmp = "";
     if(Fin == null){
         return "";
     }
     NodoLD ref = Fin;
     while(ref != null){
         tmp = tmp +" "+ ref.toString();
         ref = ref.Anterior;
     }
     return tmp;
 }
}
