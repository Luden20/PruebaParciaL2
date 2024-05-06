package examen2_grupo004;
import java.util.LinkedHashMap;
public class Entrenador extends Persona{
    private String Especializacion;
    private String Filial;
    private LinkedHashMap<String,Entrenador> ListaEntrenadores = new LinkedHashMap<String,Entrenador>();
    public Entrenador(String Cedula, String Nombre, String Apellido, String Especializacion, String Filial){
          super(Cedula,Nombre,Apellido);
          this.Especializacion = Especializacion;
          this.Filial = Filial;
    }
    public String getCedula(){
        return super.getCedula();
    }
    public String getNombre(){
        return super.getNombre();
    }
    public String getApellido(){
        return super.getApellido();
    }
    public String getEspecializacion(){
        return this.Especializacion;
    }
    public String getFilial(){
        return this.Filial;
    }
    public void IngresoRegistro(Entrenador Entrenadores){ 
        ListaEntrenadores.put(Entrenadores.getCedula(),Entrenadores);
    }
    public LinkedHashMap<String,Entrenador> getListaEntrenadores(){
        return this.ListaEntrenadores;
    }
}
