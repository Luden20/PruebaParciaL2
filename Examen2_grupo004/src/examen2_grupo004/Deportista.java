package examen2_grupo004;
import java.util.LinkedHashMap;
import java.util.Stack;
public class Deportista extends Persona {
    private String Disciplina;
    private String Nivel;
    private LinkedHashMap<String,Equipo> ListaDEquipoPasados = new LinkedHashMap<String,Equipo>();
    private Stack<String> Movimientos = new Stack<String>();
    private Equipo Actual;
    public Deportista(String Cedula, String Nombre, String Apellido,String Disciplina,String Nivel,Equipo Actual)
    {
        super(Cedula,Nombre,Apellido);
        this.Disciplina=Disciplina;
        this.Nivel=Nivel;
        this.Actual=Actual;
    }
    public void CambioEquipo(Equipo Actual){
        this.Movimientos.add("Del equipo "+this.Actual.Nombre()+" se mueve a "+ Actual.Nombre());
    }
    public String getCedula()
    {
        return super.getCedula();
    }
    
    public String getNombre()
    {
        return super.getNombre();
    }
    
    public String getApellido()
    {
        return super.getApellido();
    }
    
    public String getDisciplina()
    {
        return this.Disciplina;
    }
    public String getNivel()
    {
        return this.Nivel;
    }
    public Object[]getInfo()
    {
        return new Object[]{super.getCedula(),super.getApellido(),super.getNombre(),getDisciplina(),getNivel()};
    }
    public Stack getMovimientos(){
        return this.Movimientos;
    }
    
}
