package SistemaClinica;

import java.util.LinkedList;
import java.util.Queue;

public class Clinica {
    private Queue<Paciente> filaMedicinaGeneral;
    private Queue<Paciente> filaOdontologia;
    private Queue<Paciente> filaPediatria;

    public Clinica(){
        this.filaMedicinaGeneral = new LinkedList<>();
        this.filaOdontologia = new LinkedList<>();
        this.filaPediatria = new LinkedList<>();
    }

    public void RegistrarPacientes(String especialidad, Paciente paciente){

        switch (especialidad.toLowerCase()) {
            case "Medicina General":
            filaMedicinaGeneral.offer(paciente);
            System.out.println("Paciente registrado correctamente, en general");    
                break;

                case "Odontologia":
                filaOdontologia.offer(paciente);
                System.out.println("Paciente registrado exitosamente, en odontologia");
                break;

                case "Pediatria":
                filaPediatria.offer(paciente);
                System.out.println("Paciente registrado exitosamente, en pediatria");
            default:
                break;
        }
    }

    public void atenderPacientes(String especialidad){
        Paciente pacienteAtendido = null;

        switch (especialidad) {
            case "Medicina General":
            pacienteAtendido = filaMedicinaGeneral.poll();
                break;

                case "Odontologia":
                pacienteAtendido = filaOdontologia.poll();
                break;

                case "Pediatria":
                pacienteAtendido = filaPediatria.poll();
                break;
            default:
            System.out.println("Especialidad no reconocida");
                return;
        }

        if (pacienteAtendido != null) {
            System.out.println("Atendiendo a " + pacienteAtendido.getNombre() +  " por " + pacienteAtendido.getMotivoConsulta());
            
        }

    }

    public void MostrarEstadoFilas(){
        System.out.println("\nEstado de las filas en espera: ");
        System.out.println("Medicina General " + filaMedicinaGeneral.size() + " paciente en espera");

        for(Paciente p : filaMedicinaGeneral){
            System.out.println("- " + p.getNombre() + "| Motivo consulta " );
        }

    }

}
