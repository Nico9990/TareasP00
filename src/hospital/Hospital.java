package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private ValidadorHospital validador =new ValidadorHospital(); //otro atributo pero es un objeto
    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }
    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta){
        //No exista una consulta en la fecha deseada
        if (!validador.validarDisponibilidadEnFechaConsulta(consulta.getFechaHora().toLocalDate(), consulta.getConsultorio().getNumeroConsultorio(),this.listaConsultas)) {
            System.out.println("Ya existe una consulta registradad para esa fecha");
            return;
        }

        if (validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedico().getId(),this.listaConsultas)){
         System.out.println("El medico no tiene disponibilidad para esa fecha ");
         return;
         }
        //this.listaConsultas.add(consulta);
    }
    public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorios.add(consultorio);
    }


    /*SEGUN YO FALTA ESTE
     public void registrarConsulta(Consulta consulta){
        Consulta consulta=new Consulta(1,"2024-08-10",Pac1,Med1,Cons1);
        //Paciente no tenga consulta en esa fecha

    /*
    1.-No existe una consulta en la fecha indicada en el consltorio indicado
    2.-Fecha Valida
    3.-Medico no tenga una consulta en esa fecha en otro consultorio
    4.-Paciente no tenga consulta en esa fecha

        this.listaConsultas.add(consulta);

    }
   SEGUN YO FALTA */

     public void mostrarPacientes(){
         System.out.println("\n Pacientes del hospital");
         for(Paciente paciente : this.listaPacientes){
             System.out.println(paciente.mostrarDatos());
         }

     }

     public String generarIdPaciente() {
         Random random = new Random();
         LocalDate fecha= LocalDate.now();
         int anoActual=fecha.getYear();
         int mesActual= fecha.getMonthValue();
         int longitudPacientesMasUno=this.listaPacientes.size();
         int numeroAleatorio= random.nextInt(1,1000);
         String id=String.format("P%d%d%d%d",anoActual,mesActual,longitudPacientesMasUno,numeroAleatorio);
         return id;
     }
     public void mostrarPacientePorId(String id) {
         //OTRA FORMA DE ESCRIBIR EL CODIGO DE ABAJO DE MANERA DIFERENTE
         //Optional<Paciente> pacienteEncontrado=this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(id)).findFirt();
         // if (pacienteEncontrado.isPresent()){System.out.println(pacienteEncontrado.get().mostrarDatos());
         // }else{System.out.println("No se encontro al paciente"); }

         for(Paciente paciente:this.listaPacientes){
             if(paciente.getId().equals(id)){
                 System.out.println(paciente.mostrarDatos());
                 return;
             }
         }
         System.out.println("Paciente no encontrado");
     }

    public Paciente obtenerPacientePorId(String id) {
return listaPacientes.stream().filter(paciente -> paciente.getId().equals(id)).findFirst().orElse(null);
    }


    public String generarIdMedico(char apellidoMedico,char apellidoMedico1,LocalDate fechadeNacimiento1) {
        Random random = new Random();
        LocalDate fecha= LocalDate.now();
        int anoActual=fecha.getYear();

        int longitudMedicosmasUno=this.listaMedicos.size()+1;  //No me salio este rev luego
        int numeroAleatorio= random.nextInt(1,9);
        String idMedico=String.format("%c%c%c%d%d",apellidoMedico,apellidoMedico1,fechadeNacimiento1,anoActual,numeroAleatorio,longitudMedicosmasUno);
    // M=cadena , c=char ,d=int,
      return idMedico;
    }

    public String generarIdConsultoio() {
        Random random = new Random();
        LocalDate fecha= LocalDate.now();
        int anoActual=fecha.getYear();
        int diaActual=fecha.getDayOfMonth();
        int longitudConsultoriomasUno=this.listaConsultorios.size()+1;  //No me salio este rev luego
        int numeroAleatorio= random.nextInt(1,9);
        String idConsultorio=String.format("%d%d%d%d",longitudConsultoriomasUno,diaActual,anoActual,numeroAleatorio);
        // M=cadena , c=char ,d=int,
        return idConsultorio;
    }

    public void mostrarMedico(){
        System.out.println("\n Medicos del hospital");
        for(Medico medico : this.listaMedicos){
            System.out.println(medico.mostrarDatos());
        }

    }
    public void mostrarConsultorios(){
        System.out.println("\n Consultorios del hospital");
        for(Consultorio consultorio : this.listaConsultorios){
            System.out.println(consultorio.mostrarDatosConsultorio());
        }
        // non static se resolvio en consultorio poniendo todo mnusculas en vez de Consultorio


    }

    public void mostrarMedicoPorId(String idMedico2) {
        for (Medico medico : this.listaMedicos) {
            if (medico.getId().equals(idMedico2)) {
                System.out.println(medico.mostrarDatos());
                return;
            }
        }
        System.out.println("Medico no encontrado");
    }

    public Medico obtenerMedicoPorId(String idMedico1) {
        return listaMedicos.stream().filter(medico -> medico.getId().equals(idMedico1)).findFirst().orElse(null);
    }



    public void mostrarConsultorioPorId(String idConsultorio) {
        for (Consultorio consultorio : this.listaConsultorios) {
            if (consultorio.getId().equals(idConsultorio)) {
                System.out.println(consultorio.mostrarDatosConsultorio());
                return;
            }
        }
        System.out.println("Consultorio no encontrado");
    }


    public Consultorio obtenerConsultorioPorId(String idConsultorio1) {
        return listaConsultorios.stream().filter(consultorio -> consultorio.getId().equals(idConsultorio1)).findFirst().orElse(null);
    }

    public int generarIdConsulta() {
        Random random = new Random();
        LocalDate fecha= LocalDate.now();
        int anoActual=fecha.getYear();
        int diaActual=fecha.getDayOfMonth();

        int numeroAleatorio= random.nextInt(1,100000);
        int idConsulta = Integer.parseInt(String.format("%d%d%d", diaActual, anoActual, numeroAleatorio));
        // M=cadena , c=char ,d=int,
        return idConsulta;
    }
}
