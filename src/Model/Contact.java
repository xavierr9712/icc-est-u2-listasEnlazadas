// package Model;

// public class Contact {
    
//     private String name;
//     private String phone;


//     public Contact(String name, String phone) {
//         this.name = name;
//         this.phone = phone;
//     }


//     public Contact(String name) {
//         this.name = name;
        
//     }

//     public String getName() {
//         return name;
//     }


//     public void setName(String name) {
//         this.name = name;
//     }


//     public String getPhone() {
//         return phone;
//     }


//     public void setPhone(String phone) {
//         this.phone = phone;
//     }


//     @Override
//     public String toString() {
//         return "Contact [name=" + name + ", phone=" + phone + "]";
//     }
    
    
// }

package Model;

public class Contact<T, U> {
    private T name;
    private U phone;

    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPhone() {
        return phone;
    }

    public void setPhone(U phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone;
    }
}
