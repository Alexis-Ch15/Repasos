public class RegularConRecargo extends EstudianteRegular{
    private double recargoPendiente;
    public RegularConRecargo(String nombre,String codigo,double promedio,double valorMatricula,int numeroMaterias,double recargoPendiente){
        super(nombre,codigo,promedio,valorMatricula,numeroMaterias);
        setRecargoPendiente(recargoPendiente);
    }
    @Override
    public double calcularPagoFinal(){
        return super.calcularPagoFinal() + recargoPendiente;
    }
    public void setRecargoPendiente(double recargoPendiente){
        if(recargoPendiente > 0){
            this.recargoPendiente = recargoPendiente;
        }
    }
    public double getRecargoPendiente(){
        return recargoPendiente;
    }
}
