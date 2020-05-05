
package colass;

public class Estudiante {
    private String Nocontrol;
    private String Nombre;
    public String Carrera;
    private byte Semestre;
    
    //Constructor completo
    public Estudiante(String Nocontrol, String Nombre, String Carrera, byte Semestre){
        this.Nocontrol = Nocontrol;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }
    
    
    public String obtenerNocontrol() {
        return this.Nocontrol;
    }
    
    public String obtenerNombre (){
        return this.Nombre;
    }
    
    public byte obtenerSemestre (){
        return this.Semestre;
    }
    
    //Incrementar semestre
    public void incrementarSemestre(){
        this.Semestre++;
    }    
   
    /////////////////////////////////
    //Constructor copia
    public Estudiante (Estudiante Est){
        this(
           Est.obtenerNocontrol(),
           Est.obtenerNombre(),
           Est.Carrera,
           Est.obtenerSemestre()
        ); //Se manda llamar al constructor completo      
    }
    
    ///ToString
    public String toString (){
        String tmp = "";
        tmp = "Nombre "+Nombre+ " ";
        tmp += "NoControl "+Nocontrol+ " ";
        tmp += "Carrera "+Carrera + " ";
        tmp += "Semestre "+Carrera+ " ";
        return tmp;
    }
    
    public int comparteTo(Estudiante Obj){
        int comp;
        comp = Nombre.compareTo(Obj.obtenerNombre());
        if (comp == 0){
            return 0;
        }else if(comp < 0) {
            //Primer nombre es menor
            return -1;
        }else {
            //Primer nombre es mayor
            return 1;
        }
    }
}
