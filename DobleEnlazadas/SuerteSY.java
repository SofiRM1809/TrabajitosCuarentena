
package suertesy;
    import java.io.*;
    import java.util.Random;
public class SuerteSY {    
    public static void main(String[] args) throws IOException{
         InputStreamReader r = new InputStreamReader(System.in);
         BufferedReader teclado =new BufferedReader(r);
         int N=0, op=0; 
         LDE L = new LDE (); 
         boolean ter = false, fin =false;
         String tmp = "";
         System.out.println("Bienvenido a este programa que calcula tu numero de la suerte");
         do{            
             do{
                  System.out.println("Por favor dame un número entero");
                  tmp=teclado.readLine();
                   try{
                        N = Integer.parseInt(tmp);                       
                        L.agregarFinal(new NodoLD <Integer> (N,1));
                        ter = true;
                    }catch(NumberFormatException error){                  
                        System.out.println("Error en su numero!");
                        ter=false;
                    }                                  
                }while(ter == false);   
             if(L.obtenerNoEl() >= 5){ 
                 System.out.println("¿Desea agragar otro número? \n 1.Si 2.No");
                 tmp = teclado.readLine();
                 op = Integer.parseInt(tmp);
                 if (op==1){
                     fin=false;
                 }
                 else{
                     fin=true;
                 }                
             }
         }while(fin != true);
         System.out.println("Tus números: ");
         System.out.println(L);
         System.out.println(L.toStringReverse());
         System.out.println("Procesando... ");
         ///////////////////////////////////////////
         int Suerte=0;
         Random rnd= new Random();
         boolean moneda = false;
         do{
            moneda = rnd.nextBoolean();
            //System.out.println(moneda);
           if(moneda)
            {
                L.eliminarIn();     
                //System.out.println(L);
            }else{
                L.eliminarFn();
                //System.out.println(L);
            }
         }while(L.obtenerNoEl()>1);                 
         
         System.out.println("Se lanzó la moneda 5 veces");
         System.out.println("Tú número de la suerte es: ");
         System.out.println(L);
         
    }
    
}
