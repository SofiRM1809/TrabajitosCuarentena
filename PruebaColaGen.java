package colass;
public class PruebaColaGen {
    public static void main(String args[]) throws ExcepcionColaLlena{
        ColasGenericas <Integer> CI = new ColasGenericas <> (10);
        try{
            CI.encolar(10);
            CI.encolar(11);
            CI.encolar(12);
            int V = CI.sacar();
            int Ve = CI.sacar();
            System.out.println(V);
            System.out.println(Ve);
        }catch (ExcepcionColaVacia E){
            System.out.println(E.getMessage());
        }catch (ExcepcionColaLlena E){
            System.out.println(E.getMessage());
        }
        
        ColasGenericas <String> CS = new ColasGenericas <> (10);
        try{
            CS.encolar("!!!SI SE");
            CS.encolar("PUEDE");
            CS.encolar("PROGRAMAR!!!");
            String S = CS.sacar();
            System.out.println(S);
            String SO = CS.sacar();
            System.out.println(SO);
            String SOO = CS.sacar();
            System.out.println(SOO);
        }catch (ExcepcionColaVacia E){
            System.out.println(E.getMessage());
        }catch (ExcepcionColaLlena E){
            System.out.println(E.getMessage());
        }

        ColasGenericas<Estudiante> CE = new ColasGenericas<>(10);
        try{
            Estudiante e1, e2;
            e1 = new Estudiante( "18590247","Sofia Ramirez","ISC", (byte)4);
            e2 = new Estudiante("18590242","Paola","ISC",(byte)4);
            CE.encolar(e1);
            CE.encolar(e2);
            Estudiante ref = CE.sacar();
            System.out.println(ref);
            Estudiante refe = CE.sacar();
            System.out.println(refe);
        }catch (ExcepcionColaVacia E){
            System.out.println(E.getMessage());
        }catch (ExcepcionColaLlena E){
            System.out.println(E.getMessage());
        }
    }
}
