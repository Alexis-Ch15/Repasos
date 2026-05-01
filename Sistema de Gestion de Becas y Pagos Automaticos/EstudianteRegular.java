public class EstudianteRegular extends Estudiante {
    private int numeroMaterias;
    public EstudianteRegular(String nombre, String codigo, double promedio, double valorMatricula, int numeroMaterias) {
        super(nombre, codigo, promedio, valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    @Override
    public double calcularPagoFinal(){
        return getValorMatricula() + (numeroMaterias * 10);
    }
    public int getNumeroMaterias(){
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias){
        if(numeroMaterias > 0){
            this.numeroMaterias = numeroMaterias;
        }
    }
}