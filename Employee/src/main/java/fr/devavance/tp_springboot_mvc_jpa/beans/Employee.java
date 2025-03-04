package fr.devavance.tp_springboot_mvc_jpa.beans;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    long id;

    private String name;
    private String address;
    private String email;
    private String phone;
    private Fonction fonction;


    public Employee() {

    }
    public Employee(String name, String email, String phone, String address, Fonction fonction) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fonction = fonction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public void setId(Long id) { this.id = id;};

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public long getId() {
        return id;
    }
}