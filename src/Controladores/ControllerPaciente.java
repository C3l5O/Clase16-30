package Controladores;

import Modelo.ModeloPacientes;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPaciente implements ActionListener {
    frmVistaPrincipal Vistas;
    ModeloPacientes ModeloLista;
    
    public ControllerPaciente(frmVistaPrincipal V1, ModeloPacientes ModeloLista){
        this.Vistas = V1;
        this.ModeloLista = ModeloLista;
        
        this.Vistas.btnAgregarMedico1.addActionListener(this);
        this.Vistas.btnAgregarMedico2.addActionListener(this);
        this.Vistas.btnAgregarPaciente1.addActionListener(this);
        this.Vistas.btnAgragarPaciente2.addActionListener(this);
        
        this.Vistas.setLocationRelativeTo(null);
        this.Vistas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.Vistas){
            
        }
    }
    
}
