import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro Docente Investigador.");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Horas Clase: ");
        int horaClase = sc.nextInt();
        System.out.println("Costo de hora:");
        double valorHora = sc.nextInt();
        System.out.println("Numero de publicaciones: ");
        int npublicaciones = sc.nextInt();

        PersonaAcademica trabajador1 = new DocenteInvestigador(nombre,codigo,edad,horaClase,valorHora,npublicaciones);
        trabajador1.mostrarDAtos();

        System.out.println("Pago final: " + trabajador1.calcularPago());
        System.out.println("Ingrese bono adicional: ");
        double bono = sc.nextDouble();
        System.out.println("Sueldo Final con bono: " + trabajador1.calcularPago(bono));
    }
}