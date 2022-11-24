import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Doctores doctores = new Doctores();
        int num;

        doctores.load();

        do{
            System.out.println("Selecciona una opcion: ");
            System.out.println("1 Alta doctor");
            System.out.println("2 Alta paciente");
            System.out.println("3 Alta cita");
            System.out.println("4 Lista doctores");
            System.out.println("5 Lista pacientes");
            System.out.println("6 Lista citas");
            System.out.println("7 Salir");

            num = scan.nextInt();

            switch (num) {
                case 1:
                    doctores.list();
                    break;
                case 2:
                    System.out.println("Numero de contacto: ");
                    String numero = scan.next();
                    System.out.println("Nombre de contacto: ");
                    String nombre = scan.next();
                    doctores.create(numero, nombre);
                    break;
                case 3:
                    System.out.println("Numero de contacto: ");
                    String number = scan.next();
                    doctores.delete(number);
                    break;
                case 4:
                    break;
            }
        }while(num != 4);

        doctores.save(doctores.Doctor);
    }
}