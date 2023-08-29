package models;

public class Estudiante {
    private String id_estudiante;
    private String nombresApellidos;
    private  String codigoEstudiante;
    private String correoElectronico;

    public Estudiante(String id_estudiante, String nombresApellidos, String codigoEstudiante, String correoElectronico) {
        this.id_estudiante = id_estudiante;
        this.nombresApellidos = nombresApellidos;
        this.codigoEstudiante = codigoEstudiante;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Id_estudiante: " + id_estudiante +
                "Nombres y Apellidos: " + nombresApellidos +
                ", Código de Estudiante: " + codigoEstudiante +
                ", Correo Electrónico: " + correoElectronico;
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
