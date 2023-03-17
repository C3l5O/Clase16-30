package Modelo;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ModeloPacientes {
    Queue<Pacientes> ListaPacientes = new LinkedList();
    public void EncolarPaciente(String apellido, String nombre){
        Pacientes nuevoPaciente = new Pacientes(apellido, nombre);
        this.ListaPacientes.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO");
    }
    public Queue ListarPaciente(){
        return this.ListarPaciente();
    }

}
