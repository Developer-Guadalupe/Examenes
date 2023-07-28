public class Estudiantes {

    public static void main(String[] args) {


        //Registros de estudiantes, usando el mismo objeto
        RegistroEstudiante e1 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e2 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e3 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e4 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e5 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e6 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e7 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e8 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e9 = RegistroEstudiante.getObtenerRegistro();
        RegistroEstudiante e10 = RegistroEstudiante.getObtenerRegistro();

        //Siempre debe retornar 1
        System.out.println(RegistroEstudiante.getTotalRegistros());

    }

}
