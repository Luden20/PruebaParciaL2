    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_grupo004;

/**
 *
 * @author polip
 */
public class Deportista extends Persona {
    private String Disciplina;
    private String Nivel;
    
    public Deportista(String Cedula, String Nombre, String Apellido,String Disciplina,String Nivel)
    {
        super(Cedula,Nombre,Apellido);
        this.Disciplina=Disciplina;
        this.Nivel=Nivel;
    }
    public String getDisciplina()
    {
        return Disciplina;
    }
    public String getNivel()
    {
        return Nivel;
    }
    public Object[]getInfo()
    {
        return new Object[]{};
    }
    
    
}
