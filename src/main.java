
import Controladores.ControllerPaciente;
import Modelo.ModeloPacientes;
import Vistas.frmMedico1;
import Vistas.frmMedico2;
import Vistas.frmVistaPrincipal;


public class main {

    public static void main(String[] args) {
     frmVistaPrincipal VistaPacientes = new frmVistaPrincipal(null, true);
     frmMedico1 VistaMedico1 = new frmMedico1(null, true);
     frmMedico2 VistaMedico2 = new frmMedico2(null, true);
     
     
     ModeloPacientes ModeloVistas = new ModeloPacientes();
     ModeloPacientes ModeloSegundoVistas = new ModeloPacientes();
     ControllerPaciente ControladorLista = new ControllerPaciente(VistaPacientes, VistaMedico1, VistaMedico2, ModeloPacientes);
    }
    
}
