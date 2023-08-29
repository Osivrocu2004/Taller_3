package view;

public class View {

    public static final String MENU_PRINCIPAL=
        "=== MENÚ - LISTA ESTUDIANTES PROGRAMACIÓN III ===" + "\n" +
        "1. Acciones para Estudiantes" + "\n" +
        "2. Acciones para Programas" + "\n" +
        "3. Acciones para Asignatura" + "\n"+
        "4. Acciones estudiantes matriculados" + "\n" +
        "0. Salir" + "\n";
    public static final String MENU_ESTUDIANTES=
            "11. Ver estudiantes registrados" + "\n" +
            "12. Registrar un nuevo estudiante" + "\n" +
            "13. Modificar registro de estudiante" + "\n" +
            "14. Eliminar registro de estudiante" + "\n"+
            "9. Salir" + "\n";

    public static final String MENU_PROGRAMA_ACADEMICO =
            "15. Crear programa académico" + "\n" +
            "16. Modificar programa academico" + "\n" +
            "17. Eliminar programa académico" + "\n" +
            "18. Ver programas académicos registrados" + "\n" +
            "8. Salir" + "\n";
    public static final String MENU_ASIGNATURA =
            "19. Crear asignatura" + "\n" +
            "20. Modificar asignatura" + "\n" +
            "21. Eliminar asignatura" + "\n" +
            "22. Ver asignaturas registradas" + "\n"+
            "7. Salir" + "\n";

    public static final String MENU_ESTUDIANTES_MATRICULA =
            "23. Matricular estudiantes en programa" + "\n" +
                    "24. Ver matricula de estudiantes en programa" + "\n" +
                    "25. Eliminar estudiantes matricualados en programa" + "\n" +
                    "26. Matricular estudiantes en asignatura" + "\n" +
                    "27. Ver matricula de estudiantes en asignatura" + "\n" +
                    "28. Eliminar estudiantes matricualados en asignatura" + "\n"+
                    "6. Salir" + "\n";

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
