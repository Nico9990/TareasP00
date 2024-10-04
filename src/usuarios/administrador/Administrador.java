package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    private String rfc;
    public Double sueldo;
    public int aniosTrabajados;

    public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contrasenia, Rol rol, int aniosTrabajados, Double sueldo, String rfc) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, rol);
        this.aniosTrabajados = aniosTrabajados;
        this.sueldo = sueldo;
        this.rfc = rfc;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }
}
