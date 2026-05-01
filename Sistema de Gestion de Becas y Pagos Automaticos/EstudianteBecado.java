public class EstudianteBecado extends Estudiante{
    private double porcentajeBeca;
    public EstudianteBecado(String nombre, String codigo, double precio, double valorMatricula, double porcentajeBecas){
        super(nombre,codigo,precio,valorMatricula);
        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal() {
        return (porcentajeBeca/100 * getValorMatricula()) - getValorMatricula();
    }

    public double getPorcentajeBeca(){
        return porcentajeBeca;
    }
    public void setPorcentajeBeca(double porcentajeBeca){
        if(porcentajeBeca > 0){
            this.porcentajeBeca = porcentajeBeca;
        }else {
            System.out.println("El porcentaje es invalido.");
        }
    }
}