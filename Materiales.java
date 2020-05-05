
package pilas;
import java.util.Random;
public class Materiales {
    public static void main(String args[]) throws SubdesbordamientoPila, DesbordamientoPila{
        Pilas Madera = new Pilas(30);
        Pilas Resina = new Pilas(30);
        Pilas Hilo = new Pilas(30);
         int numero;
         //int conM=0, conR=0, conH=0;
         boolean Maderita = false;
         boolean Bastoncito = false;
         boolean Cuerdita = false;
                
        for (int i=0; i<=30; i++){
            numero = (int)(Math.random()*3);
           
                if (numero == 0){
                    Madera.apilar(numero);
                    //System.out.println(0);
                    //conM++;
                } else if (numero == 1){
                    Resina.apilar(numero);
                    //System.out.println(1);
                    //conR++;
                } else if (numero == 2){
                    Hilo.apilar(numero);
                    //System.out.println(2);
                    //conH++;
                    }
                
        }
        /*
        System.out.println("");
        System.out.println("Madera  "+conM);
        System.out.println("Resina  "+conR);
        System.out.println("Hilo  "+conH);
        System.out.println("");
        */
         try{
            if (Madera.cantidad() >= 4){
                Madera.sacar();
                Madera.sacar();
                Madera.sacar();
                Madera.sacar();
                System.out.println("!!!MESA ADQUIRIDA!!!");
                Maderita = true;

              if (Maderita = true || Madera.cantidad() >= 2){
                Madera.sacar();
                Madera.sacar();
                System.out.println("!!!BASTON ADQUIRIDO!!!");
                Bastoncito = true;
              }               
                        
              if (Maderita = true || Hilo.cantidad() >= 4 || Resina.cantidad() >= 1){
                Hilo.sacar();
                Hilo.sacar();
                Hilo.sacar();
                Hilo.sacar();
                Resina.sacar();
                System.out.println("!!!CUERDA ADQUIRIDA!!!");
                Cuerdita = true;
              }
                        
              if ((Maderita == true || Bastoncito == true)|| Cuerdita == true){
                System.out.println("!!!CAÑA DE PESCAR ADQUIRIDA!!!");
              }
                        
              if (Maderita == true || Madera.cantidad() >= 5){
                System.out.println("!!!BARCO ADQUIRIDO!!!");
              }
          }
        }catch(SubdesbordamientoPila err){
                System.out.println(err.getMessage());
            }
    }
}
/*

* Para hacer una mesa necesitas 4 bloques  de madera.
* Para hacer un barco necesitas 1 mesa y 5 bloques de madera.
* Para hacer un baston necesitas 1 mesa y 2 bloques de madera.
* Para hacer una caña de pescar necesitas 1 mesa, 1 baston y 1 cuerda.
* Para hacer una cuerda necesitas 4 hilos, una porcion de resina y una mesa.

I. Si la PilaMadera tiene mas de 4 bloques, Retire 4 bloques
de PilaMadera e imprima "Mesa Adquidida"

II. Si la mesa fue adquirida y aun hay 2 bloques de madera en
su pila retire eso 2 e imprima "Baston Adquirido"

III. Si la mesa fue adquirida, hay 4 hilos en su pila y al menos
hay 1 porcion de resina en su pila. Retire los 4 hilos y la
porcion de resina de sus respectivas pila e imprima "Cuerda Adquirida"

IV. Si la mesa fue adquirida, hay un baston y una cuerda 
"Imprima caña de pescar adquirida"

V. Si la mesa fue adquirida y aun quedan  5 bloques de madera
Retire los 5 bloques de su pila e imprima "Barco Adquirido"
*/