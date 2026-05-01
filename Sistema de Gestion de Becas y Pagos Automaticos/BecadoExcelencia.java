public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;

    public BecadoExcelencia(String nombre, String codigo, double promedio, double valorMatricula, double porcentajeBeca,double bonoExcelencia){
        super(nombre,codigo,promedio,valorMatricula,porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }
    @Override
    public double calcularPagoFinal(){
        return super.calcularPagoFinal() - bonoExcelencia;
    }
    public void setBonoExcelencia(double bonoExcelencia){
        if(bonoExcelencia > 0){
            this.bonoExcelencia = bonoExcelencia;
        }
    }
}
