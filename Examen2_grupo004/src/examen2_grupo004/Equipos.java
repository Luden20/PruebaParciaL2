package examen2_grupo004;
import java.util.LinkedHashMap;
public class Equipos {
    private String NombreEquipo;
    private String Codigo;
    private LinkedHashMap<String,Entrenador> EntrenadorPasados = new LinkedHashMap<String,Entrenador>();
    private Entrenador COACH;
    private LinkedHashMap<String,Deportista> MiembrosPasados = new LinkedHashMap<String,Deportista>();
    private LinkedHashMap<String,Deportista> MiembrosActuales = new LinkedHashMap<String,Deportista>();
    public Equipos(String Codigo,String NombreEquipo, Entrenador COACH){
        this.Codigo = Codigo;
        this.NombreEquipo = NombreEquipo;
        this.COACH = COACH;        
    }
    /*
    public void IngresarMiembro(Deportista Jugador){
        MiembrosActuales.put(Jugador.getCedula, Jugador);
    }
    public void RetirarMiembro(Deportista Jugador){
        MiembrosActuales.remove(Jugador.getCedula());
    }*/
}
