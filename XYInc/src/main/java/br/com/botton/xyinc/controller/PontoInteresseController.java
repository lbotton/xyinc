package br.com.botton.xyinc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.botton.xyinc.entity.GPSCoordinate;
import br.com.botton.xyinc.entity.PontoInteresse;

@Controller
public class PontoInteresseController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String newPontoInteresse(Model model) {
		PontoInteresse pontoInteresse = new PontoInteresse();
		model.addAttribute("pontoInteresse", pontoInteresse);
		return "new";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Model model) {
		GPSCoordinate coordinate = new GPSCoordinate();
		model.addAttribute("coordinate", coordinate);
		return "find";
	}
	
}
