package Controller;

import Model.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        int choice;
        do {
            consoleView.displayMenu();
            String input = consoleView.getInput("");
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                consoleView.showMessage("Entrada no valida, porfavor introdusca un numero.");
                choice = -1; 
                continue;
            }

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    consoleView.showMessage("Saliendo del sistema, adios!");
                    break;
                default:
                    consoleView.showMessage("Opcion no valida intentelo de nuevo.");
            }
        } while (choice != 5);

        consoleView.closeScanner(); 
    }

    public void addContact() {
        String name = consoleView.getInput("Introdusca el nombre del contacto: ");
        String phone = consoleView.getInput("Introduca el telefono del contacto: ");
        Contact newContact = new Contact(name, phone);
        contactManager.addContact(newContact);
    }

    public void findContact() {
        String name = consoleView.getInput("Introduzca el nombre del contacto a buscar: ");
        Contact foundContact = contactManager.findContactByName(name);
        if (foundContact != null) {
            consoleView.showMessage("Contacto Encontrado: " + foundContact);
        } else {
            consoleView.showMessage("Contacto '" + name + "' no encontrado.");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Introduzca el nombre del contacto que desea eliminar: ");
        contactManager.deleteContactByName(name);
    }

    public void printList() {
        contactManager.printList();
    }
}