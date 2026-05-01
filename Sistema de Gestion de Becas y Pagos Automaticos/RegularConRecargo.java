public class RegularConRecargo extends EstudianteRegular{
    private double recargoPendiente;
    public RegularConRecargo(String nombre,String codigo,double promedio,double valorMatricula,int numeroMaterias,double recargosPendiente){
        super(nombre,codigo,promedio,valorMatricula,numeroMaterias);
        setRecargoPendiente(recargoPendiente);
    }
    @Override
    public double calcularPagoFinal(){
        return recargoPendiente + (getValorMatricula() + getNumeroMaterias() *10);
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