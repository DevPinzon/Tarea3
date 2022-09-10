public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Deyby");
        persona.setEdad(28);
        persona.setTelefono("+57 315-881-28-88");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Telefono: "+persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(String  telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

}