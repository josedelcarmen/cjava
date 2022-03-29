import entidad.Alumno;

public class AlumnoTest {
    public static void main(String[] args) {
        Alumno maria = new Alumno("11220011", "María", "Paz",
                100, 16.75);
        Alumno ale = new Alumno("11220022", "Alejandra", "Rios",
                105, 18.25);
        System.out.println(maria);
        System.out.println(ale);
    }
}
