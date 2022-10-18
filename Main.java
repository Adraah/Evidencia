import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecciona una opcion: ");
        System.out.println("1 Crear cita");
        System.out.println("2 Alta cita");
        System.out.println("3 Alta doctor");
        System.out.println("4 Get doctores");
        System.out.println("5 Get pacientes");
        System.out.println("6 Get citas");
        System.out.println("7 Guardar");
        System.out.println("0 Salir");

        int num = scan.nextInt();

        switch (num){
            case 0:
                break;
            case 1:
                System.out.println("Crear cita");
                break;
            case 2:
                System.out.println("Alta cita");
                break;
            case 3:
                System.out.println("Alta doctor");
                break;
            case 4:
                System.out.println("Get doctores");
                break;
            case 5:
                System.out.println("Get pacientes");
                break;
            case 6:
                System.out.println("Get citas");
                break;
            case 7:
                System.out.println("Guardar");
                break;
            case default:
                System.out.println("Opcion no valida");
                showMenu();
                break;
        }
    }
}