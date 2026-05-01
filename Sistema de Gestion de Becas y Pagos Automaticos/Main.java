import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Código: ");
        String cod = sc.nextLine();
        System.out.print("Promedio: ");
        double prom = sc.nextDouble();
        System.out.print("Matrícula: ");
        double mat = sc.nextDouble();
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
                es1 = new BecadoExcelencia(nom, cod, prom, mat, porc, bono);
            } else {
                es1 = new EstudianteBecado(nom, cod, prom, mat, porc);
            }
        } else {
            System.out.print("Número de materias: ");
            int nMat = sc.nextInt();
        }
        listaEstudiantes.add(es1);
            es1.mostrarDatos();
    }
}