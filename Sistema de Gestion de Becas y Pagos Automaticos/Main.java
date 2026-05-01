import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Código: ");
        String cod = sc.nextLine();
        System.out.print("Promedio: ");
        double prom = sc.nextDouble();
        System.out.print("Matrícula: ");
        double valor = sc.nextDouble();
        sc.nextLine();
 
        Estudiante es1 = null;

        System.out.println("¿Es becado? (si/no)");
        String tipoEstudiante = sc.nextLine();

        if (tipoEstudiante.equalsIgnoreCase("si")) {
            System.out.print("Porcentaje Beca: ");
            double porc = sc.nextDouble();

            if (prom >= 9) {
                System.out.print("Bono Excelencia: ");
                double bono = sc.nextDouble();
                es1 = new BecadoExcelencia(nombre, cod, prom, valor, porc, bono);
            } else {
                es1 = new EstudianteBecado(nombre,cod,prom,valor,porc);
            }
        } else {
            System.out.print("Número de materias: ");
            int nMat = sc.nextInt();
            sc.nextLine();
            System.out.println("¿Poseé recargo?(si/no)");
            String recargo = sc.nextLine();
            if(recargo.equalsIgnoreCase("si")){
                System.out.println("Recargo:");
                double bobrecargo = sc.nextDouble();
                es1 = new RegularConRecargo(nombre,cod,prom,valor,nMat,bobrecargo);
            } else {
                es1 = new EstudianteRegular(nombre,cod,prom,valor,nMat);
            }
        }
        listaEstudiantes.add(es1);
            es1.mostrarDatos();
    }
}
