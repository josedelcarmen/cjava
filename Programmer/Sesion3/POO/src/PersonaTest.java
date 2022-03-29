import entidad.Persona;

public class PersonaTest {
    public static void main(String[] args) {
        Persona pepe = new Persona("11223344", "Jose", "Perez");
        Persona juan = new Persona("11223355", "Juan", "Perez");
        Persona ana = new Persona("11223366", "Ana", "Perez");

        System.out.println(pepe);
        System.out.println(juan);
        System.out.println(ana);

    }
}
