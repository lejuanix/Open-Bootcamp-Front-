class temaNueve {
    public static void main(String[] arg){
        cliente individuo = new cliente();
        individuo.setEdad(29);
        individuo.setNombre("Juan");
        individuo.setTelefono(44444433);
        individuo.setCredito(8817281.82f);

        System.out.println(individuo.getEdad());
        System.out.println(individuo.getNombre());
        System.out.println(individuo.getTelefono());
        System.out.println(individuo.getCredito());
    }
}
class persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class cliente extends persona {
    private float credito;

    public void setCredito(float credito){
        this.credito = credito;
    }
    public float getCredito(){
        return this.credito;
    }
}

class trabajador extends persona {
    private float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }
}
