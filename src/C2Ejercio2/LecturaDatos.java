package C2Ejercio2;

import C2Ejercio2.models.Fecha;
import C2Ejercio2.models.Operaciones;

import java.util.Scanner;

public class LecturaDatos {
    private static Fecha nacimiento=new Fecha();
    private static Operaciones numeroSuerte=new Operaciones();
    private static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el dia que nacio");
        nacimiento.setDia(entrada.nextInt());
        System.out.println("Ingrese el numero del mes en el que nacio");
        nacimiento.setMes(entrada.nextInt());
        System.out.println("ingrese el año en el que nacio");
        nacimiento.setYear(entrada.nextInt());
        numeroSuerte.suma(nacimiento.getDia(),nacimiento.getMes(),nacimiento.getYear());
    }
}
