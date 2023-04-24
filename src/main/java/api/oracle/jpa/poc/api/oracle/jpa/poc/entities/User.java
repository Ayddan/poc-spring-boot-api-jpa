package api.oracle.jpa.poc.api.oracle.jpa.poc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="API_USER")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;

    protected User() {}

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    @Override
    public String toString(){
        return String.format("User[id=%d, email='%s', password='%s']", id,email,password);
    }

    public Long getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
}
