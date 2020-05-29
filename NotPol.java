package colass;
import java.io.IOException;
import java.util.Scanner;

public class NotPol {
    public static void main (String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        ColasNenteros CI = new ColasNenteros(5);
        int operand =0,num;
        int opera = 0;
        String ope;
        System.out.println("Bienvenido a este programa");
        System.out.println("Escribe tu operacion...");
        ope=sc.nextLine();
       try{
       int contn = 0, suma = 0;
        if (ope.compareToIgnoreCase("+")==0){
            System.out.println("Escribe el operando 1:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            suma = operand + suma;
            System.out.println("Escribe el operando 2:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            suma = operand + suma;
            System.out.println("Escribe el operando 3:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            suma = operand + suma;
            System.out.println("Escribe el operando 4:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            suma = operand + suma;
            System.out.println("Escribe el operando 5:");
            operand = sc.nextInt();
            CI.encolar(operand);
            suma = operand + suma;
            System.out.println();
            System.out.println("El resultado es: "+suma);  
            System.out.print("Notación Polaca: "+"+ ");
            for (int i=0; i< 6; i++){
                num = CI.sacar();
                System.out.print(num+" ");
            }
            System.out.println();
        } 
        
        if (ope.compareTo("-") == 0){
            int resta = 0;
            //System.out.print("resta");
            System.out.println("Escribe el operando 1:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            resta = operand - resta;
            System.out.println("Escribe el operando 2:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            resta = resta - operand;
            System.out.println("Escribe el operando 3:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            resta = resta - operand;
            System.out.println("Escribe el operando 4:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            resta = resta - operand;
            System.out.println("Escribe el operando 5:");
            operand = sc.nextInt();
            CI.encolar(operand);
            resta = resta - operand;
            System.out.println();System.out.println("El resultado es: "+resta);  
            System.out.print("Notación Polaca: "+"* ");
            for (int i=0; i< 6; i++){
                num = CI.sacar();
                System.out.print(num+" ");
            }
            System.out.println();
        }
        if (ope.compareTo("*") == 0){
            double multi = 1;
            System.out.print("mult");
            System.out.println("Escribe el operando 1:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            multi = operand * multi;
            System.out.println("Escribe el operando 2:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            multi = multi * operand;
            System.out.println("Escribe el operando 3:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            multi = multi * operand;
            System.out.println("Escribe el operando 4:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            multi = multi * operand;
            System.out.println("Escribe el operando 5:");
            operand = sc.nextInt();
            CI.encolar(operand);
            multi = multi * operand;
            System.out.println();System.out.println("El resultado es: "+multi);  
            System.out.print("Notación Polaca: "+"* ");
            for (int i=0; i< 6; i++){
                num = CI.sacar();
                System.out.print(num+" ");
            }
            System.out.println();
        }
        if (ope.compareTo("/") == 0){
            double divi = 1;
            System.out.print("div");
            System.out.println("Escribe el operando 1:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            divi = operand / divi;
            System.out.println("Escribe el operando 2:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            divi = divi / operand;
            System.out.println("Escribe el operando 3:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            divi = divi / operand;
            System.out.println("Escribe el operando 4:");
            operand = sc.nextInt();
            CI.encolar(operand); 
            divi = divi / operand;
            System.out.println("Escribe el operando 5:");
            operand = sc.nextInt();
            CI.encolar(operand);
            divi = divi / operand;
            System.out.println();System.out.println("El resultado es: "+divi);  
            System.out.print("Notación Polaca: "+"* ");
            for (int i=0; i< 6; i++){
                num = CI.sacar();
                System.out.print(num+" ");
            }
            System.out.println();
        }
            }catch (ExcepcionColaLlena E){
                System.out.println(E.getMessage());
            }catch(ExcepcionColaVacia Err){
                System.out.println(Err.getMessage());
            }
    }
}
