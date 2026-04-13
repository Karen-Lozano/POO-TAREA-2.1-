class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // usamos validación
    }

    // Get
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    // Set
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }
    public void mostrar() {
        System.out.println(nombre + " - " + edad + " años");
    }
}