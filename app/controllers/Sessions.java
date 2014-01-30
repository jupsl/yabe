/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.User;
import play.mvc.Controller;

/**
 *
 * @author juan
 */
public class Sessions extends Controller {
    public static void open(){
        render();
    }
    public static void validate(){
        //Params obtiene los valores contenidos formulario
      String user=  params.get("user");
      String pw= params.get("password");
       // System.out.println("-->"+user+"  "+pw);
        User usuario= User.validateUserAndPassword(user,pw);
        if(usuario==null){
           //llamamos al metodo open y renderizamos  al log in
            open();
        }else{
            session.put("currentUser", usuario.id);
            
            welcome();
        }
        //render();
    }
    public static void welcome(){
       render();
    }
}
