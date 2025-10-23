import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        BilleteraParque B1 = new BilleteraParque(100);
        Scanner scanner = new Scanner(System.in);
        ArrayList <Premio> premios = new ArrayList<>();
        premios.add(new Premio("Camiseta", 150));
        premios.add(new Premio("Sombrero", 350));
        premios.add(new Premio("Tenis", 600));

        int valor = 0;

        while (valor != 5){
            System.out.println("\n--- Menu ---");
            Main.mostrarMenu();
            System.out.println("Tu billetera tiene: " + B1.getTickets() + " tickets");
            System.out.print("Ingrese la opcion: ");
            valor = scanner.nextInt();

            switch (valor){
                case 1:
                    System.out.print("Ingrese la cantidad de tickets a agregar: ");
                    int agregar = scanner.nextInt();
                    B1.agregarTickets(agregar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de tickets a establecer: ");
                    int establecer = scanner.nextInt();
                    B1.setTickets(establecer);
                    break;

                case 3:
                    int aux = 1;
                    if ( BilleteraParque.getFestivo()) {
                        System.out.println("¡Precios de vacaciones!");
                    }
                    for( Premio p : premios ) {
                        System.out.println(aux + ". " + p.toString(BilleteraParque.getFestivo()) );
                        aux++;
                    }

                    System.out.println("¿Que premio desea comprar?: ");
                    aux = scanner.nextInt();
                    Premio seleccionado = premios.get(aux - 1);
                    int costo = seleccionado.getCostoTickets(BilleteraParque.getFestivo());

                    if ( B1.removerTickets(costo) ) {
                        System.out.println("Has comprado: " + seleccionado.getNombre());
                    } else {
                        System.out.println("No tienes suficientes tickets para comprar este premio.");
                    }
                    break;
                case 4:
                    BilleteraParque.setFestivo();
                    if ( BilleteraParque.getFestivo()) {
                        System.out.println("Ahora es un dia festivo.");
                    }
                    else {
                        System.out.println("Ya no es un dia festivo.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
        }

    }

    public static void mostrarMenu() {
        System.out.println("1. Agregar tickets\n2. Establecer tickets\n3. Comprar premio\n4. Establecer festivo\n5. Salir");
    }

}