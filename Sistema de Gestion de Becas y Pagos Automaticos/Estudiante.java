abstract public class Estudiante{
    private String nombre;
    private String codigo;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String nombre, String codigo, double promedio, double valorMatricula){
        setNombre(nombre);
        setCodigo(codigo);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != ""){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre no puede estar vacio");
        }
    }
    public String getCodigo(){
            return codigo;
    }
	public void setCodigo(String codigo) {
        if (codigo != "") {
            this.codigo = codigo;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }
    }
	public double getPromedio(){
            return promedio;
    }
	public void setPromedio(double promedio){
        if(promedio >= 0 && promedio <= 10){
            this.promedio = promedio;
        }else{
            System.out.println("EL promedio esta fuera del rango(0-10)");
        }
    }
	
	public double getValorMatricula(){
        return valorMatricula;
    }
	public void setValorMatricula(double valorMatricula){
        if(valorMatricula > 0){
            this.valorMatricula = valorMatricula;
        }
    }

    public abstract double calcularPagoFinal();

    public double calcularPagoFinal(double descuento){
        return this.calcularPagoFinal() - descuento;
    }
    public void mostrarDatos(){
        double pagoFinal = calcularPagoFinal();
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matricula: $" + valorMatricula);
        System.out.println("Pago final: $" + pagoFinal);
    }

}