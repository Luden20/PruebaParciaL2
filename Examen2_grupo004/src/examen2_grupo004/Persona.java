package examen2_grupo004;
public class Persona {
    protected String Cedula;
    protected String Nombre;
    protected String Apellido;
    
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
