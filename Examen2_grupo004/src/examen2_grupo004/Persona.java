package examen2_grupo004;
public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    
    public Persona(String Cedula, String Nombre, String Apellido){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public String getCedula(){
        return this.Cedula;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getApellido(){
        return this.Apellido;
    }
}
