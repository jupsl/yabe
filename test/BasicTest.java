import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
        
    }
    @Test
    public void creatAndRetriveUser(){
    //Crear un usuario y guardarlo
        User usuario = new User("juan1985", "secret","Juan Pablo Segovia", Boolean.FALSE);
        usuario.save();
       // User usuarioTest =User.find("email=?", "juan1985").first();
         User usuarioTest =User.find("byEmailAndPassword", "juan1985","secret").first();
        
        assertNotNull(usuarioTest);
        assertEquals("Juan Pablo Segovia", usuarioTest.fullName);
        Post post = new Post("un  post de demostracion",usuario,"una hermosa mañana blablablablabla");
        post.save();
    }

}
