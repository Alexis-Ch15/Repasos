public class EstudianteBecado extends Estudiante{
    private double porcentajeBeca;
    public EstudianteBecado(String nombre, String codigo, double promedio, double valorMatricula, double porcentajeBeca) {
        super(nombre, codigo, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }
    @Override
    public double calcularPagoFinal () {
        return getValorMatricula() - (getValorMatricula() * porcentajeBeca / 100);
    }
    public double getPorcentajeBeca () {
        return porcentajeBeca;
    }
    public void setPorcentajeBeca( double porcentajeBeca){
        if (porcentajeBeca > 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("El porcentaje es invalido.");
        }
    }
}
