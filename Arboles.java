package arboles;
public class Arboles {
    public static void main(String[] args) {
        Arbol bonsai = new Arbol();
        bonsai.insertar(new Nodo(10));
        if(bonsai.buscar(new Nodo(10))){
            System.out.println("El 10 si se encuentra");
        }
        /////////////////////////////////////////////////
        Nodo AB;
        /////////////////////////////////////////////////
        AB = new Nodo(0);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        /////////////////////////////////////////////////
        AB = new Nodo(5);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(15);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(4);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(16);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(8);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(11);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        AB = new Nodo(1111);
        //bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("El "+AB+" si se encuentra");
        }else{
            System.out.println("El "+AB+" no se encuentra");
        }
        
        System.out.println("Arbol en PreOrder...");
        System.out.println(bonsai.toStringPreOrder());
        System.out.println("Arbol en inOrder...");
        System.out.println(bonsai.toStringinOrder());
        System.out.println("Arbol en postOrder...");
        System.out.println(bonsai.toStringpostOrder());
    }
    
}
