package View;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n--- Sistema de gestión de contactos ---");
        System.out.println("1. Añadir Contactos");
        System.out.println("2. Buscar Contactos");
        System.out.println("3. eliminar Contactos");
        System.out.println("4. Inprimir todos los Contactos");
        System.out.println("5. Salir");
        System.out.print("Elegit una opcion: ");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}