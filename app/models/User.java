/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Table;

/**
 *
 * @author juan
 */
@Entity
@Table(name="Usuarios")
public class User extends Model {
    public String email;
    public String password;
    public String fullName;
    public Boolean isAdmin;
    
    @OneToMany(mappedBy="autor",cascade=CascadeType.ALL)
    public List<Post> posts;
    public User(String email, String password, String fullName,Boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.isAdmin=isAdmin;
    }
    public static User validateUserAndPassword(String user,String pass){
   // Boolean isOk=Boolean.FALSE;
        User usuario=User.find("email=? and password=?", user,pass).first();
    return usuario;
    }

    
    public String toString(){
        return this.fullName;
    }
}
