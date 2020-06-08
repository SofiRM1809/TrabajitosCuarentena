package Listas_enlazadas;
import java.io.*;
public class PruebaNodo {
    public static void main(String [] args) throws IOException{
        Nodos N1= new Nodos(null,"A");
        Nodos N2= new Nodos(null,"B");
        Nodos N3= new Nodos(null,"C");
        //Funcionamineto de la Referencia
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
        //Enlazar Nodo1 al Nodo2
        System.out.println("#####################");
        N1.Siguiente=N2;
        System.out.println(N1.Siguiente);
        N2.Siguiente=N3;
        System.out.println(N2.Siguiente);
        /////////////////////////////////
        System.out.println("###############");
        System.out.println(N1);
        System.out.println(N1.Siguiente);
        System.out.println(N1.Siguiente.Siguiente);
        ////////////////////////////////
        N2 = null;
        N3 = null;
        System.out.println("----------------------");
        System.out.println(N1);
        System.out.println(N1.Siguiente);
        System.out.println(N1.Siguiente.Siguiente);
        /////////////////////////
        System.out.println("---------------------");
         Nodos ref = N1;   
            while (ref != null){
              System.out.println("Valor "+ref);
                ref = ref.Siguiente;
        }
              
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader teclado =new BufferedReader(r);
            Nodos Inicial = null;
            Nodos SigNod = null; 
            Nodos Actual = null;
            int A=0;
            String C="";
            System.out.println("Bienvenido, vamos a gurdar cadenas de Texto");
            do{
                System.out.println("Ingresa una cadena");
                C = teclado.readLine(); 
                if (Inicial == null){
                    Inicial = new Nodos (null,C);
                    Actual =Inicial;
                }else{
                    SigNod = new Nodos (null,C); 
                    Actual.Siguiente =SigNod;
                    Actual = SigNod;
                }               
                A++;                   
        }while(A < 10);
            ref = Inicial;
            while (ref != null){
              System.out.println("Valor "+ref);
                ref = ref.Siguiente;
            }
    }
}