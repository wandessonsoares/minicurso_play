package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class CarrosController extends Controller{
	
	public static Result home() {
        return ok(views.html.home.render());
    }

}
