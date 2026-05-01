abstract public class PersonaAcademica {
    private String nombre;
    private String codigo;
    private int edad;

    public PersonaAcademica(String nombre, String codigo, int edad) {
        setNombre(nombre);
        setCodigo(codigo);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18) {
            this.edad = edad;
        }
    }
    abstract public double calcularPago();
    
    public double calcularPago(double extra){
        return calcularPago() + extra;
    }
    public void describirRol(){
        System.out.println("Academico.");
    }
    public void mostrarDAtos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Edad: " + edad);
        System.out.printf("Rol: ");
        describirRol();
    }
}

