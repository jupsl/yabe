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

/**
 *
 * @author juan
 */
@Entity
public class Comment extends Model{
    public String autor;
    public Date postedAt;
    @Lob
    public String content;
    
    @ManyToOne
    public Post post;

    public Comment(String autor, String content, Post post) {
        this.autor = autor;
        this.content = content;
        this.post = post;
        this.postedAt=new Date();
    }
    
    
}
