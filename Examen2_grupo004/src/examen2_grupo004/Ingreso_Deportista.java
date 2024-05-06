package examen2_grupo004;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
public class Ingreso_Deportista extends javax.swing.JFrame {
    private LinkedHashMap<String,Equipo> ListaDEquipos;
    private LinkedHashMap<String,Deportista> ListaDDeportista;
    public Ingreso_Deportista(LinkedHashMap ListaDEquipos,LinkedHashMap ListaDDeportistas) {
        this.ListaDDeportista = ListaDDeportista;
        this.ListaDEquipos = ListaDEquipos;
        initComponents();
    }

    private Ingreso_Deportista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Disciplina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nivel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CB_EQUIPO = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setText("Cedula");
        getContentPane().add(jLabel1);
        getContentPane().add(Cedula);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        getContentPane().add(Nombre);

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3);
        getContentPane().add(Apellido);

        jLabel4.setText("Discplina");
        getContentPane().add(jLabel4);
        getContentPane().add(Disciplina);

        jLabel5.setText("Nivel");
        getContentPane().add(jLabel5);
        getContentPane().add(Nivel);

        jLabel7.setText("Equipo");
        getContentPane().add(jLabel7);

        CB_EQUIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CB_EQUIPO);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Equipo aux1 = ListaDEquipos.get(CB_EQUIPO.getSelectedItem().toString());
        Deportista aux=new Deportista(Cedula.getText(),Nombre.getText(),Apellido.getText(),Disciplina.getText(),Nivel.getText(),aux1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] Lista = new String[ListaDEquipos.size()];
        int j=0;
        for (Equipo Grupos:ListaDEquipos.values()) 
        {
            Lista[j++] = Grupos.Codigo() ;
        }
    
        CB_EQUIPO.setModel(new DefaultComboBoxModel<>(Lista));
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Deportista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JComboBox<String> CB_EQUIPO;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Disciplina;
    private javax.swing.JTextField Nivel;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
