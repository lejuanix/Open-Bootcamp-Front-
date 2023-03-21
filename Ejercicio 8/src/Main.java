public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Juan");
        persona.setEdad(3);
        persona.setTelefono(33033);
        System.out.println("Persona:\n" +
                "Nombre:"+persona.getNombre()+
                "\nEdad:"+persona.getEdad()+
                "\nTelefono:"+persona.getTelefono());
    }

}
class Persona{
    private int edad, telefono;
    private String nombre;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
