package entidad;  // Los paquetes siempre con minúsculas

public class Persona { // Las clases inician con mayúscula
    /* PROPIEDADES: Campos = Atributos */
    /* Variables de Clase */
    public static int ultimoID = 0;
    /* Variables de Instancia */
    private int id;
    private String dni; // Acceso directo prohibido desde afuera
    private String nombres, apellidos;

    /* METODOS: Operaciones, mensajes */

    /* Métodos Constructores: Crean objetos o instancias de clase,
    tienen el mismo nombre de la clase y no tienen tipo */

    public Persona() { // Constructor por defecto
        ultimoID++; this.id = ultimoID;
    }

    public Persona(String dni) {
        this();
        this.dni = dni;
    }

    public Persona(String dni, String nombres, String apellidos) {
        this();
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    /* Métodos accesores: permiten acceder a las
                variables de instancia desde afuera de la clase */

    public int getId() { // Obtener el valor
        return id;
    }

    public void setId(int id) { // Cambiar el valor
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /* Métodos de objeto: se heredan de Object */
    @Override
    public String toString() {
        return "id = " + id + ", dni = " + dni +
                ", nombres = " + nombres + ", apellidos = " + apellidos;
    }
}
