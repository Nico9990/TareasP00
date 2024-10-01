package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {
    public int id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public Consulta(int id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    /*public String mostrarInformacion12(){
        String info=String.format("Id:%d,fecha:%s,Id paciente:%s,nombre paciente:%s,id medico:%s,piso consultorio:%d,numero consultorio:%d",
                id,fechaHora.toString(),paciente.getId(),paciente.getNombre(),medico.getId(),medico.getNombre(),consultorio.getPiso(),consultorio.getNumeroConsultorio());
        return info;
    }*/

    public void mostrarInformacion() {
        System.out.println("Id: " + id +
                ", fecha: " + fechaHora +
                ", Id paciente: " + paciente.getId() +
                ", nombre paciente: " + paciente.getNombre() +
                ", id medico: " + medico.getId() +
                ", nombre medico: " + medico.getNombre() +
                ", piso consultorio: " + consultorio.getPiso() +
                ", numero consultorio: " + consultorio.getNumeroConsultorio());
    }
}
