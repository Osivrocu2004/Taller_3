package models;

import java.util.ArrayList;
import java.util.List;

public class ProgramaAcademico {
    private String nombre_programa;
    private String codigo_SNIES;
    private List<Asignatura> asignaturas_programa; // Nueva lista para asignaturas de programa
    private List<Estudiante> estudiantes_matriculados_programa; // Nueva lista para estudiantes matriculados

    public ProgramaAcademico(String nombre_programa, String codigo_SNIES) {
        this.nombre_programa = nombre_programa;
        this.codigo_SNIES = codigo_SNIES;
        this.asignaturas_programa = new ArrayList<>(); // Inicialización de la lista
        this.estudiantes_matriculados_programa = new ArrayList<>(); // Inicialización de la lista
    }


    public void Asignaturas_programa(Asignatura asignatura) {
        asignaturas_programa.add(asignatura);
    }

    public void Estudiantes_matriculados_programa(Estudiante estudiante) {
        estudiantes_matriculados_programa.add(estudiante);
    }

    @Override
    public String toString() {
        return "Nombre del programa académico: " + nombre_programa
                + ", Código SNIES programa: " + codigo_SNIES;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public String getCodigo_SNIES() {
        return codigo_SNIES;
    }

    public List<Asignatura> getAsignaturas_programa() {
        return asignaturas_programa;
    }

    public List<Estudiante> getEstudiantes_matriculados_programa() {
        return estudiantes_matriculados_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }

    public void setCodigo_SNIES(String codigo_SNIES) {
        this.codigo_SNIES = codigo_SNIES;
    }

    public void setAsignaturas_programa(List<Asignatura> asignaturas_programa) {
        this.asignaturas_programa = asignaturas_programa;
    }

    public void setEstudiantes_matriculados_programa(List<Estudiante> estudiantes_matriculados_programa) {
        this.estudiantes_matriculados_programa = estudiantes_matriculados_programa;
    }
}
