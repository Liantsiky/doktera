package project.controllers;

import java.util.HashMap;

import etu2050.framework.Modelview;
import etu2050.framework.annotations.Url;

public class DentisteController {
	
	@Url(lien = "test.do",args = false)
	public Modelview test() {
		HashMap<String,Object> o= new HashMap<>();
		Modelview result = new Modelview(o);
		result.addItem("depense", "Hello");
		result.setPageJsp("Test.jsp");
		return result;
	}
}
