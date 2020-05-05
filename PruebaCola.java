package colass;

public class PruebaCola {
    public static void main(String[] args){
        int num = 0;
        ColasNenteros Cl = new ColasNenteros(3);
        try{
            System.out.println("Agregamos 1");
            Cl.encolar(1);
            System.out.println("Agregamos 2");
            Cl.encolar(2);
            /////Cl.encolar(3);
            /////Cl.encolar(4);
            //Sacar numero
            num = Cl.sacar();
            System.out.println("Sacamos "+num);
            //System.out.println(num);
            num = Cl.sacar();
            System.out.println("Sacamos "+num);
            /*num = Cl.sacar();
            System.out.println(num);
            num = Cl.sacar();
            System.out.println(num);*/
            Cl.encolar(10);
            System.out.println("Agregamos" +num);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
        
        
    }
}
