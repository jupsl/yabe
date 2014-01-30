/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author juan
 */
@Entity
public class Post extends Model {
    public String title;
    public Date postedAt;
    @ManyToOne
    public User autor;
    @Lob
    public String content;

    @OneToMany(mappedBy="post",cascade=CascadeType.ALL)
    public List<Comment> coments;
    
    public Post(String title, User autor, String content) {
        this.title = title;
        this.postedAt = new Date();
        this.content = content;
        this.autor=autor;
    }
    
}
