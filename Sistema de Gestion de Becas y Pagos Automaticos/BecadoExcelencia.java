public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;

    public BecadoExcelencia(String nombre, String codigo, double promedio, double valorMatricula, double porcentajeBeca,double bonoExcenlencia){
        super(nombre,codigo,promedio,valorMatricula,porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }
    @Override
    public double calcularPagoFinal(){
        return ((bonoExcelencia+ getPorcentajeBeca())/100) * getValorMatricula() - getValorMatricula();
    }
    public void setBonoExcelencia(double bonoExcelencia){
        if(bonoExcelencia > 0){
            this.bonoExcelencia = bonoExcelencia;
        }
    }
}