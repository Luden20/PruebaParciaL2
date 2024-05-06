package examen2_grupo004;
import java.util.LinkedHashMap;
public class Equipo {
    private String NombreEquipo;
    private String Codigo;
    private LinkedHashMap<String,Entrenador> EntrenadoresPasados = new LinkedHashMap<String,Entrenador>();
    private Entrenador COACH;
    private LinkedHashMap<String,Deportista> MiembrosPasados = new LinkedHashMap<String,Deportista>();
    private LinkedHashMap<String,Deportista> MiembrosActuales = new LinkedHashMap<String,Deportista>();
    public Equipo(String Codigo,String NombreEquipo, Entrenador COACH){
        this.Codigo = Codigo;
        this.NombreEquipo = NombreEquipo;
        this.COACH = COACH;        
    }
    public void IngresarMiembro(Deportista Jugador){
        MiembrosActuales.put(Jugador.getCedula(), Jugador);
    }
    public void RetirarMiembro(Deportista Jugador){
        MiembrosActuales.remove(Jugador.getCedula());
        MiembrosPasados.put(Jugador.getCedula(),Jugador);
    }
    public void CambiarEntrenador(Entrenador COACH){
        EntrenadoresPasados.put(COACH.getCedula(),COACH);
        this.COACH = COACH;
    }
    public void 
}
