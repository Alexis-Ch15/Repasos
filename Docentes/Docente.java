public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;
    public Docente(String nombre,String codigo,int edad, int horasClase,double valorHora){
        super(nombre, codigo, edad);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }
    @Override
    public double calcularPago(){
        return getHorasClase() * getValorHora();
    }

    @Override
    public void describirRol() {
        System.out.println("Docente");
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0){
        this.valorHora = valorHora;
        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        if(horasClase > 0 &&horasClase<=40){
            this.horasClase = horasClase;
        }
    }
    public void mostrarDAtos(){
        super.mostrarDAtos();
        System.out.println("Horas Laborales: " + getHorasClase());
        System.out.println("Costo por hora: " + getValorHora());
    }
}

