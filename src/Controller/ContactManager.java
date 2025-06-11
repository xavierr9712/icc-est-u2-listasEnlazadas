package Controller;

import Model.Contact;     
import Model.LinkedList;  
import Model.Node;        

public class ContactManager {
    private LinkedList<Contact> contacts; 
  
    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

   
    public void addContact(Contact contact) { 
        this.contacts.appendToTail(contact); 
        System.out.println("Contacto agregado: " + contact.getName()); 
    }

    
    public Contact findContactByName(String name) {
        Node<Contact> current = contacts.getHead(); 
        while (current != null) {
            
            if (current.getValue().getName().equals(name)) {
                return current.getValue(); 
            }
            current = current.getNext(); 
        }
        return null; 
    }

   
    public boolean deleteContactByName(String name) {
       
        Contact contactToDelete = findContactByName(name);
        if (contactToDelete != null) {
            
            boolean deleted = contacts.deleteByValue(contactToDelete);
            if (deleted) {
                System.out.println("Contacto eliminado: " + name); 
            }
            return deleted; 
        }
        System.out.println("No se encontro el contacto para eliminar: " + name); 
        return false; 
    }

    
     
    public void printList() {
        System.out.println("\n--- Lista de contactos ---"); 
        contacts.print(); 
        System.out.println("--------------------\n"); 
    }
}
