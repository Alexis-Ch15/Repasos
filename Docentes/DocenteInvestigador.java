public class DocenteInvestigador extends Docente{
    private int publicaciones;
    public DocenteInvestigador(String nombre,String codigo,int edad,int horasClase,double valorHora, int publicaciones){
        super(nombre, codigo, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);

    }
    public double bono(){
       return publicaciones * 20;
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }

    @Override
    public void describirRol() {
        System.out.println("DocenteInvestigador");
    }

    @Override
    public double calcularPago(){
        return bono() + super.calcularPago();
    }
    public double calcularPago(double extra){
        double base = calcularPago();
        return  base + extra;
    }
    public void mostrarDAtos(){
        super.mostrarDAtos();
        System.out.println("Publicaciones: "+ publicaciones);
        System.out.println("Bono por publicaciones: " + bono());
    }
}

