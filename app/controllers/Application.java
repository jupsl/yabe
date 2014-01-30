package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
       // System.out.println("entro al blog");
        //guardar en un archivo LOG FILE
        //Logger.info("Entro a La Aplicacion");
        //pedir los post de todos los usuarios
        List<Post> olderPost= Post.find(" order by postedAt desc").from(1).fetch(10);
        Post frontPost = Post.find(" order by postedAt desc").first();
        render(frontPost,olderPost);
    }

}