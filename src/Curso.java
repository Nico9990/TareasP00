public class Curso {

    //atributos
    public String nombreCurso;
    public String codigoCurso;
    public String instructor;


    //metodos
    public Curso (String nombreCurso, String codigoCurso, String instructor){
        this.nombreCurso=nombreCurso;
        this.codigoCurso=codigoCurso;
        this.instructor=instructor;
    }

    public void mostrarInfoCurso(){
        System.out.println("Curso:"+nombreCurso);
        System.out.println("Codigo:"+codigoCurso);
        System.out.println("Instructor: " + instructor + "\n");

    }
}
