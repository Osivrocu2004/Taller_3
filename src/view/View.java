package view;

public class View {

    public static final String MENU_PRINCIPAL=
        "=== MENÚ - LISTA ESTUDIANTES PROGRAMACIÓN III ===" + "\n" +
        "1. Acciones para Estudiantes" + "\n" +
        "2. Acciones para Programas" + "\n" +
        "3. Acciones para Asignatura" + "\n" +
        "0. Salir" + "\n";
    public static final String MENU_ESTUDIANTES= "11. Ver estudiantes registrados" + "\n" +
            "12. Registrar un nuevo estudiante" + "\n" +
            "13. Modificar registro de estudiante" + "\n" +
            "14. Eliminar registro de estudiante" + "\n"+
            "0. Salir" + "\n";

    public static final String MENU_PROGRAMA_ACADEMICO =  "1.5. Crear programa académico" + "\n" +
            "15. Modificar programa academico" + "\n" +
            "16. Eliminar programa académico" + "\n" +
            "17. Ver programas académicos registrados" + "\n" +
            "0. Salir" + "\n";
    public static final String MENU_ASIGNATURA =   "9. Crear asignatura" + "\n" +
            "18. Modificar asignatura" + "\n" +
            "19. Eliminar asignatura" + "\n" +
            "20. Ver asignaturas registradas" + "\n"+
            "0. Salir" + "\n";

    public static final String MENU_ESTUDIANTES_MATRICULA =
            "1.13. Matricular estudiantes en programa" + "\n" +
                    "1.14. Ver matricula de estudiantes en programa" + "\n" +
                    "1.15. Eliminar estudiantes matricualados en programa" + "\n" +
                    "1.16. Matricular estudiantes en asignatura" + "\n" +
                    "1.17. Ver matricula de estudiantes en asignatura" + "\n" +
                    "1.18. Eliminar estudiantes matricualados en asignatura" + "\n"+
                    "0. Salir" + "\n";

    public void showMenu(){
        System.out.println(MENU_PRINCIPAL);
    }
    public void showMenuEstudiantes(){
        System.out.println(MENU_ESTUDIANTES);
    }
    public void showMenuAsignatura(){
        System.out.println(MENU_ASIGNATURA);
    }
    public void showMenuProgramaAcademico(){
        System.out.println(MENU_PROGRAMA_ACADEMICO);
    }
    public void showMenuEstudiantesMatricula(){
        System.out.println(MENU_ESTUDIANTES_MATRICULA);
    }


}
