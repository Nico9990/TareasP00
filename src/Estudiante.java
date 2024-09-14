public class Estudiante {

    //atributos
    public String nombre;
    public String idEstudiante;
    public String [] cursos;
    public int numero;

      public Estudiante (String nombre, String idEstudiante){
          this.nombre=nombre;
        this.idEstudiante=idEstudiante ;
        this.cursos=new String [3];
        this.numero=0;
    }

    //metodos

    public void agregarCurso(String curso){
        if (numero < cursos.length) {
            cursos [numero] = curso;
            numero++;
        } else {
            System.out.println("No puedes agregar más cursos.");
        }

    }
    public void mostrarInformacion(){
        System.out.println("nombre"+nombre);
        System.out.println("id"+idEstudiante);
        System.out.println("cursos");
        for(int i=0;i<cursos.length;i++){
             System.out.println(cursos[i]);
        }
    }
}
