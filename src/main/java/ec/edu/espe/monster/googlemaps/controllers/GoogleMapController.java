package ec.edu.espe.monster.googlemaps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoogleMapController {

	@GetMapping("maps/index")
	public String index() {
		return "maps/index";
	}
}
