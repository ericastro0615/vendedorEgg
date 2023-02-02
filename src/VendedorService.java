import java.util.Date;
import java.util.Scanner;

public class VendedorService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Vendedor altaVendedor() {
        //utilizo el constructor VACIO si no hay parametros
        Vendedor v1 = new Vendedor();

        System.out.println("ingrese el nombre del vendedor");
        v1.setNombre(sc.nextLine());
        System.out.println("Ingrese el DNI");
        v1.setDni(sc.nextInt());
        System.out.println("Ingrese el sueldo basico");
        v1.setSueldoBasico(sc.nextDouble());
        System.out.println("Ingrese el dia de inicio de relación laboral (n°)");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes de inicio de relación laboral (n° ");
        int mes = sc.nextInt();
        System.out.println("ingrese el año de inicio de relación laboral");
        int anio = sc.nextInt();

        Date fecha = new Date(anio - 1990, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    //metodo para calcular sueldo y comisones
    public void sueldoMensual(Vendedor v1) {
        System.out.println("Ventas totales del vendedor");
        Double ventas = sc.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es: " + v1.getSueldoMensual());
    }

    //metodo para calcular la antiguedad -> vacaciones
    public void vacaciones (Vendedor v1) {
        //antiguedad empleado
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println(" le corresponde 14 dias de vacaciones");

        } else if (antiguedad < 10) {
            System.out.println("Le corresponde 21 dias de vacaciones");

        } else if (antiguedad < 20) {
            System.out.println("Le corresponde 28 dias de vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponde 35 dias de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales.");
        }
    }
}